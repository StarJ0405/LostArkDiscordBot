package com.StarJ.LostArkDiscordBot.Listeners;

import com.StarJ.LostArkDiscordBot.*;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.selections.SelectOption;
import net.dv8tion.jda.api.interactions.components.selections.StringSelectMenu;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InteractionListener extends ListenerAdapter {
    @Override
    public void onButtonInteraction(@NotNull ButtonInteractionEvent event) {
        Guild guild = event.getGuild();
        Member member = event.getMember();
        switch (Objects.requireNonNull(event.getButton().getId())) {
            case "role": {
                List<MessageStore.StringSelect> list = new ArrayList<>();
                for (ServerEmoji emoji : ServerEmoji.values())
                    list.add(MessageStore.StringSelect.getRole(guild, emoji, Objects.requireNonNull(member)));
                StringSelectMenu serverMenu = MessageStore.getStringSelectMenu("server", "본인 서버를 골라주세요", list.toArray(MessageStore.StringSelect[]::new));

                list = new ArrayList<>();
                for (JobEmoji emoji : JobType.getJob1())
                    list.add(MessageStore.StringSelect.getRole(guild, emoji, true, Objects.requireNonNull(member)));
                StringSelectMenu mainMenu1 = MessageStore.getStringSelectMenu("mainRole1", "본인의 본직업(슈사,실린,애니츠)을 골라주세요!", list.toArray(MessageStore.StringSelect[]::new));
                list = new ArrayList<>();
                for (JobEmoji emoji : JobType.getJob2())
                    list.add(MessageStore.StringSelect.getRole(guild, emoji, true, Objects.requireNonNull(member)));
                StringSelectMenu mainMenu2 = MessageStore.getStringSelectMenu("mainRole2", "본인의 본직업(데런,요즈,아르덴)을 골라주세요!", list.toArray(MessageStore.StringSelect[]::new));
                list = new ArrayList<>();
                for (JobEmoji emoji : JobType.getJob1())
                    list.add(MessageStore.StringSelect.getRole(guild, emoji, false, Objects.requireNonNull(member)));
                StringSelectMenu subMenu1 = MessageStore.getStringSelectMenu("subRole1", "본인의 보조 직업들(슈사,실린,애니츠)을 골라주세요!", list.size(), list.toArray(MessageStore.StringSelect[]::new));
                list = new ArrayList<>();
                for (JobEmoji emoji : JobType.getJob2())
                    list.add(MessageStore.StringSelect.getRole(guild, emoji, false, Objects.requireNonNull(member)));
                StringSelectMenu subMenu2 = MessageStore.getStringSelectMenu("subRole2", "본인의 보조 직업들(데런,요즈,아르덴)을 골라주세요!", list.size(), list.toArray(MessageStore.StringSelect[]::new));
                event.reply("").addActionRow(serverMenu).addActionRow(mainMenu1).addActionRow(mainMenu2).addActionRow(subMenu1).addActionRow(subMenu2).setEphemeral(true).queue();
            }
            break;
            case "info":{
                List<MessageStore.StringSelect> list = new ArrayList<>();
                for(Info info : Info.군단장레이드())
                    list.add(MessageStore.StringSelect.getInfo(info));
                StringSelectMenu commnaderMenu = MessageStore.getStringSelectMenu("commander","군단장 정보를 검색하기",list.toArray(MessageStore.StringSelect[]::new));
                event.reply("").addActionRow(commnaderMenu).setEphemeral(true).queue();
            }
            break;
        }
    }

    @Override
    public void onStringSelectInteraction(StringSelectInteractionEvent event) {
        Guild guild = event.getGuild();
        StringSelectMenu menu= event.getSelectMenu();
        switch (Objects.requireNonNull(menu.getId())) {
            case "mainRole1":
            case "mainRole2":{
                List<Role> roles = new ArrayList<>(Objects.requireNonNull(event.getMember()).getRoles());
                roles.removeIf(role -> JobEmoji.isMainRole(role.getName()));
                if(!event.getSelectedOptions().isEmpty()) {
                    SelectOption option = event.getSelectedOptions().get(0);
                    roles.add(Objects.requireNonNull(event.getGuild()).getRoleById(option.getValue()));
                }
                Objects.requireNonNull(guild).modifyMemberRoles(event.getMember(), roles).queue();
                event.getInteraction().deferEdit().queue();
            }
            break;
            case "subRole1": {
                List<Role> roles = new ArrayList<>(Objects.requireNonNull(event.getMember()).getRoles());
                roles.removeIf(role -> JobEmoji.isSubRole(JobType.getJob1(), role.getName()));
                for (SelectOption option : event.getSelectedOptions())
                    roles.add(Objects.requireNonNull(event.getGuild()).getRoleById(option.getValue()));
                Objects.requireNonNull(guild).modifyMemberRoles(event.getMember(), roles).queue();
                event.getInteraction().deferEdit().queue();
            }
            break;
            case "subRole2": {
                List<Role> roles = new ArrayList<>(Objects.requireNonNull(event.getMember()).getRoles());
                roles.removeIf(role -> JobEmoji.isSubRole(JobType.getJob2(), role.getName()));
                for (SelectOption option : event.getSelectedOptions())
                    roles.add(Objects.requireNonNull(event.getGuild()).getRoleById(option.getValue()));
                Objects.requireNonNull(guild).modifyMemberRoles(event.getMember(), roles).queue();
                event.getInteraction().deferEdit().queue();
            }
            break;
            case "server": {
                SelectOption option = event.getSelectedOptions().get(0);
                List<Role> roles = new ArrayList<>(Objects.requireNonNull(event.getMember()).getRoles());
                roles.removeIf(role -> ServerEmoji.isRole(role.getName()));
                roles.add(Objects.requireNonNull(event.getGuild()).getRoleById(option.getValue()));
                Objects.requireNonNull(guild).modifyMemberRoles(event.getMember(), roles).queue();
                event.getInteraction().deferEdit().queue();
            }
            break;
            case "commander":{
                SelectOption option = event.getSelectedOptions().get(0);
                Info info = Info.valueOf(option.getValue());
                event.reply("").addActionRow(info.getMenu()).setEphemeral(true).queue();
                event.getMessage().delete().queue();
            }
            break;
            default:
                try{
                    Info info = Info.valueOf(menu.getId());
                    if(info!=null){
                        SelectOption option =event.getSelectedOptions().get(0);
                        int number = Integer.valueOf(option.getValue());
                        event.reply("").addEmbeds(info.getEmbeds()[number]).setEphemeral(true).queue();
                        event.getMessage().delete().queue();
                    }
                }catch(Exception ex){

                }
                break;
        }
    }
}

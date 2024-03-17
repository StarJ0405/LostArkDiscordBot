package com.StarJ.LostArkDiscordBot.Listeners;

import com.StarJ.LostArkDiscordBot.DataStore.MemoryStore;
import net.dv8tion.jda.api.entities.channel.unions.MessageChannelUnion;
import net.dv8tion.jda.api.events.guild.GuildJoinEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class JoinListener extends ListenerAdapter {
    @Override
    public void onGuildMemberJoin(@NotNull GuildMemberJoinEvent event) {
        MessageChannelUnion channel = MemoryStore.getMainTextChannel(event.getGuild());
        if (channel != null)
            channel.sendMessage(event.getMember().getEffectiveName() + "님이 접속하셨습니다. 모두 반갑게 인사합시다!").queue();
    }

    @Override
    public void onGuildJoin(GuildJoinEvent event) {
//        for (TextChannel chanel : event.getGuild().getTextChannels())
//            if (chanel.getName().equalsIgnoreCase("명령어-테스트용"))
        MessageChannelUnion channel = MemoryStore.getMainTextChannel(event.getGuild());
        if (channel != null)
            channel.sendMessage("이몸이 등장했습니다. 모두 반갑게 인사해줍시다!").queue();
    }
}

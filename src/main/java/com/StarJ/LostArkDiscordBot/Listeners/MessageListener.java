package com.StarJ.LostArkDiscordBot.Listeners;

import com.StarJ.LostArkDiscordBot.DataStore.MemoryStore;
import com.StarJ.LostArkDiscordBot.JobEmoji;
import com.StarJ.LostArkDiscordBot.MessageStore;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.IMentionable;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class MessageListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        Guild guild = event.getGuild();
        String message = event.getMessage().getContentRaw();
        switch (message) {
            case "!직업": {
                StringBuilder value = new StringBuilder();
                for (JobEmoji emoji : JobEmoji.values())
                    value.append(" ").append(emoji.getEmojiText(guild));
                event.getChannel().sendMessage(value.toString()).queue();
            }
            case "!정보": {
                event.getChannel().sendMessage("레이드 정보가 궁금하시나요?").addActionRow(MessageStore.getButton("info", "레이드 정보 얻기")).queue();
            }
            break;
            case "!도움말": {
                event.getChannel().sendMessage("!정보 - 레이드 혹은 가디언 정보를 얻을 수 있습니다!");
            }
            break;
            case "!역할": {
                event.getChannel().sendMessage("@here 여러분들의 역할을 선택해주세요!").addActionRow(MessageStore.getButton("role", "역할 선택 하기")).queue();
            }
            break;
            default: {
                for (IMentionable metion : event.getMessage().getMentions().getMentions(Message.MentionType.USER))
                    if (Objects.requireNonNull(guild.getMemberById(metion.getId())).getEffectiveName().contains("로스트아크 지원 봇")) {
                        event.getChannel().sendMessage(MemoryStore.getReaction(event.getMessage().getContentDisplay())).queue();
                        break;
                    }
            }
            break;
        }
    }

}

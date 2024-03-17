package com.StarJ.LostArkDiscordBot;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.entities.emoji.RichCustomEmoji;

public enum ServerEmoji {
    카단("one"), 카제로스("two"), 실리안("three"), 아브렐슈드("four"), 아만("five"), 루페온("six"), 니나브("seven"), 카마인("eight")
    //
    ;
    private final String emojiName;
    private RichCustomEmoji emoji;
    private Role role;

    ServerEmoji(String emojiName) {
        this.emojiName = emojiName;
        this.emoji = null;
        this.role = null;
    }

    public String getEmojiText(Guild guild) {
        return ":" + emojiName + ":";
    }

    public RichCustomEmoji getEmoji(Guild guild) {
        if (this.emoji == null || !this.emoji.getGuild().equals(guild))
            for (RichCustomEmoji emoji : guild.getEmojisByName(this.name(), false))
                this.emoji = emoji;
        return emoji;
    }

    public Role getRole(Guild guild) {
        if (this.role == null || !this.role.getGuild().equals(guild))
            for (Role role : guild.getRolesByName(this.name(), true))
                this.role = role;
        return this.role;
    }
    public static boolean isRole(String name){
        for(ServerEmoji  serverEmoji : values())
            if(name.equals(serverEmoji.name()))
                return true;
        return false;
    }
}

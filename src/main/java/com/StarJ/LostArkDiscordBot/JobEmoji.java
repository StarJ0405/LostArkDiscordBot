package com.StarJ.LostArkDiscordBot;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.entities.emoji.RichCustomEmoji;

public enum JobEmoji {
    // 실린
    Arcana("아르카나"),
    Bard("바드"),
    Summoner("서머너"),
    Sorceress("소서리스"),
    // 데런
    Blade("블레이드"),
    Demonic("데모닉"),
    Reaper("리퍼"),
    SoulEater("소울이터"),
    // 슈사이어
    Berserker("버서커"),
    HolyKnight("홀리나이트"),
    Destroyer("디스트로이어"),
    WarLord("워로드"),
    Slayer("슬레이어"),
    // 애니츠
    infighter("인파이터"),
    SoulMater("기공사"),
    LanceMaster("창술사"),
    BattleMaster("배틀마스터"),
    Striker("스트라이커"),
    Breaker("브레이커"),
    // 아르데타인
    Scouter("스카우터"),
    HawkEye("호크아이"),
    DevilHunter("데빌헌터"),
    Blaster("블래스터"),
    GunSlinger("건슬링어"),
    //
    Artist_("도화가"),
    Meteorologist("기상술사");
    private final String name;
    private RichCustomEmoji emoji;
    private Role mainRole;
    private Role subRole;

    private JobEmoji(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public RichCustomEmoji getEmoji(Guild guild) {
        if (this.emoji == null || !this.emoji.getGuild().equals(guild))
            for (RichCustomEmoji emoji : guild.getEmojisByName(this.name(), false))
                this.emoji = emoji;
        return emoji;
    }

    public String getEmojiText(Guild guild) {
        if (this.emoji == null || !this.emoji.getGuild().equals(guild))
            for (RichCustomEmoji emoji : guild.getEmojisByName(this.name(), false))
                this.emoji = emoji;
        return this.emoji != null ? emoji.getFormatted() : (":" + this.name() + ":");
    }

    public Role getMainRole(Guild guild) {
        if (this.mainRole == null || !this.mainRole.getGuild().equals(guild))
            for (Role role : guild.getRolesByName(this.name+"(본)",true))
                this.mainRole= role;
        return this.mainRole;
    }

    public Role getSubRole(Guild guild) {
        if (this.subRole == null || !this.subRole.getGuild().equals(guild))
            for (Role role : guild.getRolesByName(this.name,true))
                this.subRole= role;
        return subRole;
    }
    public static boolean isMainRole(String name){
        for(JobEmoji jobEmoji : values())
            if(name.equals(jobEmoji.name+"(본)"))
                return true;
        return false;
    }
    public static boolean isSubRole(JobEmoji[] jobEmojis,  String name){
        for(JobEmoji jobEmoji : jobEmojis)
            if(name.equals(jobEmoji.name))
                return true;
        return false;
    }
}

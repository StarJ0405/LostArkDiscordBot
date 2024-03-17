package com.StarJ.LostArkDiscordBot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum JobType {
    실린 {
        @Override
        public JobEmoji[] getJobEmojis() {
            return new JobEmoji[]{JobEmoji.Bard, JobEmoji.Arcana, JobEmoji.Sorceress, JobEmoji.Summoner};
        }
    }, 아르데타인 {
        @Override
        public JobEmoji[] getJobEmojis() {
            return new JobEmoji[]{JobEmoji.Scouter, JobEmoji.Blaster, JobEmoji.DevilHunter, JobEmoji.HawkEye, JobEmoji.GunSlinger};
        }
    }, 슈사이어 {
        @Override
        public JobEmoji[] getJobEmojis() {
            return new JobEmoji[]{JobEmoji.Berserker, JobEmoji.HolyKnight, JobEmoji.Destroyer, JobEmoji.WarLord, JobEmoji.Slayer};
        }
    }, 애니츠 {
        @Override
        public JobEmoji[] getJobEmojis() {
            return new JobEmoji[]{JobEmoji.LanceMaster, JobEmoji.BattleMaster, JobEmoji.infighter, JobEmoji.SoulMater, JobEmoji.Striker, JobEmoji.Breaker};
        }
    }, 요즈 {
        @Override
        public JobEmoji[] getJobEmojis() {
            return new JobEmoji[]{JobEmoji.Artist_, JobEmoji.Meteorologist};
        }
    }, 데런 {
        @Override
        public JobEmoji[] getJobEmojis() {
            return new JobEmoji[]{JobEmoji.Reaper, JobEmoji.Blade, JobEmoji.SoulEater, JobEmoji.Demonic};
        }
    }

    //
    ;

    public abstract JobEmoji[] getJobEmojis();

    public static JobEmoji[] getJob1() {
        List<JobEmoji> list = new ArrayList<>();
        Collections.addAll(list, 슈사이어.getJobEmojis());
        Collections.addAll(list, 실린.getJobEmojis());
        Collections.addAll(list, 애니츠.getJobEmojis());
        return list.toArray(JobEmoji[]::new);
    }

    public static JobEmoji[] getJob2() {
        List<JobEmoji> list = new ArrayList<>();
        Collections.addAll(list, 데런.getJobEmojis());
        Collections.addAll(list, 요즈.getJobEmojis());
        Collections.addAll(list, 아르데타인.getJobEmojis());
        return list.toArray(JobEmoji[]::new);
    }

}

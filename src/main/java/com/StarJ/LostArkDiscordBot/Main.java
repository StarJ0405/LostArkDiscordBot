package com.StarJ.LostArkDiscordBot;

import com.StarJ.LostArkDiscordBot.DataStore.MemoryStore;
import com.StarJ.LostArkDiscordBot.Listeners.InteractionListener;
import com.StarJ.LostArkDiscordBot.Listeners.JoinListener;
import com.StarJ.LostArkDiscordBot.Listeners.MessageListener;
import net.dv8tion.jda.api.JDA;

public class Main {


    public static void main(String[] args) {
        MemoryStore.getFileStore().Load(); // 데이터 로딩
        JDA jda = MemoryStore.getJda();// 봇 호출
        // 봇 상태
        // 이벤트 추가
        jda.addEventListener(new MessageListener());
        jda.addEventListener(new JoinListener());
        jda.addEventListener(new InteractionListener());
        //
        System.out.println("Bot is online!");
    }
}

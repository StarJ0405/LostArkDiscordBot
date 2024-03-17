package com.StarJ.LostArkDiscordBot.DataStore;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.entities.channel.unions.MessageChannelUnion;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Random;

public class MemoryStore {
    private static final FileStore fileStore = new FileStore();
    private static String mainTextChannelName = "";
    private static MessageChannelUnion mainTextChannel = null;
    private static final LinkedHashMap<String, String[]> reaction = new LinkedHashMap<>();
    private static final HashSet<String> randomReaction = new HashSet<>();
    private static JDA jda;

    //
    public static FileStore getFileStore() {
        return fileStore;
    }

    public static JDA getJda() {
        return jda;
    }

    public static JDA createJda(String botToken) {
        JDABuilder jdaBuilder = JDABuilder.createDefault(botToken);
        jdaBuilder.setAutoReconnect(true);
        jdaBuilder.setActivity(Activity.playing("로스트아크 해야지..?"));
        jdaBuilder.enableIntents(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.values());
        MemoryStore.jda = jdaBuilder.build();
        return jda;
    }

    public static String getMainTextChannelName() {
        return mainTextChannelName;
    }

    public static void setMainTextChannelName(String mainTextChannelName) {
        MemoryStore.mainTextChannelName = mainTextChannelName;
    }

    public static MessageChannelUnion getMainTextChannel(Guild guild) {
        if (mainTextChannel == null || !mainTextChannel.asGuildMessageChannel().getGuild().equals(guild))
            for (TextChannel channel : guild.getTextChannelsByName(mainTextChannelName, true))
                mainTextChannel = (MessageChannelUnion) channel;
        return mainTextChannel;
    }

    public static void setMainTextChannel(MessageChannelUnion mainTextChannel) {
        MemoryStore.mainTextChannel = mainTextChannel;
    }

    public static void addReaction(String keyword, String... answers) {
        reaction.put(keyword, answers);
    }

    public static String getReaction(String chat) {
        for (String keyword : reaction.keySet())
            if (chat.contains(keyword)) {
                String[] answers = reaction.get(keyword);
                return Arrays.stream(answers).skip(new Random().nextInt(answers.length)).findFirst().orElse("");
            }
        return getRandomReaction();
    }
    public static void addRandomReaction(String reaction){
        MemoryStore.randomReaction.add(reaction);
    }
    public static String getRandomReaction(){
        return randomReaction.stream().skip(new Random().nextInt(randomReaction.size())).findFirst().orElse("");
    }
}

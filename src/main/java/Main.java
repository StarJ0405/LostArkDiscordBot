import DataStore.FileStore;
import Listeners.MessageListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main {
    private static final String botToken = "MTIxNzgwMDA3NTUyNzQ1NDc0MA.GbUAOt.IZMlyik3KUhhX8fxNPtgE1g5rrL-VH_KLhjdP0";
    private static final JDA jda = getBot();

    public static void main(String[] args) {
        // 이벤트 추가
        jda.addEventListener(new MessageListener());
        FileStore.Read();
        System.out.println("Bot is online!");
    }
    private static JDA getBot(){
        JDABuilder jdaBuilder = JDABuilder.createDefault(botToken);
        jdaBuilder.setAutoReconnect(true);
        jdaBuilder.enableIntents(GatewayIntent.MESSAGE_CONTENT);
        return jdaBuilder.build();
    }
}

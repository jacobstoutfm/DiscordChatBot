package mainbot;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import javax.security.auth.login.LoginException;
/**
 * Main class for setting up Discord chat bot
 * @author Jacob Stout
 * @version 3/18/22
 */
public class MainDriver
{
    public static void main(String[] args) throws LoginException
    {
        /**
         * In order to utilize this code, you must set up Maven dependencies through JDA.
         * The link for this would be: [https://github.com/DV8FromTheWorld/JDA]
         * You can also just download a JAR file to add to your libraries. The version I used was [4.4.0 with dependencies].
         */
        JDABuilder bot = JDABuilder.createDefault("Enter Your Own Token Here"); //Get Token from Discord Developer Tools
        bot.setStatus(OnlineStatus.ONLINE); //Change to: IDLE, AWAY, DO_NOT_DISTURB...
        bot.setActivity(Activity.playing("Made with Java"));
        bot.addEventListeners(new BotCommands());
        bot.build();

    }


}

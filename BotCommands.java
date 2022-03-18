package mainbot;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * Class to set up commands for bot to process
 * @author Jacob Stout
 * @version 3/18/22
 */

public class BotCommands extends ListenerAdapter
{
	public String prefix = "!"; //Can change to whatever you want to use as command prompt
    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event)
    {
    	String [] args = event.getMessage().getContentRaw().split(" ");
    	
        System.out.println("Message received from: " + event.getAuthor().getName() + " stating: " + event.getMessage().getContentDisplay()); //Console debugger
    	if (args[0].equalsIgnoreCase(prefix + "test"))
    	{
    		event.getMessage().reply("Yeah, I work.").queue();
    		//event.getChannel().sendMessage("Yeah, I work.").queue(); //Uncomment this line to send message rather than reply to user
    	}
    	
    	if (args[0].equalsIgnoreCase(prefix + "commands"))
    	{
    		event.getMessage().reply("test, commands, hello, whoami, whatdidisay").queue();
    	}
    	
    	if (args[0].equalsIgnoreCase(prefix + "hello"))
    	{
    		event.getMessage().reply("Hey...").queue();
    	}
    	
    	if (args[0].equalsIgnoreCase(prefix + "whoami"))
    	{
        	String name = event.getAuthor().getName();
    		event.getMessage().reply("You are " + name + "...").queue();
    	}
    	
    	if (args[0].equalsIgnoreCase(prefix + "whatdidisay"))
    	{
    		event.getMessage().reply("You said " + event.getMessage().getContentDisplay()).queue();
    	}
    	
    	//Add more commands...

    }
}
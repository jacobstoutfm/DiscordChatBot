# DiscordChatBot
This project is a simple chat bot that listens to commands a user inputs, and responds appropriately. It is more of a 'starter' kit to allow easy implementation for others to use in their Discord servers. 

To use, there are a couple of things you need to do first.
First, create a new bot in Discord Developer Portal. 
Give the new bot permissions, and invite to your discord server.
![image](https://user-images.githubusercontent.com/70117036/159051514-9f1dcda1-73cc-4920-90d7-ad3c51dffa0a.png)

After creating the bot and inviting to your own discord server through the OAuth2 > URL Generator tab, you must copy the token of your bot from the 'Bot' tab into the main driver source file [MainDriver.java] at:  JDABuilder.createDefault("Enter your own token here!")
![image](https://user-images.githubusercontent.com/70117036/159052216-89f7d751-63da-46b4-a91c-3adfbf80852b.png)

Here is the exact location, if needed:
![image](https://user-images.githubusercontent.com/70117036/159052285-634bb938-b5e3-4be2-a605-17e4315162b3.png)

After this, you are free to change the command prefix, add more commands, delete, or do as you please in the BotCommands.java class. I added annotations and other examples inside of the class to allow non-proficient Java users to get an understanding of what the code does and how to change it to your liking.

You can export the code to a JAR file or simply run it from your IDE. The console in your IDE will debug all interactions with the bot. Here is an example of the bot working in Discord: 

![image](https://user-images.githubusercontent.com/70117036/159052594-e0aee5dd-c187-46f2-8779-d2a312bc9eb6.png)


Here is an example of the console in an IDE [Eclipse] while running:
![image](https://user-images.githubusercontent.com/70117036/159052700-96dce5f3-22e6-486c-9ed4-8ed5779a47dc.png)


Thanks for reading.

***IMPORTANT NOTE***
When importing source files into your IDE / package, remember that you need to implement JDA [Java Discord API]. This is a wrapper for Discord found at https://github.com/DV8FromTheWorld/JDA. Some of the code may be outdated when new JDA versions are released. The version that I used when creating this project was 4.4.0. If you are unsure on how to implement JDA, you can either use dependencies through Maven OR -- if using Eclipse, when creating a new package for the Java files, click 'Libraries', then 'Add External JAR file', and add the JDA jar file from the GitHub link (preferably 4.4.0).

package org.example;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;

public class Messages {

    public static void someoneJoined(TextChannel ch, String name){
        ch.sendMessage("Hallo, es ist schön dich zu sehen " + name + " UwU <3").queue();
    }
}

package org.example;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.sharding.ShardManager;


public class Main {
    public static void main(String[] args) {
        try {
            DiscordBotBuilder b = new DiscordBotBuilder();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
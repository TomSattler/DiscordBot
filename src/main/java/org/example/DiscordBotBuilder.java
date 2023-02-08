package org.example;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.sharding.ShardManager;

import javax.security.auth.login.LoginException;

public class DiscordBotBuilder implements EventListener {


    public DiscordBotBuilder() throws InterruptedException{
        JDABuilder builder = JDABuilder.createDefault("test")
                .setStatus(OnlineStatus.ONLINE)
                .setEnabledIntents(GatewayIntent.DIRECT_MESSAGE_REACTIONS)
                .setActivity(Activity.listening("Pornhub UwU"));
        builder.addEventListeners(new DiscordBotBuilder())
                .build();
        builder.wait();
    }
    @Override
    public void onEvent(GenericEvent e){
        if(e instanceof ReadyEvent){
            System.out.println("Hi UwU");
        }
    }
}

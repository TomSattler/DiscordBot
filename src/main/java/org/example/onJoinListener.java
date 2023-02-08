package org.example;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.entities.channel.concrete.VoiceChannel;
import net.dv8tion.jda.api.events.guild.voice.GuildVoiceUpdateEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.HashSet;
import java.util.List;

public class onJoinListener extends ListenerAdapter {
    @Override
    public void onGuildVoiceUpdate(GuildVoiceUpdateEvent event){
        List<TextChannel> channels = event.getGuild().getTextChannels();
        List<VoiceChannel> vChannels = event.getGuild().getVoiceChannels();
        HashSet<Member> members = new HashSet<>();
        for(VoiceChannel vCh : vChannels){
            for(Member m : vCh.getMembers()){
                members.add(m);
            }
        }
        for(Member m : members) {
            for (TextChannel ch : channels) {
                Messages.someoneJoined(ch, m.getNickname());
                System.out.println(m.getNickname());
            }
        }
    }
}

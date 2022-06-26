package com.company.models.equipment;

public class Radio implements CarEquipment {

    private String channel;
    private int volume;

    public String getChannel() {
        System.out.println("Channel set to "+this.channel);
        return channel;

    }
    public void setChannel(String channel) {
        System.out.println("Switching channel to " + this.channel);
        this.channel = channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void getVolume() {
        System.out.println("Radio volume set to " + volume);
    }

    @Override
    public void start() {
        System.out.println("Radio starting");
    }

    @Override
    public void stop() {
        System.out.println("Radio stopping");
    }

    public void play() {
        System.out.println("Playing channel " + channel);
    }


}

package com.design.behavioral.command;

public class CommandMain {
    public static void main(String[] args){
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        CommandControl control = new CommandControl();
        control.setCommand(lightOn);
        control.pressButton();
        control.setCommand(lightOff);
        control.pressButton();
    }
}

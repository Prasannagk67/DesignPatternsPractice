package com.design.behavioral.command;

public class CommandControl {
    private Command command;
    public void setCommand(Command command){
        this.command=command;
    }
    public void pressButton(){
        if (command != null){
            command.execute();
        }else{
            System.out.println("No Command Assigned");
        }
    }
}

package com.mmajd.command.command;

/**
 * Null Object
 */
public class NotFoundCommand implements ICommand {
    private String name;

    public NotFoundCommand(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("Could not find command: [" + name + "]");
    }
}

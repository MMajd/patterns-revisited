package com.mmajd.command.factory;

import com.mmajd.command.command.ICommand;

public abstract class CommandFactory {
    private String name;
    private String description;

    public abstract ICommand createCommand(Object... args);

    protected CommandFactory(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}

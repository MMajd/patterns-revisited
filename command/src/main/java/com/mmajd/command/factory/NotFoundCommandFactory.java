package com.mmajd.command.factory;

import com.mmajd.command.command.ICommand;
import com.mmajd.command.command.NotFoundCommand;

public class NotFoundCommandFactory extends CommandFactory {
    public NotFoundCommandFactory(String commandName) {
        super(commandName, "");
    }

    @Override
    public ICommand createCommand(Object... args) {
        return new NotFoundCommand(getName());
    }
}

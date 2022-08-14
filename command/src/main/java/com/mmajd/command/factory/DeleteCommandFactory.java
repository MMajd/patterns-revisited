package com.mmajd.command.factory;

import com.mmajd.command.command.DeleteCommand;
import com.mmajd.command.command.ICommand;

public class DeleteCommandFactory extends CommandFactory {

    public DeleteCommandFactory(final String name, final String description) {
        super(name, description);
    }

    @Override
    public ICommand createCommand(Object... args) {
        return new DeleteCommand(Integer.parseInt((String) args[1]));
    }
}

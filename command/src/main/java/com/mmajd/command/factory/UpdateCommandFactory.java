package com.mmajd.command.factory;

import com.mmajd.command.command.ICommand;
import com.mmajd.command.command.UpdateCommand;

public class UpdateCommandFactory extends CommandFactory {

    public UpdateCommandFactory(final String name, final String description) {
        super(name, description);
    }

    @Override
    public ICommand createCommand(Object... args) {
        return new UpdateCommand(Integer.parseInt((String) args[1]));
    }
}

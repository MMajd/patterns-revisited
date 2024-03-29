package com.mmajd.command;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.mmajd.command.command.ICommand;
import com.mmajd.command.factory.CommandFactory;
import com.mmajd.command.factory.NotFoundCommandFactory;

public class CommandParser {
    private final List<CommandFactory> commands;

    public CommandParser(List<CommandFactory> commands) {
        this.commands = commands;
    }

    public ICommand parseCommand(Object... args) {
        final String commandName = (String) args[0];

        CommandFactory factory = findCommandFactory(commandName);

        if (factory == null) {
            return new NotFoundCommandFactory(commandName).createCommand(args);
        }

        return factory.createCommand(args);
    }

    private CommandFactory findCommandFactory(String name) {
        Optional<CommandFactory> optional = commands.stream()
                .filter(e -> e.getName().equals(name)).findFirst();

        if (optional.isEmpty())
            return null;

        return optional.get();
    }

}

package com.mmajd.command;

import com.mmajd.command.command.ICommand;
import com.mmajd.command.factory.CommandFactory;
import com.mmajd.command.factory.DeleteCommandFactory;
import com.mmajd.command.factory.UpdateCommandFactory;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<CommandFactory> commands = getAvailableCommands();

        if (args.length == 0) {
            printUsage(commands);
            return;
        }

        CommandParser parser = new CommandParser(commands);

        ICommand command = parser.parseCommand(args);

        if (command != null) {
            command.execute();
        }
    }


    public static List<CommandFactory> getAvailableCommands() {
        return Arrays.asList(
                new UpdateCommandFactory("UpdateOrder", "Choose this command if you want update order qty"),
                new DeleteCommandFactory("DeleteOrder",
                        "Choose this command if you want to delete an order by its id"));
    }

    public static void printUsage(List<CommandFactory> list) {
        System.out.println("Usage: Command demo");

        for (CommandFactory c : list) {
            System.out.printf("\t%s : %s %n", c.getName(), c.getDescription());
        }
    }
}
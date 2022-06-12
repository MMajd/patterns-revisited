package CommandPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import CommandPattern.Command.ICommand;
import CommandPattern.Factory.CommandFactory;
import CommandPattern.Factory.DeleteCommandFactory;
import CommandPattern.Factory.UpdateCommandFactory;
import driver.PatternDriver;

public class CommandDriver implements PatternDriver {
    @Override
    public void run(Object... args) {
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

    public List<CommandFactory> getAvailableCommands() {
        return Arrays.asList(
                new UpdateCommandFactory("UpdateOrder", "Choose this command if you want update order qty"),
                new DeleteCommandFactory("DeleteOrder",
                        "Choose this command if you want to delete an order by its id"));
    }

    public void printUsage(List<CommandFactory> list) {
        System.out.println("Usage: Command demo");

        for (CommandFactory c : list) {
            System.out.printf("\t%s : %s %n", c.getName(), c.getDescription());
        }
    }
}

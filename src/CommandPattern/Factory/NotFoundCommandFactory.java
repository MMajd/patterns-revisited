package CommandPattern.Factory;

import java.util.jar.Attributes.Name;

import CommandPattern.Command.ICommand;
import CommandPattern.Command.NotFoundCommand;

public class NotFoundCommandFactory extends CommandFactory {
    public NotFoundCommandFactory(String commandName) {
        super(commandName, "");
    }

    @Override
    public ICommand createCommand(Object... args) {
        return new NotFoundCommand(getName());
    }
}

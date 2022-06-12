package CommandPattern.Factory;

import CommandPattern.Command.ICommand;
import CommandPattern.Command.UpdateCommand;

public class UpdateCommandFactory extends CommandFactory {

    public UpdateCommandFactory(final String name, final String description) {
        super(name, description);
    }

    @Override
    public ICommand createCommand(Object... args) {
        return new UpdateCommand(Integer.parseInt((String) args[1]));
    }
}

import BuilderPattern.BuilderDriver;
import ChainOfResposibility.ChainOfResposibilityDriver;
import CommandPattern.CommandDriver;

public class Main {
    public static void main(String[] args) {
        // new BridgeDriver().run();
        // new BuilderDriver().run();

        // new ChainOfResposibilityDriver().run();
        new CommandDriver().run(args);
    }
}
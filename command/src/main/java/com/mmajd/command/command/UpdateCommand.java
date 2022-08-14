package com.mmajd.command.command;

public class UpdateCommand implements ICommand {
    private int quantity;

    public UpdateCommand(final int q) {
        this.quantity = q;
    }

    @Override
    public void execute() {
        System.out.printf("\t%s %d%n", "Writing new quantity to database", quantity);
        System.out.printf("\tLOG: update order quantity%n");
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}

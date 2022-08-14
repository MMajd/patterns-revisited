package com.mmajd.command.command;

public class DeleteCommand implements ICommand {

    private int orderId;

    public DeleteCommand(final int id) {
        orderId = id;
    }

    @Override
    public void execute() {
        System.out.printf("\tDeleting order {%d} from database%n", orderId);
        System.out.println("\tLOG: order has been deleted%n");
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}

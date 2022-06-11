package ChainOfResposibility.NullObject;

import ChainOfResposibility.Abstract.ApprovalResponse;
import ChainOfResposibility.Abstract.BaseFinancialReport;
import ChainOfResposibility.Abstract.IExpenseHandler;

public class EndOfChainHandler implements IExpenseHandler {
    private static IExpenseHandler approver;

    private EndOfChainHandler() {
    }

    public static IExpenseHandler instance() {
        if (approver == null) {
            approver = new EndOfChainHandler();
            return approver;
        }

        return approver;
    }

    @Override
    public ApprovalResponse approve(BaseFinancialReport report) {
        return ApprovalResponse.DENINED;
    }

    @Override
    public IExpenseHandler registerNext(IExpenseHandler next) {
        throw new IllegalAccessError(
                "Error this is class supposed to be the end of chain, thus cannot register next handler");
    }
}

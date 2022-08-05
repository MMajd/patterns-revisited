package ChainOfResposibility.NullObject;

import java.io.Serializable;
import ChainOfResposibility.Abstract.ApprovalResponse;
import ChainOfResposibility.Abstract.BaseFinancialReport;
import ChainOfResposibility.Abstract.IExpenseHandler;

public class EndOfChainHandler implements IExpenseHandler, Serializable {
    private static transient IExpenseHandler approver;

    //  protect against AccessibleObject.setAccessible
    // private constructor also prevent subclassing
    private EndOfChainHandler() throws IllegalAccessException {
        if (approver != null) throw new IllegalAccessException("");
    }

    //  Good practise to build on, for more generic static factory method 
    public static IExpenseHandler instance() throws IllegalAccessException {
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

    private Object readResolve() {
        return approver; 
    }
}

package com.mmajd.chainofresponsibility.NullObject;

import java.io.Serializable;
import com.mmajd.chainofresponsibility.Abstract.ApprovalResponse;
import com.mmajd.chainofresponsibility.Abstract.BaseFinancialReport;
import com.mmajd.chainofresponsibility.Abstract.IExpenseHandler;

public class EndOfChainHandler implements IExpenseHandler {
    private static IExpenseHandler approver;

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

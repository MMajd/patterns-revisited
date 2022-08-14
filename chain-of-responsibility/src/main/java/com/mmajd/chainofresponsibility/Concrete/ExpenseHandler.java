package com.mmajd.chainofresponsibility.Concrete;

import com.mmajd.chainofresponsibility.Abstract.ApprovalResponse;
import com.mmajd.chainofresponsibility.Abstract.BaseFinancialReport;
import com.mmajd.chainofresponsibility.Abstract.IExpenseApprover;
import com.mmajd.chainofresponsibility.Abstract.IExpenseHandler;
import com.mmajd.chainofresponsibility.NullObject.EndOfChainHandler;

public class ExpenseHandler implements IExpenseHandler {
    private final IExpenseApprover approver;
    private IExpenseHandler next;

    public ExpenseHandler(final IExpenseApprover approver) {
        this.approver = approver;
        try {
            next = EndOfChainHandler.instance();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ApprovalResponse approve(BaseFinancialReport report) {
        ApprovalResponse res = approver.approveExpense(report);

        System.out.printf("Report value %04.2f, %s limit %04.2f\n", report.getValue(), approver.getName(), approver.getApproveLimit());

        if (res == ApprovalResponse.BEYOUND_LIMIT) {
            return next.approve(report);
        }

        return res;
    }

    @Override
    public IExpenseHandler registerNext(IExpenseHandler next) {
        this.next = next;
        return next;
    }

}

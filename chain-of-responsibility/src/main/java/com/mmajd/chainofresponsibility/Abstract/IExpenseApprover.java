package com.mmajd.chainofresponsibility.Abstract;

public interface IExpenseApprover {
    String getName();
    ApprovalResponse approveExpense(BaseFinancialReport report);
    double getApproveLimit();
}

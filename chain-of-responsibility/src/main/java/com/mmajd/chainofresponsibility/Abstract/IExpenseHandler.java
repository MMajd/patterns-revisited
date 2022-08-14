package com.mmajd.chainofresponsibility.Abstract;

public interface IExpenseHandler {
    ApprovalResponse approve(BaseFinancialReport report);
    IExpenseHandler registerNext(IExpenseHandler next);
}

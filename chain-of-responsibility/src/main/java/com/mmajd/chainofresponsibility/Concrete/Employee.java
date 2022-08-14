package com.mmajd.chainofresponsibility.Concrete;

import com.mmajd.chainofresponsibility.Abstract.ApprovalResponse;
import com.mmajd.chainofresponsibility.Abstract.BaseFinancialReport;
import com.mmajd.chainofresponsibility.Abstract.IExpenseApprover;

public class Employee implements IExpenseApprover {
    private final String name;
    private final double approvalLimit;

    public Employee(String name, double approvalLimit) {
        this.name = name;
        this.approvalLimit = approvalLimit;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getApprovalLimit() {
        return approvalLimit;
    }

    @Override
    public ApprovalResponse approveExpense(BaseFinancialReport report) {
        if (report.getValue() > approvalLimit)
            return ApprovalResponse.BEYOUND_LIMIT;
        return ApprovalResponse.APPROVED;
    }

    @Override
    public double getApproveLimit() {
        return approvalLimit;
    }
}

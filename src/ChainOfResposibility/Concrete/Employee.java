package ChainOfResposibility.Concrete;

import ChainOfResposibility.Abstract.ApprovalResponse;
import ChainOfResposibility.Abstract.IExpenseHandler;
import ChainOfResposibility.Abstract.BaseFinancialReport;
import ChainOfResposibility.Abstract.IExpenseApprover;

public class Employee implements IExpenseApprover {
    private final String name;
    private final double approvalLimit;

    public Employee(String name, double approvalLimit) {
        this.name = name;
        this.approvalLimit = approvalLimit;
    }

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

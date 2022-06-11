package ChainOfResposibility.Abstract;

public interface IExpenseApprover {
    ApprovalResponse approveExpense(BaseFinancialReport report);

    double getApproveLimit();
}

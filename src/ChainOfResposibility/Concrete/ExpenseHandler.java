package ChainOfResposibility.Concrete;

import ChainOfResposibility.Abstract.ApprovalResponse;
import ChainOfResposibility.Abstract.BaseFinancialReport;
import ChainOfResposibility.Abstract.IExpenseApprover;
import ChainOfResposibility.Abstract.IExpenseHandler;
import ChainOfResposibility.NullObject.EndOfChainHandler;

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

        System.out.printf("Report value %04.2f, Handler limit %04.2f\n", report.getValue(), approver.getApproveLimit());

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

package ChainOfResposibility;

import ChainOfResposibility.Abstract.BaseFinancialReport;
import ChainOfResposibility.Abstract.IExpenseHandler;
import ChainOfResposibility.Concrete.Employee;
import ChainOfResposibility.Concrete.ExpenseHandler;
import ChainOfResposibility.Concrete.ExpenseReport;
import driver.PatternDriver;

public class ChainOfResposibilityDriver implements PatternDriver {
    @Override
    public void run(Object... args) {
        IExpenseHandler ahamd = new ExpenseHandler(new Employee("ahmad", 1000)); // regular employee
        IExpenseHandler yasser = new ExpenseHandler(new Employee("yasser", 2000)); // manager
        IExpenseHandler khaled = new ExpenseHandler(new Employee("khaled", 4000)); // vice president
        IExpenseHandler omar = new ExpenseHandler(new Employee("omar", 7000)); // president

        ahamd
                .registerNext(yasser)
                .registerNext(khaled)
                .registerNext(omar);

        double reportValue = Math.random() * 10_000;

        BaseFinancialReport report = new ExpenseReport(reportValue);

        System.out.println(ahamd.approve(report));
    }
}
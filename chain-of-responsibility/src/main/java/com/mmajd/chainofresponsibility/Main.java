package com.mmajd.chainofresponsibility;

import com.mmajd.chainofresponsibility.Abstract.BaseFinancialReport;
import com.mmajd.chainofresponsibility.Abstract.IExpenseHandler;
import com.mmajd.chainofresponsibility.Concrete.Employee;
import com.mmajd.chainofresponsibility.Concrete.ExpenseHandler;
import com.mmajd.chainofresponsibility.Concrete.ExpenseReport;

public class Main {
    public static void main(String[] args) {
        IExpenseHandler ahmad = new ExpenseHandler(new Employee("Ahmad", 1000)); // regular employee
        IExpenseHandler yasser = new ExpenseHandler(new Employee("Yasser", 2000)); // manager
        IExpenseHandler khaled = new ExpenseHandler(new Employee("Khaled", 4000)); // vice president
        IExpenseHandler omar = new ExpenseHandler(new Employee("Omar", 7000)); // president

        ahmad
                .registerNext(yasser)
                .registerNext(khaled)
                .registerNext(omar);

        double reportValue = Math.random() * 10000;

        BaseFinancialReport report = new ExpenseReport(reportValue);

        System.out.println(ahmad.approve(report));
    }
}
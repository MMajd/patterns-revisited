package com.mmajd.chainofresponsibility.Concrete;

import com.mmajd.chainofresponsibility.Abstract.BaseFinancialReport;

public class ExpenseReport extends BaseFinancialReport {

    public ExpenseReport(double total) {
        super(total);
    }
}

package com.mmajd.visitor;

import com.mmajd.visitor.abstraction.PersonalAssetsVisitor;
import com.mmajd.visitor.domain.Person;
import com.mmajd.visitor.domain.assets.BankAccount;
import com.mmajd.visitor.domain.assets.Loan;
import com.mmajd.visitor.domain.assets.RealEstate;
import com.mmajd.visitor.implementation.PersonMonthlyIncomeVisitor;
import com.mmajd.visitor.implementation.PersonNetWorthVisitor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Person p = new Person(new ArrayList<>() {{
            add(new BankAccount(1000, 0.1));
            add(new BankAccount(5000, 0.14));
            add(new RealEstate(1_800, 1200));
            add(new Loan(3000, 300));
        }});

        PersonNetWorthVisitor netWorthVisitor = new PersonNetWorthVisitor();
        p.accept(netWorthVisitor);

        log.info("Person p net worth is: {}", netWorthVisitor.getNetWorth());


        PersonMonthlyIncomeVisitor monthlyIncomeVisitor = new PersonMonthlyIncomeVisitor();
        p.accept(monthlyIncomeVisitor);

        log.info("Person p monthly income is: {}", monthlyIncomeVisitor.getMonthlyIncome());
    }
}
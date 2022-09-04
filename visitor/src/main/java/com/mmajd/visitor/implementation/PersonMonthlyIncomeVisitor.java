package com.mmajd.visitor.implementation;

import com.mmajd.visitor.abstraction.PersonalAssetsVisitor;
import com.mmajd.visitor.domain.assets.BankAccount;
import com.mmajd.visitor.domain.assets.Loan;
import com.mmajd.visitor.domain.assets.RealEstate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonMonthlyIncomeVisitor implements PersonalAssetsVisitor {
    private double monthlyIncome;
    @Override
    public void visit(BankAccount account) {
        monthlyIncome += account.getBalance() * account.getInterestRate();
    }

    @Override
    public void visit(RealEstate estate) {
        monthlyIncome += estate.getRent();
    }

    @Override
    public void visit(Loan loan) {
        monthlyIncome -= loan.getMonthlyPayment();
    }
}

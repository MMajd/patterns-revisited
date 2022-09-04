package com.mmajd.visitor.implementation;

import com.mmajd.visitor.abstraction.PersonalAssetsVisitor;
import com.mmajd.visitor.domain.assets.BankAccount;
import com.mmajd.visitor.domain.assets.Loan;
import com.mmajd.visitor.domain.assets.RealEstate;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonNetWorthVisitor implements PersonalAssetsVisitor {
    private double netWorth;

    @Override
    public void visit(BankAccount account) {
        netWorth +=  account.getBalance();
    }

    @Override
    public void visit(RealEstate estate) {
        netWorth +=  estate.getValue();
    }

    @Override
    public void visit(Loan loan) {
        netWorth -= loan.getOwed();
    }
}

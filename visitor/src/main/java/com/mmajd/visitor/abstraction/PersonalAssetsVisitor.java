package com.mmajd.visitor.abstraction;

import com.mmajd.visitor.domain.assets.BankAccount;
import com.mmajd.visitor.domain.assets.Loan;
import com.mmajd.visitor.domain.assets.RealEstate;

public interface PersonalAssetsVisitor {
    void visit(BankAccount account);
    void visit(RealEstate estate);
    void visit(Loan loan);
}

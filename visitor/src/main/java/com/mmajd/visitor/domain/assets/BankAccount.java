package com.mmajd.visitor.domain.assets;

import com.mmajd.visitor.abstraction.Asset;
import com.mmajd.visitor.abstraction.PersonalAssetsVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BankAccount implements Asset {
    private double balance;
    // monthly rate
    private double interestRate;

    @Override
    public void accept(PersonalAssetsVisitor v) {
        v.visit(this);
    }
}

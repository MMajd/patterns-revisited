package com.mmajd.visitor.domain.assets;

import com.mmajd.visitor.abstraction.Asset;
import com.mmajd.visitor.abstraction.PersonalAssetsVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Loan implements Asset {
    private double owed;
    private double monthlyPayment;

    @Override
    public void accept(PersonalAssetsVisitor v) {
        v.visit(this);
    }
}

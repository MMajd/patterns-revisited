package com.mmajd.visitor.domain.assets;

import com.mmajd.visitor.abstraction.Asset;
import com.mmajd.visitor.abstraction.PersonalAssetsVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RealEstate implements Asset {
    private double value;
    // monthly rent
    private double rent;

    @Override
    public void accept(PersonalAssetsVisitor v) {
        v.visit(this);
    }
}

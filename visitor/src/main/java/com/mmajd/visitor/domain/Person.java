package com.mmajd.visitor.domain;

import com.mmajd.visitor.abstraction.Asset;
import com.mmajd.visitor.abstraction.PersonalAssetsVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Person implements Asset {
    private List<Asset> assets;

    @Override
    public void accept(PersonalAssetsVisitor v) {
        assets.forEach(asset -> asset.accept(v));
    }
}

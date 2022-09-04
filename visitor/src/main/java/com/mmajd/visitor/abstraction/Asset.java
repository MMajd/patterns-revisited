package com.mmajd.visitor.abstraction;


// Sometimes we could define the operation inside the assets
// instead of overloading methods for each type of asset
public interface Asset {
    void accept(PersonalAssetsVisitor v);
}

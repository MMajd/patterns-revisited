package com.mmajd.builder.director;

import com.mmajd.builder.builder.HomeBuilder;
import com.mmajd.builder.product.Home;

public class EngineeringCompany {
    private final HomeBuilder builder;

    public EngineeringCompany(final HomeBuilder builder) {
        this.builder = builder;
    }

    public void build() {
        builder.buyLand();
        builder.pourFoundation();
        builder.prepareConstraction();
        builder.addFraming();
        builder.addWalls();
        builder.finalTrimings();
        builder.finishInterior();
    }

    public Home getHome() {
        return builder.gethHome();
    }
}

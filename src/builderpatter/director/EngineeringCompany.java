package builderpatter.director;

import builderpatter.builder.HomeBuilder;
import builderpatter.product.Home;

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

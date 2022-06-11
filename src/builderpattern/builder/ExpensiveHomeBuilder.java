package builderpattern.builder;

import builderpattern.product.ConstructionType;
import builderpattern.product.FoundationType;
import builderpattern.product.FramingType;
import builderpattern.product.TrimmingType;
import builderpattern.product.WallType;

public class ExpensiveHomeBuilder extends HomeBuilder {

    @Override
    public void addFraming() {
        home.setFramingType(FramingType.CEMENT_COLUMNS);
    }

    @Override
    public void addWalls() {
        home.setWallType(WallType.CEMENT_WALLS);
    }

    @Override
    public void finalTrimings() {
        home.setTrimmingType(TrimmingType.EXPENSIVE);
    }

    @Override
    public void finishInterior() {
        home.setInterior("Expensive");
    }

    @Override
    public void pourFoundation() {
        home.setFoundationType(FoundationType.CEMENT_FOUNDATION);
    }

    @Override
    public void prepareConstraction() {
        home.setConstructionType(ConstructionType.STEEL);
    }
}

package builderpattern.builder;

import builderpattern.product.ConstructionType;
import builderpattern.product.FoundationType;
import builderpattern.product.FramingType;
import builderpattern.product.TrimmingType;
import builderpattern.product.WallType;

public class CheapHomeBuilder extends HomeBuilder {

    @Override
    public void addFraming() {
        home.setFramingType(FramingType.WOODEN);

    }

    @Override
    public void addWalls() {
        home.setWallType(WallType.WOODEN_WALLS);

    }

    @Override
    public void finalTrimings() {
        home.setTrimmingType(TrimmingType.CHEEP);
    }

    @Override
    public void finishInterior() {
        home.setInterior("Cheap Interior");
    }

    @Override
    public void pourFoundation() {
        home.setFoundationType(FoundationType.WOODEN_FOUNDATION);
    }

    @Override
    public void prepareConstraction() {
        home.setConstructionType(ConstructionType.WOODEN);
    }

}

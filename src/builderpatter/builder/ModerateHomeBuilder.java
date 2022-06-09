package builderpatter.builder;

import builderpatter.product.*;

public class ModerateHomeBuilder extends HomeBuilder {

    @Override
    public void addFraming() {
        home.setFramingType(FramingType.CEMENT_COLUMNS);
    }

    @Override
    public void addWalls() {
        home.setWallType(WallType.WOODEN_WALLS);
    }

    @Override
    public void finalTrimings() {
        home.setTrimmingType(TrimmingType.MODERATE);
    }

    @Override
    public void finishInterior() {
        home.setInterior("Moderate");
    }

    @Override
    public void pourFoundation() {
        home.setFoundationType(FoundationType.CEMENT_FOUNDATION);
    }

    @Override
    public void prepareConstraction() {
        home.setConstructionType(ConstructionType.HYPERED);
    }

}

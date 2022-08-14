package com.mmajd.builder.product;

import java.util.Objects;

public class Home {
    /**
     * building process has to be in the following order
     * - Foundation
     * - Construction
     * - Framing
     * - Trimming
     */
    private FoundationType foundationType;
    private ConstructionType constructionType;
    private FramingType framingType;
    private TrimmingType trimmingType;
    private WallType wallType;
    private String interior;

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public WallType getWallType() {
        return wallType;
    }

    public void setWallType(WallType wallType) {
        this.wallType = wallType;
    }

    public TrimmingType getTrimmingType() {
        return trimmingType;
    }

    public void setTrimmingType(TrimmingType trimmingType) {
        this.trimmingType = trimmingType;
    }

    public FramingType getFramingType() {
        return framingType;
    }

    public void setFramingType(FramingType framingType) {
        this.framingType = framingType;
    }

    public ConstructionType getConstructionType() {
        return constructionType;
    }

    public void setConstructionType(ConstructionType constructionType) {
        this.constructionType = constructionType;
    }

    public FoundationType getFoundationType() {
        return foundationType;
    }

    public void setFoundationType(FoundationType foundationType) {
        this.foundationType = foundationType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.foundationType, this.constructionType, this.foundationType, this.trimmingType);
    }

    @Override
    public String toString() {
        return "Home{" +
                "\n\tFoundation=" + foundationType.getValue() +
                ", \n\tConstraction=" + constructionType.getValue() +
                ", \n\tFramming=" + framingType.getValue() +
                ", \n\tInterior=" + getInterior() +
                ", \n\tTrimming=" + trimmingType.getValue() +
                " \n}\n";
    }
}

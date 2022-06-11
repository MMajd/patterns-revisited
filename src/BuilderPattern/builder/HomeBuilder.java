package BuilderPattern.builder;

import BuilderPattern.product.Home;

public abstract class HomeBuilder {
    protected Home home;

    public void buyLand() {
        home = new Home();
    }

    public Home gethHome() {
        return home;
    }

    public abstract void pourFoundation();

    public abstract void prepareConstraction();

    public abstract void addFraming();

    public abstract void addWalls();

    public abstract void finishInterior();

    public abstract void finalTrimings();
}

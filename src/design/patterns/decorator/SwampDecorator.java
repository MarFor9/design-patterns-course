package design.patterns.decorator;

public class SwampDecorator extends TerrainDecorator {

    protected Terrain terrain;

    public SwampDecorator(Terrain terrain) {
        super(terrain);
        this.terrain = terrain;
    }

    @Override
    public int fuelCost() {
        return terrain.fuelCost() + 30;
    }
}

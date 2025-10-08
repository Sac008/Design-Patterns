package behaviourial_design_pattern.strategy.second_improvement;

public class Main {

    public static void main(String[] args) {
        PathCalculationStrategyRegistry pathCalculationStrategyRegistry = new PathCalculationStrategyRegistry();

        pathCalculationStrategyRegistry.registerMode(TransportMode.CAR , new CarPathCalculationStrategy());
        pathCalculationStrategyRegistry.registerMode(TransportMode.BIKE , new BikePathCalculationStrategy());
        pathCalculationStrategyRegistry.registerMode(TransportMode.WALK , new WalkPathCalculationStrategy());

        GoogleMaps googleMaps = new GoogleMaps(pathCalculationStrategyRegistry);
    }
}

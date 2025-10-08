package behaviourial_design_pattern.strategy.second_improvement;

public class GoogleMaps {

    private PathCalculationStrategyRegistry pathCalculationStrategyRegistry;

    public GoogleMaps(PathCalculationStrategyRegistry pathCalculationStrategyRegistry) {
        this.pathCalculationStrategyRegistry = pathCalculationStrategyRegistry;
    }


    public void findPath(String from , String to , TransportMode mode) {
        PathCalculatorStrategy pathCalculatorStrategy = this.pathCalculationStrategyRegistry
                                                .getStrategy(mode);

        pathCalculatorStrategy.calculatePath(from , to);
    }
}

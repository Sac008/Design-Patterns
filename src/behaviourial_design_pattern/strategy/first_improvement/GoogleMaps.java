package behaviourial_design_pattern.strategy.first_improvement;

public class GoogleMaps {

    private PathCalculationStrategyFactory pathCalculationStrategyFactory;
    public void findPath(String from , String to , TransportMode mode) {
        PathCalculatorStrategy pathCalculatorStrategy = pathCalculationStrategyFactory
                                                .getPathCalculationStrategyForMode(mode);

        pathCalculatorStrategy.calculatePath(from , to);
    }
}

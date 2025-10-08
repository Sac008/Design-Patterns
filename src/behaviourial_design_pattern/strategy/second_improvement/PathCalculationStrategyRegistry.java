package behaviourial_design_pattern.strategy.second_improvement;

import java.util.HashMap;
import java.util.Map;

public class PathCalculationStrategyRegistry {

    private Map<TransportMode , PathCalculatorStrategy> strategies = new HashMap<>();

    public void registerMode(TransportMode mode , PathCalculatorStrategy strategy) {
        strategies.put(mode , strategy);
    }


    public PathCalculatorStrategy getStrategy(TransportMode mode) {
        return strategies.get(mode);
    }


}

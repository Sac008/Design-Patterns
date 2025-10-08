package behaviourial_design_pattern.strategy.first_improvement;

public class PathCalculationStrategyFactory {

   PathCalculatorStrategy getPathCalculationStrategyForMode(TransportMode mode) {
        if(mode == TransportMode.WALK) {
            return new WalkPathCalculationStrategy();
        }
        else if(mode == TransportMode.BIKE) {
            return new BikePathCalculationStrategy();
        }
        else if(mode == TransportMode.CAR) {
            return new BikePathCalculationStrategy();
        }
        return null;
   }
}

package behaviourial_design_pattern.strategy.second_improvement;

public class WalkPathCalculationStrategy implements PathCalculatorStrategy {
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("Finding path for walking");
    }
}

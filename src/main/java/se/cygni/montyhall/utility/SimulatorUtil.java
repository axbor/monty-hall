package se.cygni.montyhall.utility;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SimulatorUtil {

    public static float calculateChanceOfWinning(final List<Boolean> simulationResults) {
        final int numberOfSimulations = simulationResults.size();
        if (numberOfSimulations == 0) {
            return 0;
        }
        final long numberOfWins = simulationResults.stream()
                .filter(result -> result)
                .count();

        return numberOfWins / (float) numberOfSimulations;
    }

}

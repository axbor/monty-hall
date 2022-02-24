package se.cygni.montyhall.manager;

import se.cygni.montyhall.service.SimulationService;
import se.cygni.montyhall.utility.SimulatorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class SimulationManagerImpl implements SimulationManager {

    private final SimulationService simulationService;

    @Autowired
    public SimulationManagerImpl(final SimulationService simulationService) {
        this.simulationService = simulationService;
    }

    @Override
    public void runSimulations(final int numberOfSimulations) {
        System.out.printf("Ran %d number of simulations when changing box with a chance of winning of %f%n",
                numberOfSimulations, SimulatorUtil.calculateChanceOfWinning(runSimulations(numberOfSimulations, true)));

        System.out.printf("Ran %d number of simulations when not changing box with a chance of winning of %f%n",
                numberOfSimulations, SimulatorUtil.calculateChanceOfWinning(runSimulations(numberOfSimulations, false)));
    }

    private List<Boolean> runSimulations(final int numberOfSimulations, final boolean changeBox) {
        return Stream.generate(() -> simulationService.simulate(changeBox))
                .limit(numberOfSimulations)
                .collect(Collectors.toList());
    }

}

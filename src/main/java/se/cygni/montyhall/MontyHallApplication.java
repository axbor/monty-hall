package se.cygni.montyhall;

import se.cygni.montyhall.manager.SimulationManagerImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MontyHallApplication {

    public static void main(final String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        final SimulationManagerImpl simulationManager = context.getBean(SimulationManagerImpl.class);
        if (args.length == 1) {
            final int numberOfSimulations = Integer.parseInt(args[0]);
            simulationManager.runSimulations(numberOfSimulations);
            System.exit(0);
        }
        throw new IllegalArgumentException("Application needs to be called with a single number as input");
    }

}

package com.example.demo.manager;

import com.example.demo.service.SimulationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class SimulationManagerImplTest {

    @InjectMocks
    private SimulationManagerImpl manager;

    @Mock
    private SimulationService simulationService;

    @Test
    void runSimulations() {
        manager.runSimulations(10);

        verify(simulationService, times(10)).simulate(true);
        verify(simulationService, times(10)).simulate(false);
    }
}

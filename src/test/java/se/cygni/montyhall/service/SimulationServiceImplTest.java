package se.cygni.montyhall.service;

import se.cygni.montyhall.factory.GameFactory;
import se.cygni.montyhall.model.Game;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SimulationServiceImplTest {

    @InjectMocks
    private SimulationServiceImpl service;

    @Mock
    private GameFactory gameFactory;

    @Test
    void simulateWhenNotChangingAndWinning() {
        when(gameFactory.create()).thenReturn(new Game(0, 0));

        assertTrue(service.simulate(false));
    }

    @Test
    void simulateWhenNotChangingAndLoosing() {
        when(gameFactory.create()).thenReturn(new Game(0, 1));

        assertFalse(service.simulate(false));
    }

    @Test
    void simulateWhenChangingAndWinning() {
        when(gameFactory.create()).thenReturn(new Game(1, 0));

        assertTrue(service.simulate(true));
    }

    @Test
    void simulateWhenChangingAndLoosing() {
        when(gameFactory.create()).thenReturn(new Game(1, 1));

        assertFalse(service.simulate(true));
    }
}

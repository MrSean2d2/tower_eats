package seng201.team56.unittests.services;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seng201.team56.models.*;
import seng201.team56.services.RoundService;
import seng201.team56.services.SetupService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RoundServiceTest {
    private RoundService roundService;
    @BeforeEach
    public void initAllTests() {
        ArrayList<Tower> towers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            towers.add(new Tower(Rarity.COMMON));
        }
        SetupService setupService = new SetupService("Test player", Difficulty.MEDIUM, towers, 6);
        Player testPlayer = setupService.getPlayer();
        roundService = new RoundService(testPlayer);
    }

    @Test
    void createRoundTest() {
        double trackDistance = 50;
        int numCarts = 5;
        int cartMinSize = 15;
        int cartMaxSize = 40;
        double cartMinSpeed = 5;
        double cartMaxSpeed = 10.5;
        assertDoesNotThrow(() -> {roundService.createRound(trackDistance,numCarts,cartMinSize,cartMaxSize,cartMinSpeed,cartMaxSpeed);});
    }
}

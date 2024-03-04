import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestGame {

    @Test
    void switchGameShouldWin() {
        MontyHallGame switchGame = new MontyHallSwitchGame();
        switchGame.winningDoor = 0;
        switchGame.selectedDoor = 1;
        switchGame.openDoor();
        assertTrue(switchGame.didWin());
    }

    @Test
    void switchGameShouldLose() {
        MontyHallGame switchGame = new MontyHallSwitchGame();
        switchGame.winningDoor = 0;
        switchGame.selectedDoor = 0;
        switchGame.openDoor();
        assertFalse(switchGame.didWin());
    }

    @Test
    void stayGameShouldWin() {
        MontyHallGame stayGame = new MontyHallStayGame();
        stayGame.winningDoor = 0;
        stayGame.selectedDoor = 0;
        stayGame.openDoor();
        assertTrue(stayGame.didWin());
    }

    @Test
    void stayGameShouldLose() {
        MontyHallGame stayGame = new MontyHallStayGame();
        stayGame.winningDoor = 0;
        stayGame.selectedDoor = 1;
        stayGame.openDoor();
        assertFalse(stayGame.didWin());
    }
}
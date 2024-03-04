import java.util.Random;

abstract class MontyHallGame {
    public static final Random RANDOM = new Random();

    protected int selectedDoor;
    protected int winningDoor;
    protected int openedDoor;

    public MontyHallGame() {
        selectedDoor = -1;
        winningDoor = RANDOM.nextInt(3);
        openedDoor = -1;
    }

    public abstract void selectDoor(int door);

    public abstract void openDoor();

    public boolean didWin() {
        return selectedDoor == winningDoor;
    }
}


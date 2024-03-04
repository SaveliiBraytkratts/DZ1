public class MontyHallSimulation {
    public static void main(String[] args) {
        int switchWins = 0;
        int stayWins = 0;

        for (int i = 0; i < 1000; i++) {
            MontyHallGame switchGame = new MontyHallSwitchGame();
            switchGame.selectDoor(MontyHallGame.RANDOM.nextInt(3));
            switchGame.openDoor();
            if (switchGame.didWin()) {
                switchWins++;
            }

            MontyHallGame stayGame = new MontyHallStayGame();
            stayGame.selectDoor(MontyHallGame.RANDOM.nextInt(3));
            stayGame.openDoor();
            if (stayGame.didWin()) {
                stayWins++;
            }
        }

        System.out.println("Switch strategy wins: " + switchWins);
        System.out.println("Stay strategy wins: " + stayWins);
    }
}
class MontyHallStayGame extends MontyHallGame {

    @Override
    public void selectDoor(int door) {
        selectedDoor = door;
    }

    @Override
    public void openDoor() {
        for (int i = 0; i < 3; i++) {
            if (i != selectedDoor && i != winningDoor) {
                openedDoor = i;
                break;
            }
        }
    }
}


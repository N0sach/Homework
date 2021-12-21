import game.*;

public class GameTest {
    private final DiceImpl dice = new DiceImpl();
    private final GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
    private final Game game = new Game(dice, winnerPrinter);
    Player realPlayer = new Player("Игрок");
    Player testPlayer = new Player("Test");

    public void testRoll() {
        String scenario = "Тест броска кубика от 1 до 6";
        try {
            int expected = 0;
            int actual = dice.roll();
            Assertions.assertMoreThan(actual, expected);

            expected = 7;
            Assertions.assertLessThan(actual, expected);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testPlayGame(){
        String scenario = "Тест условия победы (у кого больше результат)";
        try {

        } catch (Throwable e){

        }
    }
}



public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();

        // Задайте состояние игрового поля
        game.setCell(0, 0, 1);
        game.setCell(1, 1, 2);
        // ...

        game.saveToFile("game_data.bin"); // Сохранение игры в файл

        TicTacToeGame loadedGame = new TicTacToeGame();
        loadedGame.loadFromFile("game_data.bin"); // Загрузка игры из файла

        loadedGame.printBoard(); // Вывод игрового поля в консоль
    }
}

package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GameStoreTest {

    @Test
    public void shouldAddGame() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        assertTrue(store.containsGame(game));
    }
    // другие ваши тесты

    @Test
    public void shouldReturnFalseAddGames() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        Game game2 = new Game("Дюна", "Стратегия", store);

        assertFalse(store.containsGame(game2));
    }

    @Test
    public void shouldReturnFalseContainsGame() {

        GameStore store = new GameStore();

        Game game2 = new Game("Дюна", "Стратегия", store);

        assertFalse(store.containsGame(game2));
    }

    @Test
    public void shouldGetMostPlayer() {

        GameStore store = new GameStore();

        store.addPlayTime("Владимир", 3);
        store.addPlayTime("Роман", 9);
        store.addPlayTime("Михаил", 6);


        String actual = store.getMostPlayer();
        String expected = "Роман";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMostPlayerReturnNull() {

        GameStore store = new GameStore();

        String actual = store.getMostPlayer();
        String expected = null;
        assertEquals(null, actual);
    }

    @Test
    public void shouldReturnNullGetMostPlayerNegativeValue() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        store.addPlayTime("Егор", -1);

        String actual = store.getMostPlayer();
        String expected = null;
        assertEquals(null, actual);
    }

    @Test
    public void shouldRegisteredAddPlayTime() {

        GameStore store = new GameStore();

        store.addPlayTime("Виктор", 0);
        store.addPlayTime("Марина", 2);


        String actual = store.getMostPlayer();
        String expected = "Марина";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMostPlayerEquallyOne() {

        GameStore store = new GameStore();

        store.addPlayTime("Пётр", 6);
        store.addPlayTime("Иван", 5);


        String actual = store.getMostPlayer();
        String expected = "Пётр";
        assertEquals(expected, actual);
    }


    @Test
    public void shouldGetMostPlayerEqualsZero() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Call of duty", "Стратегия");

        store.addPlayTime("Alena", 0);

        String actual = store.getMostPlayer();
        String expected = null;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldGetSumPlayedTime() {

        GameStore store = new GameStore();

        store.addPlayTime("Александр", 1);
        store.addPlayTime("Евгений", 4);
        store.addPlayTime("Михаил", 2);

        int actual = store.getSumPlayedTime();
        int expected = 7;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnZeroGetSumPlayedTime() {

        GameStore store = new GameStore();

        int actual = store.getSumPlayedTime();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetSumZeroPlayedTime() {

        GameStore store = new GameStore();

        store.addPlayTime("Алексей", 0);
        store.addPlayTime("Иван", 0);
        store.addPlayTime("Максим", 0);

        int actual = store.getSumPlayedTime();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldGetSumOnePlayedTime() {

        GameStore store = new GameStore();

        store.addPlayTime("Артём", 0);
        store.addPlayTime("Елена", 1);
        store.addPlayTime("Варвара", 0);

        int actual = store.getSumPlayedTime();
        int expected = 1;
        assertEquals(expected, actual);

    }

}

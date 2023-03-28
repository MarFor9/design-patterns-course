package design.patterns.proxy;

import java.util.ArrayList;
import java.util.List;


// tutaj wystarcczylo by zmienic implementacje a nie dodawac proxy
// ale proxy uzywa sie gdy nie mozemy zmienic klasy klienckiej
// wtedy dodajemy nasza implementacje, naszego posrednika

// np. jpa i hibernate -- np. wyszukujemy z bazy danych encje np. osoba. to najpierw jest tworzeone proxy dla tej osoby po to by ten obiekt byl wykorzsystywany, i dopiero gdy naprawde są potrzebne dane ladujemy je z bazy

// minus - kolejna warstwa, kolejne rozmycie

public class Main {
    public static void main(String[] args) {
        List<SavedGame> savedGames = loadSavedGames();
        listSavedGames(savedGames);
    }

    public static List<SavedGame> loadSavedGames() {

        int savedGamesCount = 20;
        List<SavedGame> savedGames = new ArrayList<>(savedGamesCount);
        for(int i=0;i<20;i++) {
            SavedGame sg = new SaveGameProxy();
            sg.initialize();
            savedGames.add(sg);
        }

        return savedGames;
    }

    private static void listSavedGames(List<SavedGame> savedGames) {
        for(SavedGame savedGame : savedGames) {
            System.out.println(savedGame.getName());
        }
    }
}

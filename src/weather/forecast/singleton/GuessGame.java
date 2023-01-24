package weather.forecast.singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


// here we have one object only. We create on instance during class loader job
// with enum we are thread safe
// safe also with Reflection
public enum GuessGame {
    INSTANCE;

    private int score;
    private Random random = new Random();
    public int getScore() {
        return score;
    }

    public void play() {
        int guess = random.nextInt(9);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("number to guess: " + guess);
        System.out.println("input your first number");
        Integer input = null;
        try {
            input = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("let's play ---------------------------");
        for (int i = 0; i < 5; i++) {
            if (guess == input) {
                score++;
            }
            guess = random.nextInt(9);
            System.out.println("number to guess: " + guess);
            try {
                input = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

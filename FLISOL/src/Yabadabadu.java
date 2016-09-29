import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by osocron on 4/23/16.
 */
public class Yabadabadu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacidad = scanner.nextInt();
        int noPiedras = scanner.nextInt();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < noPiedras; i++) {
            lista.add(scanner.nextInt());
        }

        List<List<Integer>> combinations = new ArrayList<>();

    }


}

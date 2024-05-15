package programame;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ph {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Dimensiones
        int F = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea vacía

        //Robot
        int RX = scanner.nextInt();
        int RY = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea vacía
        //Tesoro
        int TX = scanner.nextInt();
        int TY = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea vacía

        int O = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea vacía

        Set<String> obstaculos = new HashSet<>();
        for (int i = 0; i < O; i++) {
            int OX = scanner.nextInt();
            int OY = scanner.nextInt();
            obstaculos.add(OX + "," + OY);
            scanner.nextLine(); // Consumir la línea vacía
        }

        boolean reachable = dfs(F, C, RX, RY, TX, TY, obstaculos);

        System.out.println(reachable ? "TESORO" : "IMPOSIBLE");
        scanner.close();
    }

    // Algoritmo de búsqueda DFS
    private static boolean dfs(int F, int C, int x, int y, int TX, int TY, Set<String> obstaculos) {
        if (x == TX && y == TY) {
            return true;
        }
        if (x < 1 || x > F || y < 1 || y > C || obstaculos.contains(x + "," + y)) {
            return false;
        }
        obstaculos.add(x + "," + y);
        return dfs(F, C, x + 1, y, TX, TY, obstaculos) ||
               dfs(F, C, x - 1, y, TX, TY, obstaculos) ||
               dfs(F, C, x, y + 1, TX, TY, obstaculos) ||
               dfs(F, C, x, y - 1, TX, TY, obstaculos);
    }
}
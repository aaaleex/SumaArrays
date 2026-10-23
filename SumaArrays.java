package SumaArrays;
import java.util.Scanner;
import java.util.Arrays;

public class SumaArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] resultat = new int[5];

        System.out.println("Introdueix 5 enters per a l'array a:");
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Introdueix 5 enters per a l'array b:");
        for (int i = 0; i < 5; i++) {
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            resultat[i] = a[i] + b[i];
        }

        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
        System.out.println("resultat: " + Arrays.toString(resultat));

        scanner.close();
    }
}
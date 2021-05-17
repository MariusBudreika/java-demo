import java.util.Arrays;
import java.util.Scanner;

public class Uzdavinys1 {

    public static void main(String[] args) {
        // 1. gauti pradinius duomenis.
        System.out.println("Uzdavinys 1:");

        int[] prad;
        if(args.length == 3) {
            prad = pradiniaiDuomenysIsArgs(args);
        } else {
            prad = pradiniaiDuomenysInteraktyviai();
        }

        int a = prad[0], b = prad[1], c = prad[2];
        System.out.println("Pradiniai duomenys: a, b, c = " + a + ", " + b + ", " + c);

        // 2. uzdavinio skaiciavimas (sprendimas)

        String trikampioTipas = sprendimas(a, b, c);

        // 3. Rezultato isvedimas (spausdinimas)
        // a = a, b = b, c = c, result = trikampioTipas;
        // reuzltatoUsvedimas() ...
        rezultatoIsvedimas(a, b, c, trikampioTipas);

    }
    static void rezultatoIsvedimas(int a, int b, int c, String result) {
        System.out.println("Sprendimas:");
        System.out.println(a + ", " + b + ", " + c + " yra " + result);
    }

    static String sprendimas(int a, int b, int c) {
        if (a < b + c && b < a + c && c < a + b) {
            // kazkoks trikampis
            if (a == b && c == a) {
                return "lygiakrastis";
            } else if (a == b || b == c || a == c) {
                return "lygiasonis";
            } else {
                return "ivairiakrastis";
            }
        } else {
            return "ne trikampis";
        }
    }

    static int[] pradiniaiDuomenysIsArgs(String[] args) {
        System.out.println("args = " + Arrays.toString(args));

        int[] m = new int[3];

        m[0] = Integer.parseInt(args[0]);
        m[1] = Integer.parseInt(args[1]);
        m[2] = Integer.parseInt(args[2]);

        return m;
    }

    static int[] pradiniaiDuomenysInteraktyviai() {
        System.out.print("Iveskite triju trikampio krastiniu ilgius:  ");

        Scanner scanner = new Scanner(System.in);
        int[] m = new int[3];

        m[0] = scanner.nextInt();
        m[1] = scanner.nextInt();
        m[2] = scanner.nextInt();

        return m;
    }

}

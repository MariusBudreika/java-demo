import java.util.Scanner;

public class SachmatuLenta {
    public static void main(String[] args) {
        System.out.println("pradzia");
        int a = SkaiciausIvedimasInteraktyviai();
        long suma = skaiciavimas(a);
        rezultatoIsvedimas(suma);
    }

    static int SkaiciausIvedimasInteraktyviai() {
        System.out.println("iveskit skaiciu: ");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        return a;
    }

    static long skaiciavimas(int a) {
    long temp = 1;
    long suma = 1;
        for (int i = 1; i < a; i++) {
        temp *= 2;
        suma += temp;
        }
        return suma;
        }

    static void rezultatoIsvedimas (long suma) {
        System.out.println(suma);
    }
}

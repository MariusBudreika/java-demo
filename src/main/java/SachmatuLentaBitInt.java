import java.math.BigInteger;
import java.util.Scanner;

public class SachmatuLentaBitInt {
    public static void main(String[] args) {
        System.out.println("pradzia");
        int a = SkaiciausIvedimasInteraktyviai();
        BigInteger suma = skaiciavimas(a);
        rezultatoIsvedimas(suma);
    }

    static int SkaiciausIvedimasInteraktyviai() {
        System.out.println("iveskit skaiciu: ");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        return a;
    }

    static BigInteger skaiciavimas(int a) {
        BigInteger temp = new BigInteger("1");
        BigInteger suma = new BigInteger("1");
        for (int i = 1; i < a; i++) {
            temp = temp.multiply(BigInteger.TWO);
            suma = suma.add(temp);
            System.out.println(suma);
        }
        return suma;
    }

    static void rezultatoIsvedimas(BigInteger suma) {
        System.out.println(suma);
    }
}

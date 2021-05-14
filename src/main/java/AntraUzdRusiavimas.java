import java.util.Arrays;

public class AntraUzdRusiavimas {
    public static void main(String[] args) {
        int[] a = {-10, 0, 2, 9, -5};
        int temp = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Surusiuota mazejimo tvarka: " + Arrays.toString(a));
    }
}

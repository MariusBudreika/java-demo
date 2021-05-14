public class TreciaUzdMasyvuVidurkiai {
    public static void main(String[] args) {
        int[] a = {5, 6, 10, 15, 8, 4};
        int[] b = {5, 8, 3};
        double sumaA = 0;
        double sumaB = 0;
        double vidurkisA = 0;
        double vidurkisB = 0;
        double skirtumas = 0;

        for (int i = 0; i < a.length; i++) {
            sumaA += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            sumaB += b[i];
        }
        vidurkisA = sumaA / a.length;
        vidurkisB = sumaB / b.length;
        skirtumas = vidurkisA - vidurkisB;
        if (skirtumas < 0) {
            skirtumas *= -1;
        }
        System.out.println(skirtumas);
    }
}

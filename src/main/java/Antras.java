import java.util.Arrays;

public class Antras {

    public static void main(String[] args) {
        System.out.println("Antras");

        var x = "Labas rytas";
        System.out.println(x);

        char c = ' '; // tuscio char negalima palikti, reikia bent tarpo.
        String s = ""; // string gali buti be reiksmes, tuscias.

        System.out.println("Karalius " + '\u265A' + " ir " + (char)9819); // reikia fonto paieskoti kuris atvaizduotu.

        double d = 6 / 4;
        System.out.println("d = " + d);

        int d3 = (int) (6.0 / 4.0);
        System.out.println("d3 = " + d3);

        System.out.println("11 == 11.0 ? " + (11 == 11.0));
//        System.out.println("11 == \"11.0"\ ? " + (11 == "11.0")); grieztas lyginimas visada.

        int[] a = {2, 4, 8, 16};
        System.out.println(a[3]);

        int[][] b = {{2, 4},{3, 9}, {5, 25}};
        System.out.println(b[2][1]);

        String[] vardai = { "Ona", "Jonas" };
        vardai[1] = "Antanas";

        System.out.println("vardai: " + Arrays.toString(vardai));

        String[] adresai = new String[5];
        System.out.println("adresai: " + Arrays.toString(adresai));
        adresai[2] = "Vytauto pr. 101, Jonava";
        System.out.println("adresai: " + Arrays.toString(adresai));
    }
}

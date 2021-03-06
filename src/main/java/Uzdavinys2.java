/*
    Parašykite programą, kuri mokėtų suapvalinti double tipo skaicius pagal
    nurodytą tikslumą. Panaudokite matematinę funkciją Math.floor(…)
        Math.floor(2.345) = 2.0
        Math.floor(2.999) = 2.0
        programa 15.545678 -1 -> 20.0
        programa 15.545678  0 -> 16.0
        programa 15.545678  1 -> 15.5
        programa 15.545678  2 -> 15.55
        programa 15.545678  3 -> 15.546
 */

public class Uzdavinys2 {
    public static void main(String[] args) {
        System.out.println("15.545678 -3 => " + apvalinti(1554.5678, -3));
        System.out.println("15.545678 -2 => " + apvalinti(15.545678, -2));
        System.out.println("15.545678 -1 => " + apvalinti(15.545678, -1));
        System.out.println("15.545678  0 => " + apvalinti(15.545678, 0));
        System.out.println("15.545678  1 => " + apvalinti(15.545678, 1));
        System.out.println("15.545678  2 => " + apvalinti(15.545678, 2));
        System.out.println("15.545678  3 => " + apvalinti(15.545678, 3));
        System.out.println("15.545678  4 => " + apvalinti(15.545678, 4));

        System.out.println("15.1  0 => " + apvalinti(15.1, 0));
        System.out.println("15.5  0 => " + apvalinti(15.5, 0));
        System.out.println("15.9  0 => " + apvalinti(15.9, 0));

    }

    static double apvalinti(double d, int tikslumas) {
        if (tikslumas == 0) return Math.floor(d + 0.5);

        else if (tikslumas > 0) {
            int a = 1;
            double b = 0.5;

            for (int i = 0; i < tikslumas; i++) {
                a *= 10;
                b /= 10;
            }

            double likutis =  (Math.floor((d - Math.floor(d) + b) * a))/a;
            return Math.floor(d) + likutis;
//            int calc = (int)Math.pow(10, tikslumas);
//            return Math.floor(d * calc+0.5)/calc;
        } else {
            int a = 1;
            double b = 0.5;

            for (int i = 0; i > tikslumas ; i--) {
                a *= 10;

            }
            return Math.floor(d/a + b) * a;
        }
    }
}


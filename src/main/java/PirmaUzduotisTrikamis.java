public class PirmaUzduotisTrikamis {
    public static void main(String[] args) {
        double a = 3;
        double b = 3;
        double c = 3;

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Negali buti trikampio krastines.");
        } else if (a == b && a == c) {
            double plotas = (Math.sqrt(3) * (a * a)) / 4;
            System.out.println("Trikampis yra lygiakrastis. Plotas = " + plotas);
        } else if (a != b && b != c && c != a) {
            double p = (a + b + c) / 2;
            double plotas = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Trikampis yra ivariakrastis. Plotas = " + plotas);
        } else if (a == b) {
            double h = Math.sqrt((a * a) - (c / 2) * (c / 2));
            double plotas = h * (c / 2);
            System.out.println("Trikampis yra lygiasonis.aa Plotas = " + plotas);
        } else if (a == c) {
            double h = Math.sqrt((a * a) - (b / 2) * (b / 2));
            double plotas = h * (b / 2);
            System.out.println("Trikampis yra lygiasonis.bb Plotas = " + plotas);
        } else if (b == c) {
            double h = Math.sqrt((b * b) - (a / 2) * (a / 2));
            double plotas = h * (a / 2);
            System.out.println("Trikampis yra lygiasonis.cc Plotas = " + plotas);
        }
    }
}

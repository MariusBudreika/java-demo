public class PirmaUzduotisTrikamis {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = 5;

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Negali buti trikampio krastines.");
        } else if ( a == b && a == c) {
            System.out.println("Trikampis yra lygiasonis.");
        } else if ( a != b && b != c && c != a) {
            System.out.println("Trikampis yra ivariakrastis.");
        } else {
            System.out.println("Trikampis yra lygiasonis.");
        }
    }
}

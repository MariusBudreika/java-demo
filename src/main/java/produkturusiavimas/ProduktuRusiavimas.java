package produkturusiavimas;

public class ProduktuRusiavimas {

    public static void main(String[] args) {

        Product ledai = new Product("ledai", 30, true);
        Product duona = new Product("duona", 25, false);
        Product batonas = new Product("batonas", 5, true);
        Product pienas = new Product("pienas", 15, false);
        Product grikiai = new Product("grikiai", 42, true);
        Product makaronai = new Product("makaronai", 5, true);
        Product obuoliai = new Product("obuoliai", 11, false);
        Product bananai = new Product("bananai", 150, true);
        Product miltai = new Product("miltai", 99, false);
        Product agurkai = new Product("agurkai", 60, true);

        Product[] products = new Product[]{ledai, duona, batonas, pienas, grikiai, makaronai, obuoliai, bananai, miltai, agurkai};
        sortProductsByValid(products);
    }
    public static void sortProductsByValid(Product[] products) {

        Product temp = null;

        for (int i = 0; i < products.length; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if (!products[i].valid && products[j].valid) {
                    temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].name);
        }
    }
}

 class Product {
    String name;
    double qty;
    boolean valid;

    Product(String name, int qty, boolean valid) {
        this.name = name;
        this.qty = qty;
        this.valid = valid;
    }
}











//            public static void SortProductsByQty(produkturusiavimas.Product[] products) {
//                for (int i = 1; i < products.length; i++) {
//                    produkturusiavimas.Product current = products[i];
//                    int j = i - 1;
//                    while (j >= 0 && current.qty > products[j].qty) {
//                        products[j + 1] = products[j];
//                        j--;
//                    }
//                    products[j + 1] = current;
//                }
//            }

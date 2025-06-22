public class LinearSearchECommerce {
    public Product linearSearch(Product[] products, String name){
        for (Product product1 : products) {
            if (product1.productName.equalsIgnoreCase(name)) {
                return product1;
            }
        }
        return null;
    }
}

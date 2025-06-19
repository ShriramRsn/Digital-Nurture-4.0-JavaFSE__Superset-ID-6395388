public class Store {
    public static void main(String[] args) {
        Product[] laptop = {new Product(101,100000, "Dell XPS 15", "Laptop"),
                            new Product(86,50000,"Lenova", "Electrionics")};

        LinearSearch search = new LinearSearch();
        Product result = search.linearSearch(laptop, "Dell XPS 15");
        
        if(result != null){
            System.out.println(result.productName + " : " + result.productPrice);
        }
        else{
            System.out.println("Product is currently unavailable");
        }

    }
}

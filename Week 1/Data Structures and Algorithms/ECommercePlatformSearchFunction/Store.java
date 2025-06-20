public class Store {
    public static void main(String[] args) {
        Product[] laptop = {new Product(1,100000, "Dell XPS 15", "Laptop"),
                            new Product(12,50000,"Lenova", "Laptop"),
                            new Product(14,70000,"Asus", "Laptop")};

        LinearSearch search = new LinearSearch();
        Product result = search.linearSearch(laptop, "Dell XPS 15");

        if(result != null){
            System.out.println(result.productName + " : " + result.productPrice);
        }
        else{
            System.out.println("Product is currently unavailable");
        }

        BinarySearchObjectArray bsSearch = new BinarySearchObjectArray();
        int BSresult = bsSearch.binarySearch(laptop, 14);

        if(BSresult != 0){
            System.out.println(laptop[BSresult].productName + " : " + laptop[BSresult].productPrice);
        }
    }
}

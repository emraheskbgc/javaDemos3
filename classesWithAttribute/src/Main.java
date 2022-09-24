public class Main {

    public static void main(String[] args) {

        Product product1 = new Product(1,"Laptop", "asus laptop", 3000,3,"siyah");
        product1.setName("laptop");
        product1.setDescription("asus laptop");
        product1.setPrice(5000);
        product1.setStockAmount(3);
        product1.setId(1);
        product1.setColor("renk");

        ProductManager productManager = new ProductManager();
        productManager.add(product1);
        System.out.println(product1.getCode());

    }
}

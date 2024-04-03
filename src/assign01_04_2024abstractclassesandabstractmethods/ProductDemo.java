package assign01_04_2024abstractclassesandabstractmethods;
abstract class Product{
    abstract int getPrice();
    abstract void getDescription();
}
class  ElectronicsProduct extends Product{
    String name;
    int price;
    ElectronicsProduct(String name,int price){
        this.name = name;
        this.price = price;
    }

    @Override
    int getPrice() {
        return price;
    }

    @Override
    void getDescription() {
        System.out.println("Product Name : "+ name + " Product Price : "+ price);
    }
}
class  ClothingProduct extends Product{
    String name;
    int price;
    ClothingProduct(String name,int price){
        this.name = name;
        this.price = price;
    }

    @Override
    int getPrice() {
        return price;
    }

    @Override
    void getDescription() {
        System.out.println("Product Name : "+ name + " Product Price : "+ price);
    }
}
class  BookProduct extends Product{
    String name;
    int price;
    BookProduct(String name,int price){
        this.name = name;
        this.price = price;
    }

    @Override
    int getPrice() {
        return price;
    }

    @Override
    void getDescription() {
        System.out.println("Product Name : "+ name + " Product Price : "+ price);
    }
}
class Cart{
    public void addCart(Product...products){
        int totalprice = 0;
        for(Product product : products){
            totalprice += product.getPrice();
        }
        System.out.println("Total price : "+ totalprice);
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        ElectronicsProduct electronicsProduct = new ElectronicsProduct("Television",5000);
        ClothingProduct clothingProduct = new ClothingProduct("Shirt",500);
        BookProduct bookProduct = new BookProduct("history",300);
        electronicsProduct.getDescription();
        clothingProduct.getDescription();
        bookProduct.getDescription();
        Cart cart = new Cart();
        cart.addCart(electronicsProduct,clothingProduct,bookProduct);

    }
}

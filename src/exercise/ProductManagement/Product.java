package exercise.ProductManagement;

public class Product implements Comparable<Product> {
    private String id;
    private String name;
    private String price;

    public Product() {

    }

    public Product(String id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{id=" + id + ", name=" + name + ", price=" + price+"}";
    }


    @Override
    public int compareTo(Product o) {
        return Integer.parseInt(this.getPrice()) - Integer.parseInt(o.getPrice());
    }
}
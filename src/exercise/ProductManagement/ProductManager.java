package exercise.ProductManagement;

import java.util.*;

public class ProductManager {
    ArrayList<Product> listProduct = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void addProduct() {
        System.out.print("Nhap id:");
        String id = input.nextLine();

        System.out.print("Nhap name:");
        String name = input.nextLine();

        System.out.print("Nhap price:");
        String price = input.nextLine();

        Product product = new Product(id, name, price);
        listProduct.add(product);

        System.out.println("Da them OK");
    }

    public void editProduct() {
        if (listProduct.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            System.out.println("Nhap id san pham muon sua:");
            String id = input.nextLine();
            for (Product product : listProduct) {
                if (product.getId().equals(id)) {
                    System.out.print("Nhap name:");
                    String name = input.nextLine();

                    System.out.println("Nhap price:");
                    String price = input.nextLine();

                    product.setName(name);
                    product.setPrice(price);
                    listProduct.set(listProduct.indexOf(product), product);

                    System.out.println("Da sua OK");
                    return;
                }
            }
            System.out.println("Khong tim thay ID");
        }
    }

    public void deleteProduct() {
        if (listProduct.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            System.out.println("Nhap id san pham muon xoa:");
            String id = input.nextLine();
            for (Product product : listProduct) {
                if (product.getId().equals(id)) {
                    listProduct.remove(listProduct.indexOf(product));

                    System.out.println("Da xoa OK");
                    return;
                }
            }
            System.out.println("Khong tim thay ID");
        }
    }

    public void displayProduct() {
        if (listProduct.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            System.out.println(listProduct);
        }
    }

    public void findByName() {
        if (listProduct.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            System.out.println("Nhap ten san pham muon tim:");
            String name = input.nextLine();
            for (Product product : listProduct) {
                if (product.getName().equals(name)) {
                    System.out.println(product);
                    return;
                }
            }
            System.out.println("Khong tim thay san pham");
        }
    }

    public void sortByPrice() {
        if (listProduct.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            System.out.println("1. Sap xep tang dan");
            System.out.println("2. Sap xep giam dan");
            int sort = input.nextInt();
            switch (sort) {
                case 1:
                    Collections.sort(listProduct);
                    System.out.println(listProduct);
                    break;
                case 2:
                    Collections.sort(listProduct, new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            return Integer.parseInt(o2.getPrice()) - Integer.parseInt(o1.getPrice());
                        }
                    });
                    System.out.println(listProduct);
                    break;
                default:
                    System.out.println("Ngoai pham vi chon!!!");
            }
        }
    }

    @Override
    public String toString() {
        return listProduct + "";
    }
}

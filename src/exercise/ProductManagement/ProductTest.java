package exercise.ProductManagement;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductManager list = new ProductManager();
        int choose = 1;

        while (choose != 0) {
            System.out.println("");
            System.out.println("---------------MENU---------------");
            System.out.println("1. Them san pham");
            System.out.println("2. Sua thong tin san pham theo ID");
            System.out.println("3. Xoa san pham theo ID");
            System.out.println("4. Hien thi danh sach san pham");
            System.out.println("5. Tim kiem san pham theo ten");
            System.out.println("6. Sap xep san pham theo gia");
            System.out.println("0. Thoat");
            choose = input.nextInt();

            switch (choose) {
                case 1:
                    list.addProduct();
                    break;
                case 2:
                    list.editProduct();
                    break;
                case 3:
                    list.deleteProduct();
                    break;
                case 4:
                    list.displayProduct();
                    break;
                case 5:
                    list.findByName();
                    break;
                case 6:
                    list.sortByPrice();
                    break;
                case 0:
                    System.exit(1);
                default:
                    System.out.println("Ngoai pham vi chon!!!");
            }
        }
    }
}

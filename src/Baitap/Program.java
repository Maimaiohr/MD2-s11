package Baitap;

import java.util.*;

public class Program {
    public static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {
    do {
        System.out.println("****************MENU*************** \n" +
                "1. Add product \n" +
                "2. Hien thi danh sach sản phẩm\n" +
                "3. Sap xep theo gia tang dan\n"+
                "4. Loc san pham\n"+
                "5. Thong ke\n"+
                "6. Thoat");
        System.out.println("Mời bạn chọn 1-6:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Them moi san pham ");
                Product product = new Product();
                product.inputData(scanner);
                products.add(product);
                break;
            case 2:
                System.out.println("========PRODUCT=======");
                for (Product product1 : products) {
                    product1.displayData();
                }break;
            case 3:
                //tang dan
                products.stream().sorted(Comparator.comparing(Product::getPrice)).forEach(Product::displayData);
                break;
            case 4:
                //khoảng giá
                System.out.println("tra gia tu:");
                double startPrice = scanner.nextDouble();
                System.out.println("tra gia den");
                double endPrice = scanner.nextDouble();
                boolean check =products.stream().anyMatch(Product->Product.getPrice()>=startPrice&&Product.getPrice()<=endPrice);
                System.out.println("co san pham trong khoang"+ startPrice+"den"+endPrice+ check);
                break;
            case 5:
                DoubleSummaryStatistics statistics= products.stream().mapToDouble(Product::getPrice).summaryStatistics();
                System.out.println("gia cao nhat"+statistics.getMax());
                System.out.println("gia thap nhat"+statistics.getMin());
                System.out.println("gia tb:"+ statistics.getAverage());
                break;
            case 6:
                System.exit(0);
            default:
                System.err.println("Mời bạn nhập lại");
        }
    }while (true);
    }

}

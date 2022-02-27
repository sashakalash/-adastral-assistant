import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static final int RECOMMEND_PRICE = 1000;
    public static final int DEALS_QUANTITY = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену за квадратный  метр");
        String input = scanner.nextLine();
        try {
            int price = Integer.parseInt(input);
            showFairDeals(price);
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void showFairDeals(int price) {
        IntStream.range(0, DEALS_QUANTITY)
                .mapToObj(i -> new Deal(getRandom(), getRandom(), price, RECOMMEND_PRICE))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }


    public static double getRandom() {
        return Math.random() * 49 + 1;
    }
}
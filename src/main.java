import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Purchase purchase = new Purchase();

        System.out.println("Введите покупку");
        System.out.println("Название, цену и тип");

        purchase.setName(scanner.next());

        purchase.setPrice(scanner.nextDouble());

        purchase.setType(Type.getByType(scanner.next()));

        System.out.println("Вы ввели : " + purchase);

    }
}

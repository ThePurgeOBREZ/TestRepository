package ArrayListSorting;
import java.util.Scanner;
public class numberList {
    public void input () {
        java.util.ArrayList<Integer> numberList = new java.util.ArrayList<>();

        System.out.println("Введите количество чисел");
        Scanner in = new Scanner(System.in);
        int quantityOfNumbers = in.nextInt();

        System.out.println("Введите числа: ");
        for (int i = 0; i < quantityOfNumbers; i++) {
            int number = in.nextInt();
            numberList.add(number);
        }

        System.out.println(numberList);
    }
}

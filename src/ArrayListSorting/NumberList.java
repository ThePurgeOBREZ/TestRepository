package ArrayListSorting;

import java.util.Collections;
import java.util.Scanner;

public class NumberList {
    java.util.ArrayList<Integer> numberList = new java.util.ArrayList<>();
    int quantityOfNumbers = 0;
    public NumberList() {
    }

    public void Input() {
        System.out.println("Введите количество чисел");
        Scanner in = new Scanner(System.in);
        int quantityOfNumbers = in.nextInt();

        System.out.println("Введите числа: ");
        for (int i = 0; i < quantityOfNumbers; i++) {
            int number = in.nextInt();
            numberList.add(number);
        }

        System.out.println("Введённые числа\n" + numberList);
    }

    public void Sort(){
        Collections.sort(numberList);
        System.out.println("Числа по возрастанию\n" + numberList);
        Collections.reverse(numberList);
        System.out.println("Числа по убыванию\n" + numberList);
        }

}

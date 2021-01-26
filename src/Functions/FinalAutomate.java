package Functions;
import java.util.Scanner;

public class FinalAutomate {
    int state, transition;
    int[] result;
    public void CalculateAutomate(int size){
    result = new int[size];
        for (int i = 0; i < size; i++) {
            Scanner in = new Scanner(System.in);
            state = in.nextInt();
            transition = in.nextInt();
            result[i] = 19 * transition + (state + 239) * (state + 366) / 2;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(result[i]);
        }
    }
}

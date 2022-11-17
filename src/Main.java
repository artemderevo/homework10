import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int[]  setArrayRandomNumbers() {
        int [] arr = new int[30];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args ) {
        int[] array = setArrayRandomNumbers ();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");


    }














}
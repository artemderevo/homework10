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
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if ( num < min) {
                min = num;
            }
        }
        for (int num2 : array ) {
            if (num2 > max) {
                max = num2;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " + "Максимальная сумма трат за день составила " + max + " рублей.");


    }














}
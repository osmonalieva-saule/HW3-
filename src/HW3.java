import java.util.Arrays;
public class HW3 {
    public static void main(String[] args) {

        double[] numbers = {8.0, 2.5, -4.0, 3.2, 1.1, -5.3, 6.7, -7.8, 4.9, 2.3, -1.6, 5.4, -2.2, 3.1, 1.8};
        System.out.println("Массив чисел: " + Arrays.toString(numbers));

        double sum = 0;
        int count = 0;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {

                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[j] > 0) {
                        sum += numbers[j];
                        count++;
                    }
                }
                break;
            }
        }

        
        double average = count > 0 ? sum / count : 0;
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
    }
}


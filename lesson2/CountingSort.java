import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[arr.length];

        // Подсчет количества каждого уникального элемента
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }
        System.out.println("Промежуточный массив: " + Arrays.toString(count));
        // Суммирование элементов счетчика для получения правильных позиций элементов в отсортированном массиве
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Построение отсортированного массива
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Копирование отсортированного массива в исходный
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {0, -2, 3, 1, 0, 0, 1};
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        countingSort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }
}

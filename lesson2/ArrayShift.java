import java.util.Arrays;

public class ArrayShift {
    public static void circularShift(int[] arr, int n) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int len = arr.length;
        n = n % len; // Обработка случая, если n превышает длину массива

        // Первый шаг: Реверсирование всего массива
        reverseArray(arr, 0, len - 1);

        // Второй шаг: Реверсирование первой части массива
        reverseArray(arr, 0, n - 1);

        // Третий шаг: Реверсирование второй части массива
        reverseArray(arr, n, len - 1);
    }

    // Вспомогательный метод для реверсирования части массива
    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2;

        System.out.println("Исходный массив: " + Arrays.toString(arr));

        circularShift(arr, n);

        System.out.println("Массив после циклического сдвига на " + n + " позиции вправо: " + Arrays.toString(arr));
    }
}

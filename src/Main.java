import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isAscending = "ascending".equals(scanner.nextLine());
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        BiFunction<Integer, Integer, Integer> comparator = null;

        // isAscending уже компаратор

        if(isAscending) {
            // в убывающем


        }else if (!isAscending) {
            // в возрастающем


        }else{
            System.out.println("что-то пошло не так...");
        }

        sort(array, comparator);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }

    public static void sort(int[] array, BiFunction<Integer, Integer, Integer> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (comparator.apply(array[j], array[j + 1]) == array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
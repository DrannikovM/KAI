import java.util.ArrayList;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int count = 100;
        String[] nums = new String[count];

        ArrayList<String> filteredList = new ArrayList<>();

        System.out.println("Initial numbers:");
        for (int i = 0; i < nums.length; i++){
            nums[i] = String.valueOf(1000 + rnd.nextInt(9000));
        }
        showByRows(nums, 10);

        System.out.println("Filtered numbers:");
        for (String num : nums) {
            int sumOfDigits = 0;
            for (char c : num.toCharArray()) {
                sumOfDigits += Character.getNumericValue(c);
                if (sumOfDigits >= 10) break;
            }
            if (sumOfDigits < 10) filteredList.add(num);
        }
        String[] result = filteredList.toArray(new String[0]);
        showByRows(result, 10);
    }
    public static void showByRows(String[] array, int length) {
        if (array.length == 0) {
            System.out.println("No elements found.");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
            if ((i + 1) % length == 0) System.out.println();
        }
    }
}

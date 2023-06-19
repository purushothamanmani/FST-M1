package activities;

public class Activity2 {
    static int checkResult = 30;
    static int searchValue = 10;
    static int sum;

    public static void main(String[] args) {
        int[] arr = {10, 77, 10, 54, -11, 10};
        System.out.println("The final result is:" + findAndSum(arr, checkResult, searchValue));
    }

    private static Boolean findAndSum(int[] arr, int checkResult, int searchValue) {
        for (int value : arr) {
            if (value == searchValue) {
                sum += value;
            }
        }
        return sum == checkResult;
    }
}

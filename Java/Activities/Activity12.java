package activities;

interface Addable {
    int add(int num1, int num2);
}

public class Activity12 {
    public static void main(String[] args) {
        Addable ad1 = (a, b) -> (a + b);
        System.out.println("Result w/o lambada body:" + ad1.add(10, 30));

        Addable ad2 = (int x, int y) -> {
            return x + y;
        };
        System.out.println("Result with lambada body:" + ad2.add(50, 10));
    }
}

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = 10;
        int[] array = new int[size];
        for (int i = 0;i < 10;i = i + 1) {
            array[i] = scan.nextInt();
        }
        for (int i = 0;i < 10;i = i + 1) {
            System.out.println(array[i] + ",");
        }
        scan.close();
    }
}

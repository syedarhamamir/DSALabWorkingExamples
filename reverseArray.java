import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int[] reversedArray = new int[size];
        for (int i = 0; i < size; i++) {
            reversedArray[i] = array[size - 1 - i];
        }

        System.out.println("Reversed array:");
        for (int i = 0; i < size; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println();
    }
}

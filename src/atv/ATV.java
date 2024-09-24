
package atv;

/**
 *
 * @author dyogo
 */
public class ATV {

  
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean troca;

        for (int i = 0; i < n - 1; i++) {
            troca = false;  

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    troca = true;  
                }
            }

          
            if (!troca) {
                break;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array antes da ordenacao:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Array apos a ordenacao:");
        printArray(arr);
    }
}

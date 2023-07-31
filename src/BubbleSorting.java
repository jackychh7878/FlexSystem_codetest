public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Before sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        System.out.println("After sorting: ");
        bubbleSorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void bubbleSorting(int[] arr){
        int n = arr.length;
        int temp = 0; //temp dummy to do the swapping

        for (int i = 0; i < n ; i++){
            for (int j = 1; j < (n-1); j++){
                if (arr[j-1] > arr[j]){
                    temp = arr[j-1]; //sawp if the right hand num > left hand num
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

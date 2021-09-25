import java.util.Arrays;

public class MyMain {

    // Rotates all values in an array to the left
    // Ex. rotateLeft([1, 2, 3, 4, 5]) => [2, 3, 4, 5, 1]
    public static int[] rotateLeft(int[] arr) {
        int last = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=last;
        return arr;
    }

    // Rotates all values in an array to the right
    // Ex. rotateRight([1, 2, 3, 4, 5]) => [5, 1, 2, 3, 4]
    public static int[] rotateRight(int[] arr) {
        int front = arr[arr.length-1];
        for (int i=arr.length-1; i>0; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=front;
        return arr;
    }

    // Replaces all duplicate values with -1
    // Ex. duplicateReplacer([1, 2, 1, 2, 1, 1]) => [1, 2, -1, -1, -1, -1]
    public static int[] duplicateReplacer(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j])
                {
                    arr[j]=-1;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateLeft(new int[]{10,11,12,13,14})));
        System.out.println(Arrays.toString(rotateRight(new int[]{10,11,12,13,14})));
        System.out.println(Arrays.toString(duplicateReplacer(new int[]{4,1,6,1,3,5,4,4,7})));
    }
}

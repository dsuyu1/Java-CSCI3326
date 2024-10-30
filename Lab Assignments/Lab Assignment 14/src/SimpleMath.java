public class SimpleMath {
    public static void main(String[] args) {
        // my own test statements
        int arr1[] = {2, 34, 51, 23, 0, -1};

        System.out.println(sum(arr1));
        System.out.println(max(arr1));
        System.out.println(min(arr1));
    }

    // returns the sum of all integers in array
    static int sum(int arr[]) {
        int store = 0;
        for (int i = 0; i < arr.length; i++) {
            store = store + arr[i];
        }
        return store;
    }

    // returns the largest number in an array
    static int max(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // returns the smallest number in an array
    static int min(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
public class Main {
    
    // sum function
    
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i =0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        return sum;
    }
    
    // factorial function
    
    public static int factorial(int num) {
        if (num == 1) {
            return num;
        }
        else {
            return num * factorial(num - 1);
        }
    }
    
    
    // main
    
    public static void main(String[] args) {
        // sum
        int[] arr = new int[]{2, 3, 4, 5, 6};
        System.out.println(sum(arr));
        
        // factorial
        int num = 4;
        System.out.println(factorial(num));
        
        // class
        Circle circle1 = new Circle(10);
        System.out.println(circle1.area());
    }
}
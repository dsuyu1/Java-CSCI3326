public class Main {
    public static void main(String[] args) throws Exception {
        // test print statement
        System.out.println(pow(2, 3));
    }

    public static int pow(int x, int y) {
        // base case when y = 0, return 1
        if (y == 0) {
            return 1;
        }
        // if y = 1, then return x
        else if (y == 1) {
            return x;
        }
        else {
            // recursively calls pow to find x ^ y
            return x * pow(x, y - 1);
        }
    }
}
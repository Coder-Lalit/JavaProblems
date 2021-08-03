package LeetCode.Problems.Easy.String;

public class ConfusingNumber1056 {
    public static boolean confusingNumber(int n) {
        if (n == 0) return false;
        int temp = n;
        StringBuilder s = new StringBuilder();
        while (n != 0) {
            if (n % 10 == 2 || n % 10 == 3 || n % 10 == 4 || n % 10 == 5 || n % 10 == 7) {
                return false;
            } else if (n % 10 == 6) {
                s.append(9);
            } else if (n % 10 == 9) {
                s.append(6);
            } else {
                s.append(n % 10);
            }
            n /= 10;
        }
        return temp != Integer.parseInt(s.toString());
    }

    public static void main(String[] args) {
        System.out.println(confusingNumber(916));
    }
}

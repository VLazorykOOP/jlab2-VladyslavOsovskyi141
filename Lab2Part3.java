
public class Lab2Part3 {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        if (a <= 0 || b <= 0) {
            System.out.println("Numbers must be natural (positive) integers.");
            return;
        }

        int gcd = MathUtils.gcd(a, b);
        int lcm = MathUtils.lcm(a, b);

        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}

class MathUtils {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}
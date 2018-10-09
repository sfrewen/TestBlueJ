package Homework1;

public class Swole
{
    public static long gcd(long a, long b){
        int d = 0;
        while ((a%2 == 0) && (b%2==0)) {
            a = a/2;
            b = b/2;
            d++;
        }
        while (a != b) {
            if (a%2 == 0) {
                a = a/2;
            } else if (b%2 == 0) {
                b = b/2;
            } else if (a > b) {
                a = (a-b)/2;
            } else {
                b = (b-a)/2;
            }
        }
        return a * (long) Math.pow(2, d);
    }

    public static void main(String[] args) {
        System.out.println(gcd(100, 20));
    }
}

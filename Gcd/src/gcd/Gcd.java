package gcd;
import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input number 1: ");
        num1 = sc.nextInt();
        System.out.print("Input number 2: ");
        num2 = sc.nextInt();
        
        System.out.println(gcd(num1, num2));
    }
    
    static int gcd(int m, int n){
        if(n==0){
            return m;
        }
        else return gcd(n, m%n);
    }
}




/*Sieve of Erastosthenes

Output prime numbers from 2 to 50
ex: 2,3,5,7,11,13..47
do not input anything
just run
press f13
*/















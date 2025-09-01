package Recursion;

public class Recursion_1 {

    public static void main(String[] args) {
        System.out.println(recursion(5));
        System.out.println("Factorial :: "+factorial(5));
    }

    public static int recursion(int i){
        if(i==1) return i;
        return i+recursion(--i);
    }

    public static int factorial(int i){
        if(i==1) return i;
        return i*factorial(--i);
    }
}

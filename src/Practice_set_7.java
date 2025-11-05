public class Practice_set_7 {
    //Write a Java method to print the multiplication table of a number n.
    static void multiplication(int n , int t){
        if (n>0 && t>0){
            multiplication(n,t-1);
            System.out.println(n + " times " +t + " equals "+ n*t);
        }
    }
//    Write a program using functions to print the following pattern:
//            *
//            **
//            ***
//            ****
    static void incremental_pattern(int n){
        if (n>0){
            incremental_pattern(n-1);
            System.out.println("*".repeat(n)); // string method to repeat string values
        }
    }

//    Write a recursive function to calculate the sum of first n natural numbers.
    static  int sum (int n){
        if (n>0) {
            return n+sum(n-1);
        }else  return 0;
    }

//    Write a function to print the following pattern:
//            ****
//            ***
//            **
//            *
    static void decremental_pattern (int n){
        if (n>0){
            System.out.println("*".repeat(n));
            decremental_pattern(n-1);
        }
    }

//    Write a function to print the nth term of the Fibonacci series using recursion.


    public static void main(String[] args) {
//        multiplication(9,10);
//        incremental_pattern(4);
//        System.out.println(sum(4);
//        decremental_pattern(4);
    }
}

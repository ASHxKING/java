public class Recursion {
    static void sequence(int n){
        if (n>0) {
            System.out.println(n);
            sequence(n-1);
        }else return;
    }
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }else {
           return n*factorial(n-1) ;
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(0));
        sequence( 5);

    }
}

public class Methods_in_java {
    int sum(int a , int b ){
        System.out.println("inside normal method");
        return a+b;
    }
    static int sum_static_call(int a , int b){
        return a+b;
    }
    static void greet(){
        System.out.println("Hi How was your day !");
    }
    static int sum(int ...arr){
        System.out.println("inside varargs method");
        int result=0;
        for(int element: arr){
            result+=element;
        }
        return result;
    }
    public static void main(String[] args) {
        Methods_in_java obj = new Methods_in_java();
        System.out.println(obj.sum(2,3));
        System.out.println(sum_static_call(4, 5));
        greet();
        System.out.println(sum(4,5,6,6,7,74,7,4,56,37,3,2534,563,6));
    }
}

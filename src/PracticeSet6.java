public class PracticeSet6 {
    /*
    1. Create an array of 5 floats and calculate their sum.
    2. Write a program to find out whether a given integer is present in an array or not.
    3. Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
    4. Create a Java program to add two matrices of size 2x3.
    5. Write a Java program to reverse an array.
    6. Write a Java program to find the minimum element in an array.
    7. Write a Java program to find the maximum element in a Java array.
    8. Write a Java program to find whether an array is sorted or not.
     */
    public static void main(String[] args) {
//        int[] numbers = {1, 20, 3, 4, 5};
//        float [] numbers ={1,2,3,4,5};
//        float sum=0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i];
//        }
//        System.out.println(sum);

        int given_integer = 20;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == given_integer) {
//                System.out.println("integer found");
//            }else {
//                System.out.println("Not found");
//            }
//        }

        float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//        float sum=0;
//        float avg=0;
//        for (float element:marks){
//            sum = sum + element;
//        }
//        avg = sum/ marks.length;
//        System.out.println("Average Marks of students in physics: " +avg);


//        int [][] m1 = {{1,2,3},{4,5,6}};
//        int [][] m2 = {{10,11,12},{13,14,15}};
//        int [][] result = new int[2][3];
//
//        for (int i = 0; i < m1.length; i++) {
//            for (int j = 0; j < m1[i].length; j++) {
//                result[i][j]=m1[i][j] + m2[i][j];
//            }
//        }
//        for (int i = 0; i < m1.length; i++) {
//            for (int j = 0; j < m1[i].length; j++) {
//                System.out.print(result[i][j]);;
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }

        int[] numbers = {111,20,3,4,5,6,7};
//        int[] numbers = {1,2,3,4,5,6,7};

        int l = numbers.length;
//        int[] rev_arr = new int[l];
//        for (int i = 0; i < l ; i++) {
//            rev_arr[l-1-i] = numbers[i];
//        }
//        for (int i = 0; i < l; i++) {
//            System.out.print(rev_arr[i]+" ");
//        }


        int temp;
//        for (int i = 0; i < l/2; i++) {
//            temp = numbers[i];
//            numbers[i]=numbers[l - 1 - i];
//            numbers[l - 1 - i] = temp;
//        }
//
//        for (int i = 0; i < l; i++) {
//            System.out.print(numbers[i]+" ");
//        }

        int max=0;
//        for (int i = 0; i < l-1; i++) {
//            if (numbers[i]>max){
//                max =numbers[i];
//            }
//        }
//        System.out.println(max);


//        int min = numbers[0];
//        for (int i = 0; i < l-1; i++) {
//            if (numbers[i]<min){
//                min =numbers[i];
//            }
//        }
//        System.out.println(min);

//
//        boolean status =false ;
//        for (int i = 0; i < l-1; i++) {
//            if (numbers[i]<numbers[i+1]){
//                status = true;
//            }else {
//                status = false;
//                break;
//            }
//        }
//        if (status == true){
//        System.out.println("Sorted Array");
//        }else {
//            System.out.println("unsorted");
//        }

    }
}
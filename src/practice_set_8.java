//Create a class Employee with the following properties and methods:
//Salary (property) (int)
//getSalary (method returning int)
//name (property) (String)
//getName (method returning String)
//setName (method changing name)
//Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
//Create a class Square with a method to initialize its side, calculating area, perimeter etc.
//Create a class Rectangle & problem 3.
//Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
//Repeat problem 4 for a circle.

class Employee1{
    int salary;
    String name;

    public int getSalary(){
//        System.out.println("My Salary is : "+salary);
        return  salary;
    }
    public String getName (){
        return name;
    }
    public String setName(String newname){
        name = newname;
        return name;
    }

}

class Cellphone{
    public String ring (){
        return "Ringing...";
    }
    public String vibrate(){
        return "Vibrating...";
    }
}
public class practice_set_8 {
    public static void main(String[] args) {
    Employee1 e1 = new Employee1();
    Cellphone c1 = new Cellphone();
    e1.name = "aashish";
    e1.salary = 31000;

        System.out.println(e1.setName("golu"));
        System.out.println(c1.ring());
        System.out.println(c1.vibrate());
    }
}

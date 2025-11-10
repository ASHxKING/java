class Employee{
    int id ;
    String name ;
    public void getDetails(){
        System.out.println("My Id is : "+id+" and My Name is : "+name );
    }
}

public class CustomClass {
    public static void main(String[] args) {

        Employee n1 = new Employee();  // Instantiating a new employee object
        Employee n2 = new Employee();

        n1.id=1;
        n1.name="Aashish Kumar";

        n2.id = 2;
        n2.name="Anjali Kumari";
//        System.out.println(n1.id);
        n1.getDetails();
        n2.getDetails();
    }
}

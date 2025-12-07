abstract class Parent2{
    // constructor
    public Parent2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    // non-abstract method
    public void sayHello(){
        System.out.println("Hello");
    }
    //abstract methods
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
    public void childMethod(){
        System.out.println("i am a child method ");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}

// now if a subclass is declared extending child 3 it has to implement methods of parent2 to become a concrete class otherwise we have to use abstract keyword.

public class Abstract {
    public static void main(String[] args) {
        //Parent2 p = new Parent2(); -- error
        Child2 c = new Child2();
        //Child3 c3 = new Child3(); -- error
    }
}

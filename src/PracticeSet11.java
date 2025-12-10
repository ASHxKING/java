//Create an abstract class pen with methods write () and refill () as abstract methods
//Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()
//Create a class monkey with jump ( ) and bite ( ) methods Create a class human whichinherits this monkey class and implements basicanimal interface with eat ( ) and sleep methods
//Create a class telephone with ring ( ) , lift ( ) and disconnected ( ) methods as abstract methods create another class smart telephone and demonstrate polymorphism
//        Demonstrate polymorphism using using monkey  class from Q3
//        Create an interface TVremote and use it to inherit another interface smart TVremote
//        Create a class TV which implements TVremote interface from Q6

abstract class pen{
    abstract public void write();
    abstract public void refill();
}
class FountainPen extends pen{
    @Override
    public void write() {
        System.out.println("writing fountain pen");
    }

    @Override
    public void refill() {
        System.out.println("Refilling fountain pen");
    }
    public void change_nib(){
        System.out.println("changing nib of fountain pen");
    }
}

class Monkey{
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("biting");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class human extends Monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("Human Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Human Sleeping");
    }
    public void think(){
        System.out.println("Human Thinking");
    }

}

abstract class Telephone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
}
class Smartphone extends Telephone{
    @Override
    public void disconnect() {
        System.out.println("Your Smartphone is disconnected");
    }

    @Override
    public void lift() {
        System.out.println("Lift your Smartphone");
    }

    @Override
    public void ring() {
        System.out.println("Your Smartphone is ringing");
    }
    public void playmusic(){
        System.out.println("Playing Music");
    }
}

public class PracticeSet11 {
    public static void main(String[] args) {
        Telephone t = new Smartphone();
        t.disconnect(); // allowed because we can refer a smartphone as telephone as well
        t.ring(); // allowed because we can refer a smartphone as telephone as well
        t.lift(); // allowed because we can refer a smartphone as telephone as well
        // t.playmusic(); // not allowed because a telephone cant play music and this is how we can demonstrate polymorphism in java
        //        if we want to call a child method we have to give reference of child class

//        Smartphone sp = new Smartphone();
//        sp.playmusic();
//
//        BasicAnimal b = new human();
//        Monkey m= new Monkey();
//        Monkey m1 = new human();

//        b.eat();
//        b.sleep();
//        // b.think(); // not allowed as human methods cannot be called while referencing basicanimal
//
//        m.bite();
//        m.jump();
//
//
//        m1.bite();
//        m1.jump();


    }
}

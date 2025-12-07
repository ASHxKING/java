class Circle{
    int r ;
    Circle(){
        System.out.println("Default Constructor");
    }
    Circle(int r) {
        System.out.println("parameterised constructor ");
        this.r = r;
    }
    public double getArea() {
        return Math.PI*this.r*this.r;
    }
    public int getR() {
        return r;
    }
}
class Cylinder extends Circle{
    int h;

    public Cylinder(int r, int h) {
        super(r);
        this.h = h;
    }
    @Override
    public double getArea(){
        return 2*Math.PI*this.r*this.h;

    }
    public double volume (){
        return Math.PI*this.r*this.r*this.h;
    }
    public int getH() {
        return h;
    }
}
class Rectangle{
    int l;
    int b;
    public Rectangle(int l , int b) {
        this.l=l;
        this.b=b;
    }
    public double getArea(){
        return l*b;
    }
}
class Cuboid extends Rectangle{
    int h;
    public Cuboid(int l, int b , int h) {
        super(l, b);
        this.h=h;
    }
    @Override
    public double getArea(){
        return 2*((l*b)+(b*h)+(l*h));
    }
    public double volume (){
        return l*b*h;
    }

}
public class PracticeSet10 {
    public static void main(String[] args) {

    }
}

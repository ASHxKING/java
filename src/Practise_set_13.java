
class greet1 extends Thread{
    @Override
    public void run() {
        super.run();
    int i =0;
    while(i<10000){
        System.out.println("Good Morning");
        i++;
    }
    }
}

class greet2 extends Thread{
    @Override
    public void run() {
        super.run();
        int i =0;
        while(i<10000){
//            try {
//                Thread.sleep(20);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            System.out.println("Welcome");
            i++;
        }
    }
}


public class Practise_set_13 {
    public static void main(String[] args) {
        greet1 g1 = new greet1();
        greet2 g2 = new greet2();

        int priority = g1.getPriority();
        System.out.println("Priority"+priority);
        g2.setPriority(Thread.MAX_PRIORITY);
        g1.start();
        System.out.println("State  g1.getState() "+ g1.getState());
        g2.start();
        System.out.println("State  g2.getState() "+ g2.getState());

    }
}

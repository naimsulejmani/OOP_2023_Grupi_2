package inheritance.polymorphism_other;

public class MonitorTest1 {
    public static void main(String[] args) {
       // Object obj = new Dell24GammingMonitor(244, true);
        Object obj = "naim";
//        if(obj instanceof Monitor) {
//            System.out.println("It's a monitor!");
//        }
//        else
        if (obj instanceof Dell24GammingMonitor) {
            System.out.println("It's a dell!");
        } else if (obj instanceof Hp27Monitor) {
            System.out.println("its a HP!");
        } else if (obj instanceof Monitor) {
            System.out.println("It's a monitor!");
        }
        else {
            System.out.println("You are a other object");
        }
    }
}

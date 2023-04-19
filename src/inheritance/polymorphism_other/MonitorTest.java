package inheritance.polymorphism_other;

public class MonitorTest {
    public static void main(String[] args) {
        //upcasting
        Monitor m1 = new Hp27Monitor(true);
        Monitor m2 = new Dell24GammingMonitor(244, true);
        Object m3 = new Hp27Monitor(false);
        Object m4 = new Dell24GammingMonitor(144, false);
    }

    public static void test(Monitor monitor) {
        if (monitor instanceof Dell24GammingMonitor) {
            System.out.println("DELL");
            //downcasting
            Dell24GammingMonitor dellMonitor = (Dell24GammingMonitor) monitor;
            System.out.println(dellMonitor.getHz());
            System.out.println(dellMonitor.getInch());
        } else if (monitor instanceof Hp27Monitor) {
            System.out.println("HP");
            Hp27Monitor hpMonitor = (Hp27Monitor) monitor;
            System.out.println(hpMonitor.isCurved());
        } else {
            System.out.println("MONITOR");
        }

    }

    public static void test(Object object) {

    }


}








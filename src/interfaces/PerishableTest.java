package interfaces;

import java.time.Period;

public class PerishableTest {
    public static void main(String[] args) {
        System.out.println(Perishable.MAX_PERIOD);
        System.out.println(Perishable.getMaxPeriodDays());
        Perishable p = new FreshMilk();
        System.out.println(p.isPerished());
        System.out.println(p.verifyProduct(Period.ofDays(10)));
        p.perish();

    }
}

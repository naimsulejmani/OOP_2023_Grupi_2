package interfaces;

import java.time.Period;

public interface Perishable {
    Period MAX_PERIOD = Period.ofDays(7); // 7 dite eshte kjo e pame

    void perish();

    boolean isPerished();
// New Java Api from 8 added new methods on interfaces that can be
    // either default, private or static
    public default boolean verifyProduct(Period p) {
        return comparePeriod(p) < 0;
    }

    private int comparePeriod(Period p) {
        return p.getDays() - MAX_PERIOD.getDays();
    }

    static int getMaxPeriodDays() {
        return MAX_PERIOD.getDays();
    }
}













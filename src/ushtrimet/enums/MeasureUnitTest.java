package ushtrimet.enums;

import java.util.EnumSet;

public class MeasureUnitTest {
    public static void main(String[] args) {
        MeasureUnit mu=MeasureUnit.GIGA_BIT;
        for (MeasureUnit unit:MeasureUnit.values()){
            System.out.println(unit);
        }
        MeasureUnit mu1=MeasureUnit.valueOf("BIT");

        System.out.println("Based on range");
        for (MeasureUnit unit: EnumSet.range(MeasureUnit.BYTE,MeasureUnit.TERA_BYTE)){
            System.out.println(unit);
        }
    }
}













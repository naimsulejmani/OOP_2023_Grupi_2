package moster_provimi.shembull_tjeter;

public class TestAutobusi {
    public static void main(String[] args) {
        Autobusi auto1 = new Autobusi(3);
        Autobusi auto2 = new Autobusi(2);
        try {
            auto1.add(new Shoferi());
            auto1.add(new Shoferi());
            auto1.add(new Shoferi());
            auto1.add(new Shoferi());
        }catch(FullShoferaException ex){
            System.out.println(ex.getMessage());
        }

    }
}

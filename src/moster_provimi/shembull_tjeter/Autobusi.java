package moster_provimi.shembull_tjeter;

import java.util.ArrayList;
import java.util.List;

public class Autobusi {
    private int maxShoferat = 3;
    private int counter = 0;
    private List<Shoferi> shoferat;
    private Shoferi[] shoferis;

    public Autobusi(int maxShoferat) {
        this.maxShoferat = maxShoferat;
        this.shoferat = new ArrayList<>();
        this.shoferis = new Shoferi[maxShoferat];
    }

    public void add(Shoferi shoferi) throws FullShoferaException {
        if (counter < maxShoferat) {
            this.shoferis[counter++] = shoferi;
        }
        else throw new FullShoferaException("Gjeje naj pasagjer");

//
//        if (this.shoferat.size() < maxShoferat) {
//            this.shoferat.add(shoferi);
//        }
    }


}

package introduction.summary;

public class Airplane {

    public int getShpejtesia() {
        return shpejtesia;
    }

    public void setShpejtesia(int shpejtesia) {
        if( shpejtesia >= 0 && shpejtesia <= 3000) {
            this.shpejtesia = shpejtesia;
        }
    }

    private int shpejtesia;

}

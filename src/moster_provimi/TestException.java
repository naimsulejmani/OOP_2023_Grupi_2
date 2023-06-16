package moster_provimi;

public class TestException {
    public static void main(String[] args) {
        boolean isFull = true;
        try {
            if (isFull) {
                throw new AutobusiFullException("Autobusi full");
            }
        } catch (AutobusiFullException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

package abstract_classes;

public class StudentTest {
    public static void main(String[] args) {
        AbstractStudentCrud crud = new StudentCrudImpl();
        //AbstractStudentCrud s = new AbstractStudentCrud();
        crud.read(1);
    }
}

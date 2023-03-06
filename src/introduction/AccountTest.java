package introduction;

public class AccountTest {
    public static void main(String[] args) {
        Account jonisAccount = new Account();
        jonisAccount.name = "Jon Fejzullahu";
        jonisAccount.setPassword("123456");
        jonisAccount.setBalance(5_000_000);
        jonisAccount.name = "Naim Sulejmani";
    }
}

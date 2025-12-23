package encapsulation;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        System.out.println(account.getNo());
        System.out.println(account.getName());
        System.out.println(account.getBalance());

        account.setNo(1234567890L);
        account.setName("Abhishek Gupta");

        System.out.println(account.getNo());
        System.out.println(account.getName());
        System.out.println(account.getBalance());

        System.out.println("TRANSACTIONS");

        System.out.println(account.credit(5000D));
        System.out.println(account.debit(4000D));

        System.out.println(account.getBalance());

        System.out.println(account);
    }
}

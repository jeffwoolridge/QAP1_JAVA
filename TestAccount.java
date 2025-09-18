
public class TestAccount {

    public static void main(String[] args) {

        // Create two Account objects using parameterized constructors
        Account acc1 = new Account("A101", "Account 1", 5000);
        Account acc2 = new Account("A102", "Account 2", 4000);

        // Display balances of both accounts before transfer
        System.out.println("\nBefore Transfer:");
        System.out.println("Acc1 Balance: $" + acc1.getBalance());
        System.out.println("Acc2 Balance: $" + acc2.getBalance());

        // Transfer $1000 from acc1 to acc2
        acc1.transferTo(acc2, 1000);

        // Display balances of both accounts after transfer
        System.out.println("\nAfter Transfer:");
        System.out.println("Acc1 Balance: $" + acc1.getBalance());
        System.out.println("Acc2 Balance: $" + acc2.getBalance());
        System.out.println("\n");
    }
}

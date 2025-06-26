public class BankAccount {
        private int balance;

        public BankAccount(int accountBalance) {
            this.balance = accountBalance;
        }

        public void deposit(int amount) {
            balance += amount;
        }

        public void withdraw(int amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                throw new IllegalArgumentException("Insufficient balance");
            }
        }

        public int getBalance() {
            return balance;
        }
}

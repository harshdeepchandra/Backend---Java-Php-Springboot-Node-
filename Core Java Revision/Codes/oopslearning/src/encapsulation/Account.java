package encapsulation;

public class Account {
    private Long no;
    private String name;
    private Double balance;

    public Account() {
        balance = 0.0D;
    }

    // Getters and Setters
    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public String credit(Double amount) {
        if(amount<=0) {
            return "Invalid amount";
        } else {
            balance = balance + amount;
            return "Your ac no. " + no +
                    ", has been credited of Rs. " + amount +
                    ".\nNow your balance is " + balance;
        }
    }

    public String debit(Double amount) {
        if(amount<=0) {
            return "Invalid amount";
        } else if(amount > balance) {
            return "Insufficient balance";
        } else {
            balance = balance - amount;
            return "Your ac no. " + no +
                    ", has been debited of Rs. " + amount +
                    ".\nNow your balance is " + balance;
        }
    }



}

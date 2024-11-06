import java.util.Calendar;
import java.util.Date;

public class Transaction extends BankAccount {
    private String date;
    private String type;
    private float amount;

    public Transaction() {
    }

    public String getDate() {
        Calendar current = Calendar.getInstance();

        return ""+current.getTime();
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.toLowerCase()=="deposit" || type.toLowerCase()=="withdraw") {
            this.type = type;
        }
        else{
            System.out.println("set a valid type (withdraw or deposit)");

        }

    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}


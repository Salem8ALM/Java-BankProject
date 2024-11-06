
public class User extends BankAccount{
    private String username;
    private String password;
    public User() {

    }

    public void createAccount(){
        setAccountNum("4075000048686");

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

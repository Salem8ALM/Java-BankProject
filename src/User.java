public class User extends BankAccount{
    private String username;
    private String password;
    public User() {

    }


    @Override
    public String getAccountNum() {
        return super.getAccountNum();
    }

    @Override
    public void setAccountNum(String accountNum) {
        super.setAccountNum(accountNum);
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

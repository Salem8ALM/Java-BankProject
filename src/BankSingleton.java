import java.util.ArrayList;

public class BankSingleton{
    private ArrayList<String> users;

    private static BankSingleton instance;

    private BankSingleton(){
        users = new ArrayList<>();
    }

    public static BankSingleton getInstance() {
        if (instance == null){
            instance = new BankSingleton();
        }
        return instance;
    }

    public void addToUserList(User user){

        users.add(user.getUsername()+""+user.getPassword());
    }
    public void createUser (String username, String password){
        User newuser = new User();
        newuser.setUsername(username);
        newuser.setPassword(password);
    }
    public boolean signInAuth(String username, String password){
        if (users.contains(username) && users.contains(password) ){
            return true;
        }
        else return false;
    }

    public void removeUser(String user){
        users.remove(user);
    }
}

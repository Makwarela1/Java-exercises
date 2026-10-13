public class LoginCheck {
    String username = "Makwarela";
    String password = "Tattoo";
    String name;
    String pass;

    public String login (){
        if (name.equals(username) && pass .equals(password)){
            return "Login Successful";
        } else {
            return "Invalid";
        }
    }

}

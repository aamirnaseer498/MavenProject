package sdet;

import java.util.ResourceBundle;

public class App {

    public int userLogin(String in_User, String in_pwd){
        ResourceBundle resourceBundle= ResourceBundle.getBundle("config");
        String userName= resourceBundle.getString("username");
        String password= resourceBundle.getString("password");

        if (in_User.equals(userName) && in_pwd.equals(password)){
            return 1;
        }else {
            return 0;
        }
    }

}

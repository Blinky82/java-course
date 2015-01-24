package Random;

import java.util.ArrayList;

/**
 * Created by blinky on 14.01.15.
 */
public class User {

    private String pass;
    private String mail;

    public User() {
    }

    public User(String mail, String pass) {
        this.mail = mail;
        this.pass = pass;

    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean checkMailValidity() {
        try {
            if (this.mail.length() <= 5 || !this.mail.contains("@")
                    || !this.mail.contains(".")) {
                throw new Exception("Invalid mail exception!");
            }
            return true;

        } catch (Exception f) {
            System.out.println(f.getMessage());
            return false;
        }
    }

    public boolean checkPassValidity() {
        try {
            if (this.pass.length() <= 6) {
                throw new Exception("Invalid pass length exception!");
            }
            for (int i = 0; i < pass.length(); i++) {
                if (Character.isDigit(pass.charAt(i))) {
                    return true;
                }
            }
            throw new Exception("Invalid pass  exception!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }

    }

    public static void main(String[] args) {
        User tmp = new User("aaa@dsadsa.vf", "aaa");
        System.out.println(tmp.checkMailValidity());
        System.out.println(tmp.checkPassValidity());

        User tmp1 = new User("aaa@", "aaa");
        System.out.println(tmp1.checkMailValidity());
        System.out.println(tmp1.checkPassValidity());

        User tmp2 = new User("aaaa@asd.bg", "asd1234");
        System.out.println(tmp2.checkMailValidity());
        System.out.println(tmp2.checkPassValidity());
    }
}
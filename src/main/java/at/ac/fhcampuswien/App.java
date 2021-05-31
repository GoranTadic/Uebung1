package at.ac.fhcampuswien;

public class App {

    public boolean passwordLength(String password){
        return password.length() > 7 && password.length() < 26;
    }

    public boolean hasUpperAndLowerCase(String password){
        return true;
    }

    public boolean hasDigit(String password){
        return true;
    }

    public boolean hasSpecialSign(String password){
        return true;
    }
}

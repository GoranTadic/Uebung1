package at.ac.fhcampuswien;

public class App {

    public boolean passwordLength(String password){
        return password.length() > 7 && password.length() < 26;
    }

    public boolean hasUpperAndLowerCase(String password){
        char[] chars = password.toCharArray();
        boolean upper = false;
        boolean lower = false;

        for(char a : chars){
            if(a > 96 && a < 123) lower = true;
            if(a > 64 && a < 91) upper = true;
        }
        return upper && lower;
    }

    public boolean hasDigit(String password){
        char[] chars = password.toCharArray();


        for(char a : chars){
            if(Character.isDigit(a)) return true;
        }
        return false;
    }

    public boolean hasSpecialSign(String password){
        return true;
    }
}

package at.ac.fhcampuswien;

public class PasswordChecker {

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

    public boolean hasSpecialChar(String password){
        String[] string = password.split("");
        boolean mustHave = false;

        for(String a : string){
            if(a.matches("[^a-zA-Z0-9()#$?!%/@]")) return false;
            if(a.matches("[()#$?!%/@]")) mustHave = true;
        }

        return mustHave;
    }

    public boolean hasContinuousNumbers(String password){
        char[] chars = password.toCharArray();

        for(int i = 0; i < (chars.length - 2); i++){
            if(Character.isDigit(chars[i])){
                if(chars[i+1] == chars[i] + 1 && chars[i+2] == chars[i] + 2) return false;
            }
        }
        return true;
    }

    public boolean hasRepeatingNumbers(String password){
        char[] chars = password.toCharArray();

        for(int i = 0; i < (chars.length - 3); i++){
            if(Character.isDigit(chars[i])){
                if(chars[i + 1] == chars[i] && chars[i + 2] == chars[i] && chars[i + 3] == chars[i]) return false;
            }
        }
        return true;
    }

    public boolean isValid(String password){
        return passwordLength(password)
                && hasDigit(password)
                && hasUpperAndLowerCase(password)
                && hasSpecialChar(password)
                && hasContinuousNumbers(password)
                && hasRepeatingNumbers(password);
    }
}

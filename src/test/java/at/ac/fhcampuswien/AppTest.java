package at.ac.fhcampuswien;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.*;

public class AppTest {

    public static void main(String[] args) {
        String password = "Hello5";



    }

    @Test
    public boolean passwordLength(String password){
        return password.length() > 7 && password.length() < 26;
    }

    @Test
    public boolean lowerAndUpperCase(String password){
        char[] chars = password.toCharArray();
        boolean upper = false;
        boolean lower = false;

        for(char a : chars){
            if(a > 96 && a < 123) lower = true;
            if(a > 64 && a < 91) upper = true;
        }
        return upper && lower;
    }

    @Test
    public boolean containsDigits(String password){
        char[] chars = password.toCharArray();


        for(char a : chars){
            if(Character.isDigit(a)) return true;
        }
        return false;
    }

    @Test
    public boolean containsSpecialSign(String password){
        boolean sign = false;

        Character.
        return sign;
    }
}

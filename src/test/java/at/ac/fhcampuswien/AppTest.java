package at.ac.fhcampuswien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.*;

public class AppTest {

    @Test
    @DisplayName("Has password valid length 1")
    public void passwordLength1(){
        App pw = new App();
        assertFalse(pw.passwordLength("Hello"));
    }

    @Test
    @DisplayName("Has password valid length 2")
    public void passwordLength2(){
        App pw = new App();
        assertFalse(pw.passwordLength("HelloWorldThisPasswordIsTooLong"));
    }

    @Test
    @DisplayName("Has password valid length 3")
    public void passwordLength3(){
        App pw = new App();
        assertTrue(pw.passwordLength("HelloWorld"));
    }

    @Test
    @DisplayName("Has password upper and lower case letters 1")
    public void hasUpperAndLowerCase1(){
        App pw = new App();
        assertTrue(pw.hasUpperAndLowerCase("HelloWorld"));
    }

    @Test
    @DisplayName("Has password upper and lower case letters 2")
    public void hasUpperAndLowerCase2(){
        App pw = new App();
        assertFalse(pw.hasUpperAndLowerCase("helloworld"));
    }

    @Test
    @DisplayName("Has password upper and lower case letters 3")
    public void hasUpperAndLowerCase3(){
        App pw = new App();
        assertFalse(pw.hasUpperAndLowerCase("HELLOWORLD"));
    }

    @Test
    @DisplayName("Has password digits 1")
    public void hasDigit1(){
        App pw = new App();
        assertTrue(pw.hasDigit("Hello8World"));
    }

    @Test
    @DisplayName("Has password digits 2")
    public void hasDigit2(){
        App pw = new App();
        assertFalse(pw.hasDigit("HelloWorld"));
    }

    @Test
    @DisplayName("Has password special characters 1")
    public void hasSpecialChar1(){
        App pw = new App();
        assertTrue(pw.hasSpecialChar("Hello?World"));
    }

    @Test
    @DisplayName("Has password special characters 2")
    public void hasSpecialChar2(){
        App pw = new App();
        assertFalse(pw.hasSpecialChar("Hello?[World"));
    }

    @Test
    @DisplayName("Has password special characters 3")
    public void hasSpecialChar3(){
        App pw = new App();
        assertFalse(pw.hasSpecialChar("Hello[World"));
    }
}

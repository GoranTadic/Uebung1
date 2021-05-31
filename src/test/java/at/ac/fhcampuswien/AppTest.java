package at.ac.fhcampuswien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.*;

public class AppTest {

    @Test
    @DisplayName("Has password valid length - to short")
    public void passwordLength1(){
        App pw = new App();
        assertFalse(pw.passwordLength("Hello"));
    }

    @Test
    @DisplayName("Has password valid length - to long")
    public void passwordLength2(){
        App pw = new App();
        assertFalse(pw.passwordLength("HelloWorldThisPasswordIsTooLong"));
    }

    @Test
    @DisplayName("Has password valid length - true")
    public void passwordLength3(){
        App pw = new App();
        assertTrue(pw.passwordLength("HelloWorld"));
    }

    @Test
    @DisplayName("Has password upper and lower case letters - true")
    public void hasUpperAndLowerCase1(){
        App pw = new App();
        assertTrue(pw.hasUpperAndLowerCase("HelloWorld"));
    }

    @Test
    @DisplayName("Has password upper and lower case letters - false")
    public void hasUpperAndLowerCase2(){
        App pw = new App();
        assertFalse(pw.hasUpperAndLowerCase("helloworld"));
    }

    @Test
    @DisplayName("Has password digits - true")
    public void hasDigit1(){
        App pw = new App();
        assertTrue(pw.hasDigit("Hello8World"));
    }

    @Test
    @DisplayName("Has password digits - false")
    public void hasDigit2(){
        App pw = new App();
        assertFalse(pw.hasDigit("HelloWorld"));
    }

    @Test
    @DisplayName("Has password special signs - true")
    public void hasSpecialSign1(){
        App pw = new App();
        assertTrue(pw.hasSpecialSign("HelloWorld?"));
    }

    @Test
    @DisplayName("Has password special signs - false")
    public void hasSpecialSign2(){
        App pw = new App();
        assertFalse(pw.hasSpecialSign("HelloWorld"));
    }

    @Test
    @DisplayName("Has password special signs - not allowed sign")
    public void hasSpecialSign3(){
        App pw = new App();
        assertFalse(pw.hasSpecialSign("HelloWorld["));
    }
}

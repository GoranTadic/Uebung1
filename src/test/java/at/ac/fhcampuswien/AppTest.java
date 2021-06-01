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
        assertFalse(pw.passwordLength("HelloThisPasswordIsTooLong"));
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

    @Test
    @DisplayName("Has password continuous numbers 1")
    public void hasContinuousNumbers1(){
        App pw = new App();
        assertTrue(pw.hasContinuousNumbers("Hello12World34"));
    }

    @Test
    @DisplayName("Has password continuous numbers 2")
    public void hasContinuousNumbers2(){
        App pw = new App();
        assertFalse(pw.hasContinuousNumbers("Hello12World345"));
    }

    @Test
    @DisplayName("Has password repeating numbers 1")
    public void hasRepeatingNumbers1(){
        App pw = new App();
        assertTrue(pw.hasRepeatingNumbers("Hello111World"));
    }

    @Test
    @DisplayName("Has password repeating numbers 2")
    public void hasRepeatingNumbers2(){
        App pw = new App();
        assertFalse(pw.hasRepeatingNumbers("Hello1111World"));
    }

    @Test
    @DisplayName("Testing all requierments 1")
    public void isValid1(){
        App pw = new App();
        assertTrue(pw.isValid("Hello12$333World"));
    }

    @Test
    @DisplayName("Testing all requierments 2")
    public void isValid2(){
        App pw = new App();
        assertTrue(pw.isValid("Hello12$333World"));
    }

    @Test
    @DisplayName("Testing all requierments 3")
    public void isValid3(){
        App pw = new App();
        assertTrue(pw.isValid("p4$$W0rD"));
    }

    @Test
    @DisplayName("Testing all requierments 4")
    public void isValid4(){
        App pw = new App();
        assertFalse(pw.isValid("Hello123$333World"));
    }

    @Test
    @DisplayName("Testing all requierments 5")
    public void isValid5(){
        App pw = new App();
        assertFalse(pw.isValid("Hello12$§333World"));
    }
}

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
}

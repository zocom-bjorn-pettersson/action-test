import static org.junit.jupiter.api.Assertions.*;

public class CaesarCipherExampleTest {

    @org.junit.jupiter.api.Test
    void caesar() {
        assertEquals("B", CaesarCipherExample.caesar("A", 1));
        assertEquals(" ", CaesarCipherExample.caesar("Ö", 1));
        assertEquals("Z", CaesarCipherExample.caesar(" ", 1)); // Provoke test failure
        assertEquals("A", CaesarCipherExample.caesar("B", -1));
        assertEquals(" ", CaesarCipherExample.caesar("A", -1));

    }
}

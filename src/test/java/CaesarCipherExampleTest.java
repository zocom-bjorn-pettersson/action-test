import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherExampleTest {

    @org.junit.jupiter.api.Test
    void caesar() {
        assertEquals("B", CaesarCipherExample.caesar("A", 1));
        assertEquals(" ", CaesarCipherExample.caesar("Ö", 1));
        assertEquals("A", CaesarCipherExample.caesar(" ", 1));
        assertEquals("A", CaesarCipherExample.caesar("B", -1));
        assertEquals(" ", CaesarCipherExample.caesar("A", -1));

    }
}
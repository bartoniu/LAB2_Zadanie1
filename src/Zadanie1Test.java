import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

class Zadanie1Test {

    @org.junit.jupiter.api.Test
    void levQWERTY()
    {
        Assertions.assertEquals(1.5,Zadanie1.LevQWERTY("kot","kita"));
        Assertions.assertEquals(2,Zadanie1.LevQWERTY("drab","dal"));
        Assertions.assertEquals(4,Zadanie1.LevQWERTY("marka","ariada"));
    }
}
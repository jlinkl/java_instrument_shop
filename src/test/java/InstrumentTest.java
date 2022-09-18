import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Violin violin;
    Shop shop;
    Trumpet trumpet;
    Flute flute;
    Piano piano;

    @Before
    public void before() {
        violin = new Violin("blue", InstrumentType.STRING, 4, 100, 200);
        trumpet = new Trumpet("brass", InstrumentType.BRASS, 3, 50, 100);
        flute = new Flute("silver", InstrumentType.WOODWIND, 6, 60, 90);
        piano = new Piano("black", InstrumentType.KEYBOARD, 88, 500, 700);
        shop = new Shop();
    }

    @Test
    public void testInstrument(){
        assertEquals("blue", violin.getColour());
        assertEquals(InstrumentType.BRASS, trumpet.getInstrumentType());
        assertEquals(6, flute.getNumHoles());
        assertEquals(500, piano.getBuyingPrice());
        assertEquals(100, violin.calculateMarkUp());
    }

    @Test
    public void testShop(){
        shop.addToStock(violin);
        shop.addToStock(trumpet);
        shop.addToStock(flute);
        shop.addToStock(piano);
        assertEquals(4, shop.getStock().size());
        assertEquals(380, shop.calculateProfit());
    }
}

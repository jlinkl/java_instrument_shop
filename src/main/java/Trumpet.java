public class Trumpet extends Instrument{
    private int numValves;

    public Trumpet(String colour, InstrumentType instrumentType, int numValves, int buyingPrice, int sellingPrice) {
        super(colour, instrumentType, buyingPrice, sellingPrice);
        this.numValves = numValves;
    }

    public int getNumValves() {
        return numValves;
    }
}

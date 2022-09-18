public class Piano extends Instrument {

    private int numKeys;

    public Piano(String colour, InstrumentType instrumentType, int numKeys, int buyingPrice, int sellingPrice) {
        super(colour, instrumentType, buyingPrice, sellingPrice);
        this.numKeys = numKeys;
    }

    public int getNumKeys() {
        return numKeys;
    }
}

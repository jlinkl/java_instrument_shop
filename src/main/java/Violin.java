public class Violin extends Instrument{

    private int numStrings;

    public Violin(String colour, InstrumentType instrumentType, int numStrings, int buyingPrice, int sellingPrice) {
        super(colour, instrumentType, buyingPrice, sellingPrice);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }
}

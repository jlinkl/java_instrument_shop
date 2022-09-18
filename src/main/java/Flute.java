public class Flute extends Instrument{

    private int numHoles;

    public Flute(String colour, InstrumentType instrumentType, int numHoles, int buyingPrice, int sellingPrice) {
        super(colour, instrumentType, buyingPrice, sellingPrice);
        this.numHoles = numHoles;
    }

    public int getNumHoles() {
        return numHoles;
    }
}

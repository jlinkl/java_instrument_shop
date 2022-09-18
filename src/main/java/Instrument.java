public class Instrument implements IPlay, ISell{

    private String colour;
    private InstrumentType instrumentType;
    private int buyingPrice;
    private int sellingPrice;

    public Instrument(String colour, InstrumentType instrumentType, int buyingPrice, int sellingPrice) {
        this.colour = colour;
        this.instrumentType = instrumentType;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String play() {
        return "plays a song";
    }

    public int calculateMarkUp() {
        return this.sellingPrice - this.buyingPrice;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }
}

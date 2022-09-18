import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell instrument) {
        stock.add(instrument);
    }

    public int calculateProfit() {
        int profit = 0;
        for (ISell instrument: this.stock) {
            profit += instrument.calculateMarkUp();
        }
        return profit;
    }
}

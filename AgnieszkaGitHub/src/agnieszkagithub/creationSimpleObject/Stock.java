
package agnieszkagithub.creationSimpleObject;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    
    public Stock (String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }
    
    public Stock () {};
    
    public double getChangePercent() {
        return (((currentPrice - previousClosingPrice) / previousClosingPrice) * 100);
    }
}

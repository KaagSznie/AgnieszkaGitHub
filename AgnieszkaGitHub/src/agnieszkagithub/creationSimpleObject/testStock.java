
package agnieszkagithub.creationSimpleObject;


public class testStock {
    public static void main (String[] args) {
        Stock stock1 = new Stock();
        stock1.name = "Oracle Corporation";
        stock1.symbol = "ORCL";
        stock1.previousClosingPrice = 34.5;
        stock1.currentPrice = 34.35;
        
        Stock stockTest = new Stock();
        stockTest.name = "Oracle Corporation";
        stockTest.symbol = "ORCL";
        stockTest.previousClosingPrice = 100;
        stockTest.currentPrice = 99;
        
        System.out.println("Le changement de prix est de " + stock1.getChangePercent()  + " %");
        System.out.println("Le changement de prix (test) est de " + stockTest.getChangePercent()  + " %");
    }
}
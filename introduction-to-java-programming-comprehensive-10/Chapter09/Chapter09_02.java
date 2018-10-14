/*
(The Stock class) Following the example of the Circle class in Section 9.2, design a class named Stock that contains:
■■ A string data field named symbol for the stock’s symbol.
■■ A string data field named name for the stock’s name.
■■ A double data field named previousClosingPrice that stores the stock price for the previous day.
■■ A double data field named currentPrice that stores the stock price for the current time.
■■ A constructor that creates a stock with the specified symbol and name.
■■ A method named getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice.
Draw the UML diagram for the class then implement the class. Write a test program that creates a Stock object with the stock symbol ORCL, the name Oracle Corporation, and the previous closing price of 34.5. Set a new current price to 34.35 and display the price-change percentage.
*/

class Main {
  public static void main(String[] args) {

    Stock obj1 = new Stock("ORCL", "Oracle Corporation");

    obj1.setCurrentPrice(34.5);
    obj1.setCurrentPrice(34.35);

    System.out.printf("Previous closing price was  %-5s. New current price is %-5s. Price-change percentage is %.2f%%.", 
                obj1.getPreviousClosingPrice() , obj1.getCurrentPrice() , obj1.getChangePercent() );
  }
}

class Stock {

  private String symbol; //for the stock’s symbol
  private String name;  //for the stock’s name.
  private double previousClosingPrice;  //stores the stock price for the previous day.
  private double currentPrice;  //price for the current time.

  public Stock (String symbol, String name) {
    this.symbol = symbol;
    this.name = name;
  }

  public double getCurrentPrice() {
    return this.previousClosingPrice; 
  }

  public double getPreviousClosingPrice() {
    return this.currentPrice; 
  }

  public double getChangePercent() {
    return ( ( this.previousClosingPrice * 100 ) / this.currentPrice ) - 100; 
  }

  public void setCurrentPrice(double currentPrice){
    this.previousClosingPrice = this.currentPrice;
    this.currentPrice = currentPrice;
  }

}

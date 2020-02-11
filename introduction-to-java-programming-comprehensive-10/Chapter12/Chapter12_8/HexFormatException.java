public class HexFormatException extends Exception {
  private char hex;

  public HexFormatException(char hex) {
    super("\nError: \nChar '"+ hex +"' is not a Hexadecimal symbol.\n\nHexadecimal uses sixteen distinct symbols, most often the symbols 0 to 9 to represent values zero to nine, and A to F to represent values ten to fifteen.\n");
    this.hex = hex;
  }

  public char getHex() {
    return hex;
  }
}

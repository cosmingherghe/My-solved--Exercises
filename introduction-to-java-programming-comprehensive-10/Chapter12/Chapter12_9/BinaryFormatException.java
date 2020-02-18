class BinaryFormatException extends Exception {
   
  /**
   *
   */
  private static final long serialVersionUID = 1L;
  private char numberIn;

  public BinaryFormatException() {
    super("\nError \n\nA Binary Number is made up of only 0s and 1s.\n\n");
    this.numberIn = numberIn;
  }
  
  public BinaryFormatException(char numberIn) {
    super("\nError: \nNumber '"+ numberIn +"' is not a Binary Number.  \n\nA Binary Number is made up of only 0s and 1s.\n\n");
    this.numberIn = numberIn;
  }

  public char getnumberIn() {
    return numberIn;
  }
 
}

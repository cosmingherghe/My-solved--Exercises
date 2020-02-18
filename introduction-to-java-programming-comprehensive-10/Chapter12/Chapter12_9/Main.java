import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
 
    // Prompt the user to enter a binary string 
    System.out.print("Enter a binary string: " );
    String binaryStr = input.nextLine();
    input.close();

    try { 
      System.out.println("The decimal value for binary number " + binaryStr + " is " + bin2Dec(binaryStr) );
   }
    catch(BinaryFormatException ex){
       System.out.println( ex.getMessage() );
    } 
  }

  public static int bin2Dec(String binaryString)
    throws BinaryFormatException {

    //check if the string is a binary number
    for(int i = 0; i < binaryString.length(); i++) {
          //A Binary Number is made up of only 0s and 1s
          if( !(0 == binaryString.charAt(i) - '0' ||  1 == binaryString.charAt(i) - '0') )
            throw new BinaryFormatException();
    }

    int binary = Integer.valueOf(binaryString);
    int decimal = 0;
    int n = 0;

    while(true) {
      if(binary == 0){
        break;
      } else {
          int temp = binary%10;
          decimal += temp*Math.pow(2, n);
          binary = binary/10;
          n++;
      }
    }
    return decimal;
  }

}
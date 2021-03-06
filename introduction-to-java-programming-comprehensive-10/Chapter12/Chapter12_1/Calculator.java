public class Calculator {

    private double result, num1, num2;
    private char operator;

    public Calculator(){
        this.result = 0;
    }

    public Calculator(double num1, char operator, double num2) {
        this.num1 = num1;
 
        if( num2 == 0.0 )  //Check Division by a zero 
            throw new ArithmeticException("Division by a zero");
        this.num2 = num2;

        if(validOperator(operator))
            this.operator = operator;

        this.result = doCalculations(num1, num2, operator);   
    }

    private boolean validOperator(char operator) throws IllegalArgumentException {
        if ( (operator == '+') || (operator == '-') || (operator == '*') || (operator == '/') )
            return true;
        else {
            throw new IllegalArgumentException("Operator could be only: - + / *"); 
        } 
    }

    private double doCalculations(double num1, double num2, char operator) {
            switch(operator) { 
                case '-' : return num1 - num2; 
                case '+' : return num1 + num2;  
                case '/' : return num1 / num2;  
                case '*' : return num1 * num2; 
            } 
            return 0.0;  
    }
    
    public void textDisplayResult() {
        System.out.println(this.num1 + " " + this.operator + " " + this.num2 + " = " + this.result);
    }
}

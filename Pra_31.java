import java.lang.Exception;

class NumberFormatException extends Exception{
    public NumberFormatException(String message){
        super(message);
    }
}

public class Pra_31 {
    public static int bin2Dec(String binaryString) throws NumberFormatException{
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
                throw new NumberFormatException("Input string is not a valid binary string.");
            }
        }

        int decimal = 0;
        int base = 1;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2;
        }
        return decimal;
    }

    public static void main(String[] args) {
        String binaryString = "1010102";
        try {
            int decimal = bin2Dec(binaryString);
            System.out.println("Binary string " + binaryString + " is equivalent to decimal number " + decimal);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
Output:
  ->Exception Not Occured.
  Binary string 1010101 is equivalent to decimal number 85

  ->Exception Handled.
  Input string is not a valid binary string.
  ArgumentGreaterThanOne: Too many arguments provided.
*/

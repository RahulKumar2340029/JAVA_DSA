public class Complementtwos {
    public static void main(String[] args) {
        System.out.println(twosComplement(10));

    }
    public static String decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder); // Insert the remainder at the beginning of the string
            decimalNumber /= 2;
        }

        return binary.toString();
    }
    public static int binaryToDecimal(int binary){
        int decimal=0;int i=0;
        while (binary!=0){
            int ld = binary%10;
            decimal = decimal+ld*(int)Math.pow(2,i);
            i++;
            binary = binary/10;
        }
        return decimal;
    }
    public static int twosComplement(int decimalNumber) {
        String binary = decimalToBinary(decimalNumber);
        char[] twos = binary.toCharArray();

        // Invert all the bits
        for (int i = 0; i < twos.length; i++) {
            twos[i] = (twos[i] == '1') ? '0' : '1';
        }

        // Convert char array back to string
        String invertedBinary = new String(twos);

        // Add 1 to make it two's complement
        StringBuilder result = new StringBuilder();
        int carry = 1;

        for (int i = invertedBinary.length() - 1; i >= 0; i--) {
            int bit = invertedBinary.charAt(i) - '0';
            int sum = bit + carry;
            result.insert(0, sum % 2);
            carry = sum / 2;
        }

        if (carry > 0) {
            result.insert(0, '1');
        }
        int binaryint = Integer.parseInt(result.toString());
        return binaryToDecimal(binaryint);
    }

}

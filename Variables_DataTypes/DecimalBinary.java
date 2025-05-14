package Variables_DataTypes;

import java.util.Scanner ;
public class DecimalBinary {
    public static int BinaryToDecimal(int binary){
        int decimal = 0 , base = 1 ;
        while(binary>0){
            int lastDigit = binary % 10 ;
            decimal += lastDigit * base ;
            base *= 2 ;
            binary /= 10 ;
        }
        return decimal ;
    }
    public static String DecimalToBinary(int dec){
        StringBuilder decimal = new StringBuilder();
        while(dec>0){
            decimal.append(dec%2);
            dec /= 2 ;
        }
        return decimal.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary Number : ");
        int binary = sc.nextInt();
        System.out.println("The Decimal Number : "+BinaryToDecimal(binary));
        System.out.println("Enter the Decimal Number : ");
        int dec = sc.nextInt();
        System.out.println("The Binary Number is : "+DecimalToBinary(dec));
        sc.close(); 
    }
}

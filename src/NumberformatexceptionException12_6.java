import java.util.Scanner;

public class NumberformatexceptionException12_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();
        hexToDec(hex.toUpperCase());
    }

    public static void hexToDec(String hex){
        int num = 0;
        try{
            for(int i = 0;i < hex.length(); ++i){
                char hexChar = hex.charAt(i);
                if(hexChar >= '0' && hexChar <= '9'){
                    num = num * 16 + hexChar - '0';
                }else if( hexChar >= 'A' && hexChar <= 'F'){
                    num = num * 16 + hexChar - 'A' + 10;
                }else{
                    throw new Exception("NumberFormatException");
                }
            }
            System.out.println("The decimal value for hex number " + hex + " is " + num);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

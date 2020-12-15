import java.util.Scanner;

public class NumberformatexceptionException12_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();
        bin2Dec(hex);
    }

    public static void bin2Dec(String hex){
        int num = 0;
        try{
            for(int i = 0;i < hex.length(); ++i){
                char binChar = hex.charAt(i);
                if(binChar == '1' || binChar == '0'){
                    num = num * 2 + binChar - '0';
                }
                else{
                    throw new Exception("NumberFormatException");
                }
            }
            System.out.println("The decimal value for bin number " + hex + " is " + num);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

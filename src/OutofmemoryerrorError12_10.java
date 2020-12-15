import sun.awt.windows.WPrinterJob;

import java.util.Scanner;

public class OutofmemoryerrorError12_10 {
    //给数组存的长度设置为int的最大值，就会引起爆栈
    public static void main(String[] args) {
        try{
            int maxL = Integer.MAX_VALUE;
            int a[] = new int[maxL];
            System.out.println(maxL);
        }catch (OutOfMemoryError e){
            System.out.println("OutOfMemoryError!");
        }
    }
}

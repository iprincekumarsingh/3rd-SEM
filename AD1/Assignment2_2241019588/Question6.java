package Assignment2;
import java.util.*;
public class Question6 
{
    static char[] hexChar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static String strHex = "";
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Decimal number");
        int d=obj.nextInt();
        String hex=DectoHex(d);
        System.out.println("The Hexadecimal number is "+hex);
    }
    public static String DectoHex(int dec)
    {
        if(dec == 0) 
            return strHex; 

            int num = dec % 16;
            strHex = hexChar[num] + strHex;
            dec = dec / 16;
            DectoHex(dec);

        return strHex;
        
    }
}

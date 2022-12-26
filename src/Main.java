import java.util.Scanner;

/*
*@Author Emircan Aktaş - 26.Dec.2022
 */
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int base,exponent;
        int result = 1;
        System.out.println("Enter the base :");
        base = inp.nextInt();

        System.out.println("Enter the exponent :");
        exponent = inp.nextInt();

        for (;exponent !=0; --exponent){
            result *=base;
        }
        System.out.println("Result :"+result);


    }
}
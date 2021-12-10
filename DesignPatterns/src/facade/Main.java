/*

FACADE PATTERN

We are in a Mobile shop. The owner has made a GIVEAWAY and the winner was chosen.
He has to choose a number between 1 and 6 to find out what phone he will receive.
After choosing the number, the winner must be shown the model of the phone he won
and how much he should have paid for it.
Using facade design pattern, create an implementation through which a customer can
choose, through a seller, a phone.

*/

package facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int  choice;
    public static void main(String args[]) throws NumberFormatException, IOException {

        System.out.print(" Congratulation! You won the GIVEAWAY! \n");
        System.out.print(" You have to choose a number between 1 and 6 to see which phone you won!. \n");
        System.out.print(" Enter your choice: ");

        do{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            Seller s = new Seller();

            switch (choice) {
                case 1:
                {
                    s.iphoneSale();
                }
                break;
                case 2:
                {
                    s.samsungSale();
                }
                break;
                case 3:
                {
                    s.huaweiSale();
                }
                break;
                case 4:
                {
                    s.xiaomiSale();
                }
                break;
                case 5:
                {
                    s.oppoSale();
                }
                break;
                case 6:
                {
                    s.nokiaSale();
                }
                break;
                default:{}
                return;
            }

        }while(choice!=7);
    }
}


import java.text.NumberFormat;

public class Tester
{
    public static void main(String[] args)
    {

        double avgPurchase;

        Order[] lastYear = new Order[4];

        // I bought most stuff in Pennsylvania but..
        lastYear[0] = new Order(0.06);
        lastYear[1] = new Order(0.06);
        // I did send one thing to my mom in New York City and had to pay their sales tax...
        lastYear[2] = new Order(0.09);
        lastYear[3] = new Order(0.06);


        lastYear[0].setCost(57.93);
        lastYear[1].setCost(257.93);
        lastYear[2].setCost(100.30);
        lastYear[3].setCost(15.67);


        Customer me = new Customer("Kendall" , "Martin" , 12321, lastYear);

        // okay! ready to go !

        System.out.println( me );

        avgPurchase = me.AveragePayment();
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        System.out.println( "has spent an average of " + fmt.format(avgPurchase)  + " per purchase.");
        System.out.println ("\n\n\n psst... if you got $115.50 , you must have it! Congratulations!");

    }
}
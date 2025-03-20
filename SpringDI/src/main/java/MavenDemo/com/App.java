package MavenDemo.com;
import ori.Process;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Classes.Address;
import Classes.Cc;
import in.Cardpayment1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "hihi" );
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter card type (creditcard / debitcard)");
       String card =sc.next();
       Process.getPayment(card);
    }
}

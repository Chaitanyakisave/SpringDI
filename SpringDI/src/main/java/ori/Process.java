package ori;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.Cardpayment1;

public class Process {
     public static void getPayment( String CardType) {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("Configure.xml");
    	 Cardpayment1 cc =(Cardpayment1)context.getBean(CardType);
    	 System.out.println(cc.toString());
     }
}

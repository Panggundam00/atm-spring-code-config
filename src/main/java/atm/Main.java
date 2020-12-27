package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ATMConfig.class) ;
        AtmUI atmUI = new AtmUI(context.getBean(ATM.class));
        atmUI.run();
    }
}

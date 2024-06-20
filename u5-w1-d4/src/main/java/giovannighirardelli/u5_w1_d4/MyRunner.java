package giovannighirardelli.u5_w1_d4;



import giovannighirardelli.u5_w1_d4.entities.Condimenti;
import giovannighirardelli.u5_w1_d4.entities.Drinks;
import giovannighirardelli.u5_w1_d4.entities.Pizze;
import giovannighirardelli.u5_w1_d4.servicies.CondimentiService;
import giovannighirardelli.u5_w1_d4.servicies.DrinksService;
import giovannighirardelli.u5_w1_d4.servicies.PizzeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private PizzeService pizzeService;
    @Autowired
    private CondimentiService condimentiService;
    @Autowired
    private DrinksService drinksService;


    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5W1D4Application.class);

        System.out.println("CIAO DAL RUNNER");
        pizzeService.findAll().forEach(System.out::println);
        condimentiService.findAll().forEach(System.out::println);
        drinksService.findAll().forEach(System.out::println);


        Pizze pizza1 = (Pizze) context.getBean("pizza1");
//        pizzeService.savePizza(pizza1);

        Pizze pizza2 = (Pizze) context.getBean("pizza2");

//        pizzeService.savePizza(pizza2);

        Pizze pizza3 = (Pizze) context.getBean("pizza3");
//        pizzeService.savePizza(pizza3);

        Pizze pizza4 = (Pizze) context.getBean("pizza4");
//        pizzeService.savePizza(pizza4);

        Pizze pizza5 = (Pizze) context.getBean("pizza5");
//        pizzeService.savePizza(pizza5);

        Drinks drink1 = (Drinks) context.getBean("drink1");

//        drinksService.saveDrinks(drink1);
        Drinks drink2 = (Drinks) context.getBean("drink2");
//        drinksService.saveDrinks(drink2);

        Drinks drink3 = (Drinks) context.getBean("drink3");
//        drinksService.saveDrinks(drink3);

        Drinks drink4 = (Drinks) context.getBean("drink4");
//        drinksService.saveDrinks(drink4);

        Drinks drink5 = (Drinks) context.getBean("drink5");
//        drinksService.saveDrinks(drink5);


        Condimenti condimento1 = (Condimenti) context.getBean("condimento1");
//        condimentiService.saveCondimenti(condimento1);

        Condimenti condimento2 = (Condimenti) context.getBean("condimento2");
//        condimentiService.saveCondimenti(condimento2);

        Condimenti condimento3 = (Condimenti) context.getBean("condimento3");
//        condimentiService.saveCondimenti(condimento3);

        Condimenti condimento4 = (Condimenti) context.getBean("condimento4");
//        condimentiService.saveCondimenti(condimento4);

        Condimenti condimento5 = (Condimenti) context.getBean("condimento5");
//        condimentiService.saveCondimenti(condimento5);

        pizzeService.filterByPizzaNameStartsWith("c");










    }
}
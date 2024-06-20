package giovannighirardelli.u5_w1_d4.entities;



import giovannighirardelli.u5_w1_d4.enums.StatoTavolo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class BeansConfig {

    @Bean
    public Pizze pizza1() {

        return new Pizze(250, 12.90, "Capricciosa");

    }

    @Bean
    public Pizze pizza2() {
        return new Pizze(300, 8.90, "Margherita");
    }

    @Bean
    public Pizze pizza3() {
        return new Pizze(200, 7.50, "Marinara");

    }

    @Bean
    public Pizze pizza4() {
        return new Pizze(500, 13, "Tutti i gusti più uno");
    }

    @Bean
    public Pizze pizza5() {
        return new Pizze(130, 6.70, "Bianca");

    }

    @Bean
    public Condimenti condimento1() {
        return new Condimenti(80, 2, "Salame");

    }

    @Bean
    public Condimenti condimento2() {
        return new Condimenti(30, 1.5, "Pomodorini");

    }

    @Bean
    public Condimenti condimento3() {
        return new Condimenti(110, 2.5, "Mozzarella di Bufala");

    }

    @Bean
    public Condimenti condimento4() {
        return new Condimenti(30, 1.85, "Zucchine");

    }

    @Bean
    public Condimenti condimento5() {
        return new Condimenti(48, 0.90, "Peperoncino");

    }

    @Bean
    public Drinks drink1() {
        return new Drinks(300, 3.50, "Coca-cola");

    }

    @Bean
    public Drinks drink2() {
        return new Drinks(250, 3.00, "Coca-cola Zero");

    }

    @Bean
    public Drinks drink3() {
        return new Drinks(540, 6.20, "Birra Media");

    }

    @Bean
    public Drinks drink4() {
        return new Drinks(360, 4.80, "Birra Piccola");

    }

    @Bean
    public Drinks drink5() {
        return new Drinks(608, 7.60, "Calice di vino");

    }

    @Bean(name = "menuToUse")
    public List<MenuItem> menuItems() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(pizza1());
        menuItems.add(pizza2());
        menuItems.add(condimento1());
        menuItems.add(condimento2());
        menuItems.add(condimento3());
        menuItems.add(drink3());
        menuItems.add(drink4());
        menuItems.add(drink5());
        return menuItems;


    }

    @Bean

    public Menu menu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(pizza1());
        menuItems.add(pizza2());
        menuItems.add(pizza3());
        menuItems.add(pizza4());
        menuItems.add(pizza5());
        menuItems.add(condimento1());
        menuItems.add(condimento2());
        menuItems.add(condimento3());
        menuItems.add(condimento4());
        menuItems.add(condimento5());
        menuItems.add(drink1());
        menuItems.add(drink2());
        menuItems.add(drink3());
        menuItems.add(drink4());
        menuItems.add(drink5());
        return new Menu(menuItems);
    }

    @Bean
    public Tavolo tavolo1(){
        return new Tavolo(1, 4, StatoTavolo.OCCUPATO);
    }
//    @Bean
//    public Tavolo tavolo2(){
//        return new Tavolo(2, 8, StatoTavolo.LIBERO);
//    }
//    @Bean
//    public Tavolo tavolo3(){
//        return new Tavolo(3, 3, StatoTavolo.OCCUPATO);
//    }
//    @Bean
//    public Tavolo tavolo4(){
//        return new Tavolo(4, 6, StatoTavolo.OCCUPATO);
//    }
//    @Bean Tavolo tavolo5(){
//        return new Tavolo(5, 2, StatoTavolo.LIBERO);
//    }


    @Bean
    public double importo (Tavolo tavolo, @Value("${tavolo.coperto}") int coperti){
        return pizza1().getPrezzo() + pizza2().getPrezzo() +
                condimento1().getPrezzo() + condimento2().getPrezzo() + condimento3().getPrezzo() +
                drink1().getPrezzo() + drink2().getPrezzo() + drink3().getPrezzo() +
                tavolo.getCoperti() * coperti;
    }

}

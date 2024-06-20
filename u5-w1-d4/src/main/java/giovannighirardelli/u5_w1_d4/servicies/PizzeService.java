package giovannighirardelli.u5_w1_d4.servicies;


import giovannighirardelli.u5_w1_d4.entities.Pizze;
import giovannighirardelli.u5_w1_d4.repositories.PizzeRepositories;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j public class PizzeService {


    @Autowired
    private PizzeRepositories pizzeRepositories;


    public void savePizza(Pizze newPizza){

        if (pizzeRepositories.existsByPizzaName(newPizza.getPizzaName())) {
            throw new RuntimeException("La pizza " + newPizza.getPizzaName() + "esiste già");

        }

        pizzeRepositories.save(newPizza);
        log.info("La pizza {} è stata salvata con successo", newPizza.getPizzaName());

    }

    public List<Pizze> findAll(){
        return pizzeRepositories.findAll();
    }

}

package giovannighirardelli.u5_w1_d4.servicies;


import giovannighirardelli.u5_w1_d4.entities.Drinks;
import giovannighirardelli.u5_w1_d4.repositories.DrinksRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DrinksService {

    @Autowired
    private DrinksRepository drinksRepository;


    public void saveDrinks(Drinks newDrink){



        drinksRepository.save(newDrink);
        log.info("Il drink {} è stato salvato con successo", newDrink.getDrinkName());

    }

    public List<Drinks> findAll(){
        return drinksRepository.findAll();
    }

}

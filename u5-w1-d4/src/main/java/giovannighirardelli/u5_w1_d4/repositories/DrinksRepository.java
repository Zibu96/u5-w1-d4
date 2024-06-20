package giovannighirardelli.u5_w1_d4.repositories;


import giovannighirardelli.u5_w1_d4.entities.Drinks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinksRepository extends JpaRepository<Drinks, Long> {



   boolean existsByDrinkName(String drinkName);

}
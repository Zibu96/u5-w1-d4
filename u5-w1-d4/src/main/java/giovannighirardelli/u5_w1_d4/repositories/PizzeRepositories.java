package giovannighirardelli.u5_w1_d4.repositories;


import giovannighirardelli.u5_w1_d4.entities.Pizze;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PizzeRepositories extends JpaRepository<Pizze, Long> {


    boolean existsByPizzaName(String pizzaName);

}

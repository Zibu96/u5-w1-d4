package giovannighirardelli.u5_w1_d4.repositories;

import giovannighirardelli.u5_w1_d4.entities.Condimenti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondimentiRepository extends JpaRepository<Condimenti, Long> {


    boolean existsByCondimentiName(String condimentoName);
}

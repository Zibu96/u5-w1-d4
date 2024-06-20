package giovannighirardelli.u5_w1_d4.servicies;

import giovannighirardelli.u5_w1_d4.entities.Condimenti;
import giovannighirardelli.u5_w1_d4.entities.Pizze;
import giovannighirardelli.u5_w1_d4.repositories.CondimentiRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CondimentiService {

    @Autowired
    private CondimentiRepository condimentiRepository;


    public void saveCondimenti(Condimenti newCondimento){

        if (condimentiRepository.existsByCondimentiName(newCondimento.getCondimentiName())) {
            throw new RuntimeException("Il condimento " + newCondimento.getCondimentiName() + "esiste già");

        }

        condimentiRepository.save(newCondimento);
        log.info("Il condimento {} è stato salvato con successo", newCondimento.getCondimentiName());

    }

    public List<Condimenti> findAll(){
        return condimentiRepository.findAll();
    }


    }


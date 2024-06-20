package giovannighirardelli.u5_w1_d4.entities;


import giovannighirardelli.u5_w1_d4.enums.StatoTavolo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Tavolo {
    private int numero;
    private int coperti;
    private StatoTavolo statoTavolo;

}

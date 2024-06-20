package giovannighirardelli.u5_w1_d4.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;
@Entity
@Table(name = "menu_items")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "menu_item")
@Getter
@Setter
@ToString
@NoArgsConstructor
public abstract class MenuItem {
    @Id
    @GeneratedValue
    protected long id;
    protected int calorie;
    protected double prezzo;


    public MenuItem(int calorie, double prezzo) {
        Random rnd = new Random();
        this.id = rnd.nextLong();
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

}

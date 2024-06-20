package giovannighirardelli.u5_w1_d4.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue( "pizza")
@Setter
@Getter
@NoArgsConstructor
public class Pizze extends MenuItem {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "pizza_name")
    private String pizzaName;



    public Pizze(int calorie, double prezzo, String pizzaName) {
        super( calorie, prezzo);
        this.pizzaName = pizzaName;
    }

    @Override
    public String toString() {
        return "Pizze{" +
                "pizzaName='" + pizzaName + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}

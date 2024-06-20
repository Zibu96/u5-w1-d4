package giovannighirardelli.u5_w1_d4.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("drink")
@Setter
@Getter
@NoArgsConstructor
public class Drinks extends MenuItem {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    private String drinkName;


    public Drinks(int calorie, double prezzo, String drinkName) {
        super(calorie, prezzo);
        this.drinkName = drinkName;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "drinkName='" + drinkName + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}

package giovannighirardelli.u5_w1_d4.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@DiscriminatorValue("condimento")
@NoArgsConstructor
@Getter
@Setter


public class Condimenti extends MenuItem {
    @Id
    @GeneratedValue
    private long id;
    private String condimentiName;


    public Condimenti(int calorie, double prezzo, String condimentiName) {
        super(calorie, prezzo);
        this.condimentiName = condimentiName;
    }


    @Override
    public String toString() {
        return "Condimenti{" +
                "condimentiName='" + condimentiName + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}

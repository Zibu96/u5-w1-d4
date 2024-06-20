package giovannighirardelli.u5_w1_d4.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Getter
@Setter
@ToString
@AllArgsConstructor
@Component
public class Menu {
    @Autowired
    private List<MenuItem> menuItems;


   public void printMenu(){
       menuItems.forEach(System.out::println);
   }

}

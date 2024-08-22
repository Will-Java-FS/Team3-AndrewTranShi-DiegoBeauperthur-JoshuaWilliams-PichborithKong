
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderId implements Serializable {

    private Long user;  // Maps to User.userId
    private Long menu;  // Maps to Menu.menuId
}

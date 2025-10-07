package model;

import javafx.scene.control.DatePicker;
import lombok.*;

@ToString
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor

public class Order {
    private String orderId;
    private DatePicker orderDate;
    private String custId;
}

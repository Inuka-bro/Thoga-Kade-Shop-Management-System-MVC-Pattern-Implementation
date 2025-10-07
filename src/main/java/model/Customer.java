package model;

import javafx.scene.control.DatePicker;
import lombok.*;

@ToString
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor

public class Customer {

    private String customerID;
    private String title;
    private String name;
    private DatePicker dob;
    private Double salary;
    private String address;
    private String city;
    private String province;
    private String postalCode;

}

package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Orders {
    private Integer orderId;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String contactNumber;
    private String address;
}

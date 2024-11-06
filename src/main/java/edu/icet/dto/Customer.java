package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
    private Integer customerId;
    private String name;
    private String address;
    private String gender;
    private String age;
    private String contactNumber;
    private String note;
}

package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Doctor {
    private Integer doctorId;
    private String name;
    private String address;
    private String contactNumber;
    private String category;
    private String description;
}

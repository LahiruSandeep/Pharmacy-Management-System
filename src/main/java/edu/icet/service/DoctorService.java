package edu.icet.service;

import edu.icet.dto.Doctor;

import java.util.List;

public interface DoctorService {
    void addDoctor(Doctor doctor);

    List<Doctor> getDoctors();

    void deleteById(Integer doctorId);

    List<Doctor> searchByName(String name);

    List<Doctor> searchByContactNumber(String contactNumber);

    List<Doctor> searchByCategory(String category);
}

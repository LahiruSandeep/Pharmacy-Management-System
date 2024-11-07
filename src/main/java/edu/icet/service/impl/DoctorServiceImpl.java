package edu.icet.service.impl;

import edu.icet.dto.Doctor;
import edu.icet.entity.DoctorEntity;
import edu.icet.repository.DoctorRepository;
import edu.icet.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    final DoctorRepository repository;
    final ModelMapper mapper;

    @Override
    public void addDoctor(Doctor doctor) {
        repository.save(mapper.map(doctor, DoctorEntity.class));
    }

    @Override
    public List<Doctor> getDoctors() {
        List<Doctor> doctorList = new ArrayList<>();
        repository.findAll().forEach(doctor -> doctorList.add(mapper.map(doctor, Doctor.class)));
        return doctorList;
    }

    @Override
    public void deleteById(Integer doctorId) {
        repository.deleteById(doctorId);
    }

    @Override
    public List<Doctor> searchByName(String name) {
        List<Doctor> doctorList = new ArrayList<>();
        repository.findByName(name).forEach(entity -> doctorList.add(mapper.map(entity, Doctor.class)));
        return doctorList;
    }

    @Override
    public List<Doctor> searchByContactNumber(String contactNumber) {
        List<Doctor> doctorList = new ArrayList<>();
        repository.findByContactNumber(contactNumber).forEach(entity -> doctorList.add(mapper.map(entity, Doctor.class)));
        return doctorList;
    }

    @Override
    public List<Doctor> searchByCategory(String category) {
        List<Doctor> doctorList = new ArrayList<>();
        repository.findByCategory(category).forEach(entity -> doctorList.add(mapper.map(entity, Doctor.class)));
        return doctorList;
    }
}

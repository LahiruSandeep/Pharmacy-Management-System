package edu.icet.repository;

import edu.icet.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Integer> {
    List<DoctorEntity> findByName(String name);
    List<DoctorEntity> findByContactNumber(String contactNumber);
    List<DoctorEntity> findByCategory(String category);

}

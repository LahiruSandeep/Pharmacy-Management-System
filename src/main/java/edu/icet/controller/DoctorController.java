package edu.icet.controller;

import edu.icet.dto.Doctor;
import edu.icet.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/doctor")
public class DoctorController {

    final DoctorService doctorService;

    @PostMapping("/add-doctor")
    @ResponseStatus(HttpStatus.CREATED)
    public void addDoctor(@RequestBody Doctor doctor){
        doctorService.addDoctor(doctor);
    }

    @GetMapping("/get-all-doctors")
    public List<Doctor> getDoctors() {
        return doctorService.getDoctors();
    }

    @DeleteMapping("delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteById(@PathVariable Integer id){
        doctorService.deleteById(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void updateDoctor(@RequestBody Doctor doctor){
        doctorService.addDoctor(doctor);
    }

    @GetMapping("/search-by-name/{name}")
    public List<Doctor> searchByName(@PathVariable String name){
        return doctorService.searchByName(name);
    }

    @GetMapping("/search-by-contactNumber/{contactNumber}")
    public List<Doctor> searchByContactNumber(@PathVariable String contactNumber){
        return doctorService.searchByContactNumber(contactNumber);
    }

    @GetMapping("/search-by-category/{category}")
    public List<Doctor> searchByCategory(@PathVariable String category){
        return doctorService.searchByCategory(category);
    }
}

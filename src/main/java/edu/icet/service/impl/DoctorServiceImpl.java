package edu.icet.service.impl;

import edu.icet.repository.CustomerRepository;
import edu.icet.repository.DoctorRepository;
import edu.icet.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    final DoctorRepository repository;
    final ModelMapper mapper;
}

package com.spring.repositorys;

import com.spring.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
}

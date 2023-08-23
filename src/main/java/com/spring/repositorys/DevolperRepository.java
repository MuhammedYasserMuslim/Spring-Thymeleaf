package com.spring.repositorys;

import com.spring.model.Devolper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DevolperRepository extends JpaRepository<Devolper,Integer> {
}

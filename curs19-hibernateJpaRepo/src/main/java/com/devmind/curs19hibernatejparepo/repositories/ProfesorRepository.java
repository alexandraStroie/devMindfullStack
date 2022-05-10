package com.devmind.curs19hibernatejparepo.repositories;

import com.devmind.curs19hibernatejparepo.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor,Integer> {
}

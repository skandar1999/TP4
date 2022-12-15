package com.skandar.Etablissement.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skandar.Etablissement.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long>{

}

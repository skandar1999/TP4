package com.skandar.Etablissement.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.skandar.Etablissement.entities.Etablissement;

@RepositoryRestResource(path = "rest")
public interface EtablissementRepository extends JpaRepository<Etablissement, Long> {
	
		List<Etablissement> findByNomEtab (String nom);
		List<Etablissement> findByNomEtabContains(String nom);
		
		List<Etablissement> findByEmployeId(Long id);

}
 
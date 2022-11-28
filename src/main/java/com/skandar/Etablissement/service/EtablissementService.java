package com.skandar.Etablissement.service;

import java.util.List;

import com.skandar.Etablissement.entities.Etablissement;

public interface EtablissementService {
	
	Etablissement saveEtablisement(Etablissement e);
	Etablissement updateEtablissement(Etablissement e);
	void deleteEtablissement(Etablissement e);
	void deleteProduitById(Long id);
	Etablissement getEtablissement(Long id);
	List<Etablissement> getAllEtablissement();
	
	List<Etablissement> findByNomEtablissement(String nom);
	List<Etablissement> findByNomEtablissementContains(String nom);
	List<Etablissement> findByEmployeId(Long id);


}

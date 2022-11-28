package com.skandar.Etablissement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skandar.Etablissement.entities.Etablissement;
import com.skandar.Etablissement.repos.EtablissementRepository;

@Service
public class EtablissementServiceImpl implements EtablissementService  {
	
	@Autowired
	EtablissementRepository etablissementRepository;


	@Override	
	public Etablissement saveEtablisement(Etablissement e) {
		
		return etablissementRepository.save(e);
	}

	@Override
	public Etablissement updateEtablissement(Etablissement e) {
		return etablissementRepository.save(e);
	}

	@Override
	public void deleteEtablissement(Etablissement e) {
		etablissementRepository.delete(e);
		
	}

	@Override
	public void deleteProduitById(Long id) {
		etablissementRepository.deleteById(id);
		
	}

	@Override
	public Etablissement getEtablissement(Long id) {
		return etablissementRepository.findById(id).get();
		
	}

	@Override
	public List<Etablissement> getAllEtablissement() {
		return etablissementRepository.findAll();
	
	}

	@Override
	public List<Etablissement> findByNomEtablissement(String nom) {
		return etablissementRepository.findByNomEtab(nom);
	}

	@Override
	public List<Etablissement> findByNomEtablissementContains(String nom) {
		return etablissementRepository.findByNomEtabContains(nom);	
	}

	
	@Override
	public List<Etablissement> findByEmployeId(Long id) {
		return etablissementRepository.findByEmployeId(id);
	}




}

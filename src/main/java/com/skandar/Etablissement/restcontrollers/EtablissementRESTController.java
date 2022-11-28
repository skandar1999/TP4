package com.skandar.Etablissement.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skandar.Etablissement.entities.Etablissement;
import com.skandar.Etablissement.service.EtablissementService;



@RestController
@RequestMapping("/api")
@CrossOrigin
public class EtablissementRESTController {

	@Autowired
	EtablissementService etablissementService;
	
	@RequestMapping(method=RequestMethod.GET)
	List<Etablissement> getAllEtablissements()
	{
		return etablissementService.getAllEtablissement();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Etablissement getEtablissement(@PathVariable("id") Long id) {
	return etablissementService.getEtablissement(id);

}
	
	@RequestMapping(method = RequestMethod.POST)
	public Etablissement createEtablissement(@RequestBody Etablissement e) {
	return etablissementService.saveEtablisement(e);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Etablissement updateEtablissement(@RequestBody Etablissement e) {
	return etablissementService.updateEtablissement(e);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteEtablissement(@PathVariable("id") Long id)
	{
		etablissementService.deleteProduitById(id);
	}

	
	
}

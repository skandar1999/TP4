package com.skandar.Etablissement;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.skandar.Etablissement.entities.Etablissement;
import com.skandar.Etablissement.repos.EtablissementRepository;

@SpringBootTest
class EtablissementApplicationTests {

	@Autowired
	private EtablissementRepository etablissementRepository;
	@Test
	public void testCreateProduit() {
		Etablissement etab = new Etablissement(null, "maison de web ","nabeul","dar chaaben","haikel");
		etablissementRepository.save(etab);
	}
	
	@Test
	public void testFindEtab()
	{
		Etablissement e = etablissementRepository.findById(3L).get();
	System.out.println(e);
	}

	@Test
	public void testUpdateetabl()
	{
		Etablissement e = etablissementRepository.findById(3L).get();
	e.setNomEtab("Open Bee");
	etablissementRepository.save(e);
	}
	
	@Test
	public void testDeleteProduit()
	{
		etablissementRepository.deleteById(3L);;
		}
		 
		@Test
	public void testListerTousProduits()
		{
		List<Etablissement> etabs = etablissementRepository.findAll();
		for (Etablissement p : etabs)
		{
		System.out.println(p);
		}
		}
	
		@Test
		public void findEtabByNom()
		{
			List <Etablissement> etabls = etablissementRepository.findByNomEtab("sofrecom");
			for (Etablissement p : etabls)
			{
			System.out.println(p);
			}
		}

		
		@Test
		public void findByNomEtabContains()
		{
			List <Etablissement> etabls = etablissementRepository.findByNomEtabContains("s");
			for (Etablissement p : etabls)
			{
			System.out.println(p);
			}
		}
		
		@Test
		public void findByEmployeId()
		{
		List<Etablissement> empl = etablissementRepository.findByEmployeId(1L);
		for (Etablissement e : empl)
		{
		System.out.println(e);
		}
		 }
		
		
}

package com.skandar.Etablissement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Etablissement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idItabli;
	private String nomEtab;
	private String adresse;
	private String ville;
	private String nomDirecteur;
	
	@ManyToOne
	private Employe employe;

	public Long getIdItabli() {
		return idItabli;
	}


	public void setIdItabli(Long idItabli) {
		this.idItabli = idItabli;
	}


	public Employe getEmploye() {
		return employe;
	}


	public void setEmploye(Employe employe) {
		this.employe = employe;
	}


	public Etablissement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Etablissement(Long idItabli, String nomEtab, String adresse, String ville, String nomDirecteur) {
		super();
		this.idItabli = idItabli;
		this.nomEtab = nomEtab;
		this.adresse = adresse;
		this.ville = ville;
		this.nomDirecteur = nomDirecteur;
	}


	public Long idItabli() {
		return idItabli;
	}
	public void setNumero(Long idItabli) {
		this.idItabli = idItabli;
	}
	public String getNomEtab() {
		return nomEtab;
	}
	public void setNomEtab(String nomEtab) {
		this.nomEtab = nomEtab;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getNomDirecteur() {
		return nomDirecteur;
	}
	public void setNomDirecteur(String nomDirecteur) {
		this.nomDirecteur = nomDirecteur;
	}


	@Override
	public String toString() {
		return "Etablissement [numero=" + idItabli + ", nomEtab=" + nomEtab + ", adresse=" + adresse + ", ville=" + ville
				+ ", nomDirecteur=" + nomDirecteur + "]";
	}
	
	

	
	
}

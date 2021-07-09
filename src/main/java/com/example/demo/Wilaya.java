package com.example.demo;

import java.sql.Date;

public class Wilaya {
	private int Id;
	private boolean Actif;
	private int Compte_Creation;
	private int Compte_Maj;
	private Date Date_creation;
	private Date Date_maj;
	private String Nom_arabe;
	private String Nom_latin;
	private String Nom_tamazight;
	
	
	public Wilaya(int id, boolean actif, int compte_Creation, int compte_Maj, Date date_creation, Date date_maj,
			String nom_arabe, String nom_latin, String nom_tamazight) {
		super();
		Id = id;
		Actif = actif;
		Compte_Creation = compte_Creation;
		Compte_Maj = compte_Maj;
		Date_creation = date_creation;
		Date_maj = date_maj;
		Nom_arabe = nom_arabe;
		Nom_latin = nom_latin;
		Nom_tamazight = nom_tamazight;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public boolean isActif() {
		return Actif;
	}


	public void setActif(boolean actif) {
		Actif = actif;
	}


	public int getCompte_Creation() {
		return Compte_Creation;
	}


	public void setCompte_Creation(int compte_Creation) {
		Compte_Creation = compte_Creation;
	}


	public int getCompte_Maj() {
		return Compte_Maj;
	}


	public void setCompte_Maj(int compte_Maj) {
		Compte_Maj = compte_Maj;
	}


	public Date getDate_creation() {
		return Date_creation;
	}


	public void setDate_creation(Date date_creation) {
		Date_creation = date_creation;
	}


	public Date getDate_maj() {
		return Date_maj;
	}


	public void setDate_maj(Date date_maj) {
		Date_maj = date_maj;
	}


	public String getNom_arabe() {
		return Nom_arabe;
	}


	public void setNom_arabe(String nom_arabe) {
		Nom_arabe = nom_arabe;
	}


	public String getNom_latin() {
		return Nom_latin;
	}


	public void setNom_latin(String nom_latin) {
		Nom_latin = nom_latin;
	}


	public String getNom_tamazight() {
		return Nom_tamazight;
	}


	public void setNom_tamazight(String nom_tamazight) {
		Nom_tamazight = nom_tamazight;
	}


	@Override
	public String toString() {
		return "Wilaya [Id=" + Id + ", Actif=" + Actif + ", Compte_Creation=" + Compte_Creation + ", Compte_Maj="
				+ Compte_Maj + ", Date_creation=" + Date_creation + ", Date_maj=" + Date_maj + ", Nom_arabe="
				+ Nom_arabe + ", Nom_latin=" + Nom_latin + ", Nom_tamazight=" + Nom_tamazight + "]";
	}
	
	
	
	
	
	
}

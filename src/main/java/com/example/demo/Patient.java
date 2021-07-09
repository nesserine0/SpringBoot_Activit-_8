package com.example.demo;

public class Patient {
	
	private long Id;
	private String Nom;
	private String Prenom;
	
	public Patient(long id, String nom, String prenom) {
		super();
		Id = id;
		Nom = nom;
		Prenom = prenom;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	@Override
	public String toString() {
		return "Patient [Id=" + Id + ", Nom=" + Nom + ", Prenom=" + Prenom + "]";
	}
	
	
	
	
	
}

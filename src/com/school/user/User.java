package com.school.user;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean(name="user")
public class User implements Serializable {
	private static final long serialVersionUID= 1L;
	private String nom;
	private String prenom;
	
	public void User() {
		System.out.println("Constructeur user");
	}

	public String getNom() {
		System.out.println("getNom");
		return nom;
	}

	public void setNom(String nom) {
		System.out.println("setNom");
		this.nom = nom;
	}

	public String getPrenom() {
		System.out.println("getPrenom");
		return prenom;
	}

	public void setPrenom(String prenom) {
		System.out.println("getPrenom");
		this.prenom = prenom;
	}
	
	
}

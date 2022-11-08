package com.school.user;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="user")

public class User implements Serializable {
	private static final long serialVersionUID= 1L;
	private String nom;
	private String prenom;
	private String mdp;
	private boolean marie;
	private String sexe;
	
	
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
		System.out.println("setPrenom");
		this.prenom = prenom;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public boolean isMarie() {
		return marie;
	}

	public void setMarie(boolean estMarie) {
		this.marie = estMarie;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	public void afficherInfo() {
		String situation;
		if(marie) {
			if(sexe.equals("homme")) {
				situation="marié";
			} else {
				situation="mariée";
			}
		} else {
			situation="celibataire";
		}
		System.out.printf("Bonjour %s %s, vous etes un(e) %s %s\n",prenom,nom,sexe,situation);
	}
	
}

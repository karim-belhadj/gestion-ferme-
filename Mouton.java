package com.beans;

import javax.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author: Matt Brown
 * @since: 8/3/11
 */
@Entity
@Table(name = "moutons")
public class Mouton {

	@Id
	private int num_mouton;
	private int num_mere;
	private int num_pere;
	private String sexe;
	private String date_naissance;
	private String type_mouton;
	private boolean malade;

	/**
	 * Bi-directional relationship between Cat and mouton.
	 */

	public int getNum_mouton() {
		return num_mouton;
	}

	public void setNum_mouton(int num_mouton) {
		this.num_mouton = num_mouton;
	}

	public int getNum_mere() {
		return num_mere;
	}

	public void setNum_mere(int num_mere) {
		this.num_mere = num_mere;
	}

	public int getNum_pere() {
		return num_pere;
	}

	public void setNum_pere(int num_pere) {
		this.num_pere = num_pere;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}

	public String getType_mouton() {
		return type_mouton;
	}

	public void setType_mouton(String type_mouton) {
		this.type_mouton = type_mouton;
	}

	public boolean isMalade() {
		return malade;
	}

	public void setMalade(boolean malade) {
		this.malade = malade;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Mouton mouton = (Mouton) o;

		if (num_mouton != mouton.num_mouton)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		return (int) (num_mouton ^ (num_mouton >>> 32));
	}

	public Mouton() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mouton(int num_mouton, int num_mere, int num_pere, String sexe,
			String date_naissance, String type_mouton) {
		super();
		this.num_mouton = num_mouton;
		this.num_mere = num_mere;
		this.num_pere = num_pere;
		this.sexe = sexe;
		this.date_naissance = date_naissance;
		this.type_mouton = type_mouton;
		this.malade=false;

	}

	@Override
	public String toString() {
		return "Mouton [num_mouton=" + num_mouton + ", num_mere=" + num_mere
				+ ", num_pere=" + num_pere + ", sexe=" + sexe
				+ ", date_naissance=" + date_naissance + ", type_mouton="
				+ type_mouton + "]";
	}

}

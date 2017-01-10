package de.schoollife.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

@ManagedBean
public class AutoCompleteView {

	private String txt1;
	private String txt2;
	private String txt3;
	private String txt4;
	private String txt5;
	private String txt6;
	private String txt7;
	private String txt8;
	private List<String> listClasse;
	private List<String> listSection;
	private List<String> listMatieres;
	private List<String> listTrimestres;

	@PostConstruct
	public void init() {
		listClasse = new ArrayList<>();
		listSection = new ArrayList<>();
		listMatieres = new ArrayList<>();
		listTrimestres = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			listClasse.add(i + "eme" + "M" + i);
		}
		listSection.add("Anglophone");
		listSection.add("Francophone");
		listMatieres.add("Douala");
		listMatieres.add("Medumba");
		listMatieres.add("Foulbe");
		listMatieres.add("Ewondo");
	
		listTrimestres.add("1er");		
		listTrimestres.add("2eme");		
		listTrimestres.add("3eme");	
		listTrimestres.add("annuel");
	}
	
	public List<String> completeTrimestre(String query) {
		return listTrimestres;
	}

	public List<String> completeClasse(String query) {
		return listClasse;
	}
	
	public List<String> completeSection(String query) {
		return listSection;
	}

	public List<String> completeMatieres(String query) {
		return listMatieres;
	}

	
	public List<String> getListTrimestres() {
		return listTrimestres;
	}

	public void setListTrimestres(List<String> listTrimestres) {
		this.listTrimestres = listTrimestres;
	}

	public List<String> getListMatieres() {
		return listMatieres;
	}

	public void setListMatieres(List<String> listMatieres) {
		this.listMatieres = listMatieres;
	}

	public List<String> getListClasse() {
		return listClasse;
	}


	public void setListClasse(List<String> listClasse) {
		this.listClasse = listClasse;
	}


	public List<String> getListSection() {
		return listSection;
	}


	public void setListSection(List<String> listSection) {
		this.listSection = listSection;
	}


	public void onItemSelect(SelectEvent event) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("Item Selected", event.getObject().toString()));
	}

	public String getTxt1() {
		return txt1;
	}

	public void setTxt1(String txt1) {
		this.txt1 = txt1;
	}

	public String getTxt2() {
		return txt2;
	}

	public void setTxt2(String txt2) {
		this.txt2 = txt2;
	}

	public String getTxt3() {
		return txt3;
	}

	public void setTxt3(String txt3) {
		this.txt3 = txt3;
	}

	public String getTxt4() {
		return txt4;
	}

	public void setTxt4(String txt4) {
		this.txt4 = txt4;
	}

	public String getTxt5() {
		return txt5;
	}

	public void setTxt5(String txt5) {
		this.txt5 = txt5;
	}

	public String getTxt6() {
		return txt6;
	}

	public void setTxt6(String txt6) {
		this.txt6 = txt6;
	}

	public String getTxt7() {
		return txt7;
	}

	public void setTxt7(String txt7) {
		this.txt7 = txt7;
	}

	public String getTxt8() {
		return txt8;
	}

	public void setTxt8(String txt8) {
		this.txt8 = txt8;
	}

	public String moveToAgenda() {
		System.out.println("moveToAgenda");
		return "espace-prive-agenda?faces-redirect=true";
	}
	
}
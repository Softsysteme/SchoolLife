package de.schoollife.controller;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.toIntExact;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "formController")
@ViewScoped
public class FormController implements Serializable {

	//private static private static final long serialVersionUID = 1L;

	private boolean classe1 = true;
	private boolean classe2 = true;
	private boolean classe3 = true;
	private boolean classe4 = false;
	private boolean classe5 = false;

	private int merker; 
//TODO dynamically show or hide  fields 
//	private List<Boolean> showField = new ArrayList<>();
//
//	public List<Boolean> getShowField() {
//		return showField;
//	}
//
//	public void setShowField(List<Boolean> showField) {
//		this.showField = showField;
//	}
//	public void showClasseLesson(){
//		showField.add(true);
//	}
//	
//	public void hideField(int index){
//		showField.remove(index);
//	}

	@PostConstruct
	public void init()
	{
		setMerker(0);
	}
	
	public int getMerker() {
		return merker;
	}

	public void setMerker(int merker) {
		this.merker = merker;
	}

	public boolean isClasse1() {
		return classe1;
	}

	public void setClasse1(boolean classe1) {
		this.classe1 = classe1;
	}
	
	public boolean isClasse2() {
		return classe2;
	}

	public void setClasse2(boolean classe2) {
		this.classe2 = classe2;
	}

	public boolean isClasse3() {
		return classe3;
	}

	public void setClasse3(boolean classe3) {
		this.classe3 = classe3;
	}

	public boolean isClasse4() {
		return classe4;
	}

	public void setClasse4(boolean classe4) {
		this.classe4 = classe4;
	}

	public boolean isClasse5() {
		return classe5;
	}

	public void setClasse5(boolean classe5) {
		this.classe5 = classe5;
	}
	
	public void newField(){
		switch(merker){
		case 1: setClasse1(true);
		merker++;
		break;
		case 2: setClasse2(true);
		merker++;
		break;
		case 3: setClasse3(true);
		merker++;
		break;
		case 4: setClasse4(true);
		merker++;
		break;
		case 5: setClasse5(true);
		merker++;
		break;
		
		}

	}

	public void hideField(String _index){
		int index = Integer.valueOf(_index).intValue();
		System.out.println(index);
		switch(index){
		case 1: setClasse1(false);
		merker--;
		break;
		case 2: setClasse2(false);
		merker--;
		break;
		case 3: setClasse3(false);
		merker--;
		break;
		case 4: setClasse4(false);
		merker--;
		break;
		case 5: setClasse5(false);
		System.out.println(isClasse5());
		merker--;
		break;
		
		}

	}
	
}

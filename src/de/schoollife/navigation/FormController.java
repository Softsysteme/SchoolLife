package de.schoollife.navigation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "formController")
@ViewScoped
public class FormController implements Serializable {

	//private static private static final long serialVersionUID = 1L;

	private boolean classe1 = true;

	private List<Boolean> showField = new ArrayList<>();

	public List<Boolean> getShowField() {
		return showField;
	}

	public void setShowField(List<Boolean> showField) {
		this.showField = showField;
	}

	public boolean isClasse1() {
		return classe1;
	}

	public void setClasse1(boolean classe1) {
		this.classe1 = classe1;
	}

	
}

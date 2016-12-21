package de.schoollife.navigation;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "navigationController", eager = true)
@SessionScoped
public class NavigationController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String moveToDashboard() {
		System.out.println("moveToDashboard");
		return "vue-admin?faces-redirect=true";
	}

	public String moveToMonCompte() {
		System.out.println("moveToMonCompte");
		return "espace-prive-mon-compte?faces-redirect=true";
	}

	public String moveToAgenda() {
		System.out.println("moveToAgenda");
		return "espace-prive-agenda?faces-redirect=true";
	}

	public String moveToParametrage() {
		System.out.println("moveToParametrage");
		return "espace-prive-parametrage?faces-redirect=true";
	}

	public String moveToReception() {
		System.out.println("");
		return "mailbox?faces-redirect=true";
	}

	public String moveToEcrire() {
		System.out.println("");
		return "mailbox?faces-redirect=true";
	}

	public String moveToEnvoye() {
		System.out.println("");
		return "mailbox?faces-redirect=true";
	}

	public String moveToBrouillon() {
		System.out.println("");
		return "mailbox?faces-redirect=true";
	}

	public String moveToBoursier() {
		System.out.println("");
		return "comptabilite-boursier?faces-redirect=true";
	}

	public String moveToEncaissement() {
		System.out.println("");
		return "comptabilite-encaissement?faces-redirect=true";
	}

	public String moveToFicheEtat() {
		System.out.println("");
		return "comptabilite-fiche-etat?faces-redirect=true";
	}

	public String moveToRappel() {
		System.out.println("");
		return "comptabilite-rappel?faces-redirect=true";
	}

	public String moveToVacationEns() {
		System.out.println("");
		return "comptabilite-vacation-ens?faces-redirect=true";
	}

	public String moveToCahierText() {
		System.out.println("");
		return "eleve-cahier-text?faces-redirect=true";
	}

	public String moveToCarnetNote() {
		System.out.println("");
		return "eleve-carnet-note?faces-redirect=true";
	}

	public String moveToDossierMedical() {
		System.out.println("");
		return "eleve-dossier-medical?faces-redirect=true";
	}

	public String moveToFicheTechnique() {
		System.out.println("");
		return "eleve-fiche-tech?faces-redirect=true";
	}

	public String moveToListing() {
		System.out.println("");
		return "eleve-listing?faces-redirect=true";
	}

	public String moveToArchivage() {
		System.out.println("");
		return "etablissement-archivage?faces-redirect=true";
	}

	public String moveToExporter() {
		System.out.println("");
		return "etablissement-exporter?faces-redirect=true";
	}

	public String moveToImporter() {
		System.out.println("");
		return "etablissement-importer?faces-redirect=true";
	}

	public String moveToNvlleAnnee() {
		System.out.println("");
		return "etablissement-nvlle-annee?faces-redirect=true";
	}

	public String moveToPurgerInfos() {
		System.out.println("");
		return "etablissement-purger-infos?faces-redirect=true";
	}

	public String moveToInscription() {
		System.out.println("");
		return "finance-inscription?faces-redirect=true";
	}

	public String moveToPaiement() {
		System.out.println("");
		return "finance-paiement?faces-redirect=true";
	}

	public String moveToParametrageFinance() {
		System.out.println("");
		return "finance-parametrage?faces-redirect=true";
	}

	public String moveToAnneeScolaire() {
		System.out.println("");
		return "gestion-annee-scolaire?faces-redirect=true";
	}

	public String moveToClasses() {
		System.out.println("");
		return "gestion-classes?faces-redirect=true";
	}

	public String moveToElearning() {
		System.out.println("");
		return "gestion-elearning?faces-redirect=true";
	}

	public String moveToEnseignants() {
		System.out.println("");
		return "gestion-enseignants?faces-redirect=true";
	}

	public String moveToFournitureScolaire() {
		System.out.println("");
		return "gestion-fournitures-scolaire?faces-redirect=true";
	}

	public String moveToGroupeScolaire() {
		System.out.println("");
		return "gestion-groupe-scolaire?faces-redirect=true";
	}

	public String moveToMatieres() {
		System.out.println("");
		return "gestion-matieres?faces-redirect=true";
	}

	public String moveToPersonnel() {
		System.out.println("");
		return "gestion-personnel?faces-redirect=true";
	}

	public String moveToPreinscription() {
		System.out.println("");
		return "gestion-preinscription?faces-redirect=true";
	}

	public String moveToAbsence() {
		System.out.println("");
		return "vie-scolaire-absence?faces-redirect=true";
	}

	public String moveToDiscipline() {
		System.out.println("");
		return "vie-scolaire-discipline?faces-redirect=true";
	}

	public String moveToPlaning() {
		System.out.println("");
		return "vie-scolaire-gest-planing?faces-redirect=true";
	}

	public String moveToSanction() {
		System.out.println("");
		return "vie-scolaire-sanction?faces-redirect=true";
	}

	public String moveToNews() {
		System.out.println("");
		return "news?faces-redirect=true";
	}
	public String moveToActualite() {
		System.out.println("");
		return "actualite?faces-redirect=true";
	}

	public String moveTo() {
		System.out.println("");
		return "?faces-redirect=true";
	}
	
}
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

	public String moveToCycle() {
		System.out.println("moveToCycle");
		return "gestion-cycle?faces-redirect=true";
	}

	public String moveToSection() {
		System.out.println("moveToSection");
		return "gestion-section?faces-redirect=true";
	}
	
	public String moveToScholarshipFee() {
		System.out.println("moveToScholarshipFee");
		return "scholarship-fee?faces-redirect=true";
	}

	public String moveToBookCategory() {
		System.out.println("moveToBookCategory");
		return "book-category?faces-redirect=true";
	}

	public String moveToCreateBook() {
		System.out.println("moveToCreateBook");
		return "create-book?faces-redirect=true";
	}
	
	public String moveToMonCompte() {
		System.out.println("moveToMonCompte");
		return "cv-admin?faces-redirect=true";
	}
	
	public String moveToLabel() {
		System.out.println("moveToLabel");
		return "gestion-label?faces-redirect=true";
	}

	public String moveToClasse() {
		System.out.println("moveToClasse");
		return "gestion-classes?faces-redirect=true";
	}
	
	public String moveToBulletin() {
		System.out.println("moveToBulletin");
		return "gestion-bulletin?faces-redirect=true";
	}

	public String moveToCourse() {
		System.out.println("moveToCourses");
		return "gestion-matieres?faces-redirect=true";
	}
	
	public String moveToPlaning() {
		System.out.println("moveToPlaning");
		return "gestion-emploi-temps?faces-redirect=true";
	}
	
	public String moveToPersonnel() {
		System.out.println("moveToPlaning");
		return "gestion-personnel?faces-redirect=true";
	}

	public String moveToStudentAdmission() {
		System.out.println("moveToPlaning");
		return "gestion-eleves?faces-redirect=true";
	}
	
	public String moveToAssignCourse() {
		System.out.println("moveToAssignCourse");
		return "assign-courses?faces-redirect=true";
	}
	
	public String moveToStudentAdmission1() {
		System.out.println("moveToPlaning");
		return "gestion-eleve1?faces-redirect=true";
	}

	public String moveToSchoolDetail() {
		System.out.println("moveToSchoolDetail");
		return "institution?faces-redirect=true";
	}

	public String moveToAcademicDetail() {
		System.out.println("moveToAcademicDetail");
		return "academic-detail?faces-redirect=true";
	}

	public String moveToListPersonnel() {
		System.out.println("moveToListPersonnel");
		return "list-personnel?faces-redirect=true";
	}

	public String moveToListStudent() {
		System.out.println("moveToListStudent");
		return "list-student?faces-redirect=true";
	}
	
	public String moveToPrivileges() {
		System.out.println("moveToPrivileges");
		return "privileges?faces-redirect=true";
	}
	
	public String moveToEnquiry(){
		System.out.println("moveToEnquiry");
		return "enquiry?faces-redirect=true";
	}

	public String moveToFournitureScolaire() {
		System.out.println("moveToFournituresScolaire");
		return "gestion-fournitures-scolaire?faces-redirect=true";
	}

	public String moveToGroupeScolaire() {
		System.out.println("moveToGroupeScolaire");
		return "groupe-scolaire?faces-redirect=true";
	}

	public String moveToUserType() {
		System.out.println("moveToUserType");
		return "user-type?faces-redirect=true";
	}

	public String moveToSalarySetting() {
		System.out.println("moveToSalarySetting");
		return "salary-setting?faces-redirect=true";
	}
	
	public String moveToMailboxAdmin() {
		System.out.println("moveToMailboxAdmin");
		return "mailbox-admin?faces-redirect=true";
	}

	public String moveToSMS() {
		System.out.println("moveToSMS");
		return "sms?faces-redirect=true";
	}

	public String moveToDepartement() {
		System.out.println("moveToDepartement");
		return "departement?faces-redirect=true";
	}
	
	public String moveToDesignation() {
		System.out.println("moveToDesignation");
		return "designation?faces-redirect=true";
	}
	
//	public String moveToMonCompte() {
//		System.out.println("moveToMonCompte");
//		return "espace-prive-mon-compte?faces-redirect=true";
//	}

//	public String moveToAgenda() {
//		System.out.println("moveToAgenda");
//		return "espace-prive-agenda?faces-redirect=true";
//	}
//
//	public String moveToParametrage() {
//		System.out.println("moveToParametrage");
//		return "espace-prive-parametrage?faces-redirect=true";
//	}
//
//	public String moveToReception() {
//		System.out.println("");
//		return "mailbox?faces-redirect=true";
//	}
//
//	public String moveToEcrire() {
//		System.out.println("");
//		return "mailbox?faces-redirect=true";
//	}
//
//	public String moveToEnvoye() {
//		System.out.println("");
//		return "mailbox?faces-redirect=true";
//	}
//
//	public String moveToBrouillon() {
//		System.out.println("");
//		return "mailbox?faces-redirect=true";
//	}
//
//	public String moveToBoursier() {
//		System.out.println("");
//		return "comptabilite-boursier?faces-redirect=true";
//	}
//
//	public String moveToEncaissement() {
//		System.out.println("");
//		return "comptabilite-encaissement?faces-redirect=true";
//	}
//
//	public String moveToFicheEtat() {
//		System.out.println("");
//		return "comptabilite-fiche-etat?faces-redirect=true";
//	}
//
//	public String moveToRappel() {
//		System.out.println("");
//		return "comptabilite-rappel?faces-redirect=true";
//	}
//
//	public String moveToVacationEns() {
//		System.out.println("");
//		return "comptabilite-vacation-ens?faces-redirect=true";
//	}
//
//	public String moveToCahierText() {
//		System.out.println("");
//		return "eleve-cahier-text?faces-redirect=true";
//	}
//
//	public String moveToCarnetNote() {
//		System.out.println("");
//		return "eleve-carnet-note?faces-redirect=true";
//	}
//
//	public String moveToDossierMedical() {
//		System.out.println("");
//		return "eleve-dossier-medical?faces-redirect=true";
//	}
//
//	public String moveToFicheTechnique() {
//		System.out.println("");
//		return "eleve-fiche-tech?faces-redirect=true";
//	}
//
//	public String moveToListing() {
//		System.out.println("");
//		return "eleve-listing?faces-redirect=true";
//	}
//
//	public String moveToArchivage() {
//		System.out.println("");
//		return "etablissement-archivage?faces-redirect=true";
//	}
//
//	public String moveToExporter() {
//		System.out.println("");
//		return "etablissement-exporter?faces-redirect=true";
//	}
//
//	public String moveToImporter() {
//		System.out.println("");
//		return "etablissement-importer?faces-redirect=true";
//	}
//
//	public String moveToNvlleAnnee() {
//		System.out.println("");
//		return "etablissement-nvlle-annee?faces-redirect=true";
//	}
//
//	public String moveToPurgerInfos() {
//		System.out.println("");
//		return "etablissement-purger-infos?faces-redirect=true";
//	}
//
//	public String moveToInscription() {
//		System.out.println("");
//		return "finance-inscription?faces-redirect=true";
//	}
//
//	public String moveToPaiement() {
//		System.out.println("");
//		return "finance-paiement?faces-redirect=true";
//	}
//
//	public String moveToParametrageFinance() {
//		System.out.println("");
//		return "finance-parametrage?faces-redirect=true";
//	}
//
//	public String moveToAnneeScolaire() {
//		System.out.println("");
//		return "gestion-annee-scolaire?faces-redirect=true";
//	}
//
//	public String moveToClasses() {
//		System.out.println("");
//		return "gestion-classes?faces-redirect=true";
//	}
//
//	public String moveToElearning() {
//		System.out.println("");
//		return "gestion-elearning?faces-redirect=true";
//	}
//
//	public String moveToEnseignants() {
//		System.out.println("");
//		return "gestion-enseignants?faces-redirect=true";
//	}
//
//
//
//	public String moveToMatieres() {
//		System.out.println("");
//		return "gestion-matieres?faces-redirect=true";
//	}
//
//	public String moveToPersonnel() {
//		System.out.println("");
//		return "gestion-personnel?faces-redirect=true";
//	}
//
//	public String moveToPreinscription() {
//		System.out.println("");
//		return "gestion-preinscription?faces-redirect=true";
//	}
//
//	public String moveToAbsence() {
//		System.out.println("");
//		return "vie-scolaire-absence?faces-redirect=true";
//	}
//
//	public String moveToDiscipline() {
//		System.out.println("");
//		return "vie-scolaire-discipline?faces-redirect=true";
//	}
//
//	public String moveToPlaning() {
//		System.out.println("");
//		return "vie-scolaire-gest-planing?faces-redirect=true";
//	}
//
//	public String moveToSanction() {
//		System.out.println("");
//		return "vie-scolaire-sanction?faces-redirect=true";
//	}
//
//	public String moveToNews() {
//		System.out.println("");
//		return "news?faces-redirect=true";
//	}
//	public String moveToActualite() {
//		System.out.println("");
//		return "actualite?faces-redirect=true";
//	}
//
//	public String moveTo() {
//		System.out.println("");
//		return "?faces-redirect=true";
//	}
	
}
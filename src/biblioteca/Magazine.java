package biblioteca;

public class Magazine {
	private String ISBN;
	private String titolo;
	private String annoPubblicazione;
	private String numPagine;
	private String periodicita;
	
	public Magazine(String ISBN, String titolo, String annoPubblicazione, String numPagine, String periodicita) {
		this.setISBN(ISBN);
		this.setTitolo(titolo);
		this.setAnnoPubblicazione(annoPubblicazione);
		this.setNumPagine(numPagine);
		this.setPeriodicita(periodicita);
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setAnnoPubblicazione(String annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}
	
	public String getAnnoPubblicazione() {
		return annoPubblicazione;
	}
	
	public void setNumPagine(String numPagine) {
		this.numPagine = numPagine;
	}
	
	public String getNumPagine() {
		return numPagine;
	}
	
	public void setPeriodicita(String periodicita) {
		this.periodicita = periodicita;
	}
	
	public String getPeriodicita() {
		return periodicita;
	}
	
	public static String toString(Magazine magazine) {
        return Magazine.class.getName() + " ISBN: " + magazine.ISBN + ">Titolo del libro: " + magazine.titolo
                + ">Anno di pubblicazione: " + magazine.numPagine + ">Numero di pagine: " + magazine.annoPubblicazione;
    }

}

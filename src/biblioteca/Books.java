package biblioteca;

public class Books {
	private String ISBN;
	private String titolo;
	private String annoPubblicazione;
	private String numPagine;
	private String genere;
	private String autore;
	
	public Books(String ISBN, String titolo, String annoPubblicazione, String numPagine, String genere, String autore) {
		this.setISBN(ISBN);
		this.setTitolo(titolo);
		this.setAnnoPubblicazione(annoPubblicazione);
		this.setNumPagine(numPagine);
		this.setGenere(genere);
		this.setAutore(autore);
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
	
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	public String getGenere() {
		return genere;
	}
	
	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	public String getAutore() {
		return autore;
	}
	
	public static String toString(Books book) {
        return Books.class.getName() + " ISBN: " + book.ISBN + ">Titolo del libro: " + book.titolo
                + ">Anno di pubblicazione: " + book.numPagine + ">Numero di pagine: " + book.annoPubblicazione
                + ">Autore: " + book.autore + ">Genere: " + book.genere;
    }

}

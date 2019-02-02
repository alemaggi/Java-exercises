
public class Orario {

	private int docente;
	private int aula;
	private int giorno;
	private int orarioInizio;
	
	Orario(int docente, int aula, int giorno, int orarioInizio){
		this.docente = docente;
		this.aula = aula;
		this.giorno = giorno;
		this.orarioInizio = orarioInizio;
	}
	
	//Setters & Getters
	public int getDocente() {
		return docente;
	}
	public void setDocente(int docente) {
		this.docente = docente;
	}
	public int getAula() {
		return aula;
	}
	public void setAula(int aula) {
		this.aula = aula;
	}
	public int getGiorno() {
		return giorno;
	}
	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}
	public int getOrarioInizio() {
		return orarioInizio;
	}
	public void setOrarioInizio(int orarioInizio) {
		this.orarioInizio = orarioInizio;
	}
}

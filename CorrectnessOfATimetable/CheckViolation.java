import java.util.ArrayList;

public class CheckViolation {

	public int checkMinimunHours(int k, int numDocenti, ArrayList<Orario> orario) {
		int sommaOre = 0;
		int violazioniVincolo3 = 0;
		for (int i = 1; i <= numDocenti; i++) {
			for (int j = 0; j < orario.size(); j++) {
				if (i == orario.get(j).getDocente()) {
					sommaOre ++;
				}
			}
			if (sommaOre < k) {
				violazioniVincolo3 ++;
			}
		}
		return violazioniVincolo3;
	}
	
	public int checkBondOne(ArrayList<Orario> orario) {
		int violazioni = 0;
		for (int i = 0; i < orario.size(); i++) {
			for (int k = 0; k < orario.size() - 1; k++) {
				if ((orario.get(k).getDocente() == orario.get(k + 1).getDocente()) &&
					(orario.get(k).getAula() == orario.get(k + 1).getAula())) {
					if ((orario.get(k).getGiorno() == orario.get(k + 1).getGiorno()) ||
						(orario.get(k).getOrarioInizio() == orario.get(k + 1).getOrarioInizio())) {
							violazioni++;
					}
				}
			}
		}
		return violazioni;
	}
	
	public int checkBondTwo(ArrayList<Orario> orario) {
		int violazioni = 0;
		for (int i = 0; i < orario.size(); i++) {
			for (int k = 0; k < orario.size() - 1; k++) {
				if ((orario.get(k).getAula() == orario.get(k + 1).getAula()) &&
					(orario.get(k).getGiorno() == orario.get(k + 1).getGiorno()) &&
					(orario.get(k).getOrarioInizio() == orario.get(k + 1).getOrarioInizio()) &&
					(orario.get(k).getDocente() != orario.get(k+1).getDocente())) {
						violazioni++;
				}
			}
		}
		return violazioni;
	}
}

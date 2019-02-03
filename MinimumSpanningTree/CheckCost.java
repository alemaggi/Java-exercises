import java.util.ArrayList;

public class CheckCost {

	private ArrayList<Integer[]> posizioniInserite = new ArrayList<Integer[]>();
	private ArrayList<Integer[]> connessioniEff = new ArrayList<Integer[]>();
	
	public void findConnection(ArrayList<Integer[]> connessioni) {
		for (int i = 0; i < connessioni.size(); i++) {
			Integer[] tmp = connessioni.get(i);
			int min = findMinValuePosition(tmp);
			if (tmp[min] != 0) {
				int tmpX = i;
				int tmpY = min;
				if (!checkSymmetric(tmpX, tmpY, posizioniInserite)) {
					Integer[] connectionPos = new Integer[3];
					connectionPos[0] = i;
					connectionPos[1] = min;
					connectionPos[2] = tmp[min]; //costo
					connessioniEff.add(connectionPos);
				}
			}
		}
	}
	
	public int findMinValuePosition(Integer[] array) {
		int minPos = 0;
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if ((array[i] < min) && (array[i] != 0)) {
				min = array[i];
				minPos = i;
			}
		}
		return minPos;
	}
	
	public boolean checkSymmetric(int x, int y, ArrayList<Integer[]> poiszioniInserite) {
		for (int i = 0; i < posizioniInserite.size(); i++) {
			Integer[] tmp = posizioniInserite.get(i);
			int xTmp = tmp[0];
			int yTmp = tmp[1];
			
			if (x == yTmp && y == xTmp) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Integer[]> getPosizioniInserite() {
		return posizioniInserite;
	}

	public void setPosizioniInserite(ArrayList<Integer[]> posizioniInserite) {
		this.posizioniInserite = posizioniInserite;
	}

	public ArrayList<Integer[]> getConnessioniEff() {
		return connessioniEff;
	}

	public void setConnessioniEff(ArrayList<Integer[]> connessioniEff) {
		this.connessioniEff = connessioniEff;
	}
	
	
	
}

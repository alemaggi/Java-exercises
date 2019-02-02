import java.util.ArrayList;

public class FindPath {
	
	private boolean flag = false;
	
	public void findPath(int coppiaX, int coppiaY, ArrayList<Archi> arco) {
		ArrayList<Archi> arcoCopy = new ArrayList<Archi>(arco);
		
		for (int i = 0; i < arcoCopy.size(); i++) {
			if (arcoCopy.get(i).getxI() == coppiaX) {
				if (arcoCopy.get(i).getxJ() == coppiaY) {
					setFlag(true);
				}
				if ((arcoCopy.get(i).getxI() != coppiaY) && (!isFlag())) {
					int tmp = arcoCopy.get(i).getxJ();
					arcoCopy.remove(i);
					findPath(tmp, coppiaY, arcoCopy);
				}
			}
		}
	}
	
	//setter & getter
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean falg) {
		this.flag = falg;
	}
}

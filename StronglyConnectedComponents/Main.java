import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		InputReader in = new InputReader();
		in.readInputFile(args[0]);
		FindPath fp = new FindPath();
		fp.deleteOneWayConnectio(in.getConnection());
		fp.deleteRedundancy(in.getConnection());		
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();
		
		for (int i = 0; i < in.getConnection().size(); i++) {
			fp.setFlag(false);
			fp.getFinalConnection().clear();
			fp.findConnection(in.getConnection(), in.getConnection().get(i).getStart());
			Integer[] tmp = new Integer[fp.getFinalConnection().size()];
			for (int k = 0; k < fp.getFinalConnection().size(); k++) {
				tmp[k] = fp.getFinalConnection().get(k);
			}
			list.add(tmp);
		}
		
		//remove subset in connection
		for (int i = 0; i < list.size(); i++) {
			Integer[] arr = list.get(i);
			for (int k = 0; k < list.size(); k++) {
				if (k != i) {
					boolean subset = fp.isSubset(arr, list.get(k), arr.length, list.get(k).length);
					if (subset)
						list.remove(list.get(k));
				}
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			Integer[] arrTmp = list.get(i);
			for (int k = 0; k < arrTmp.length; k++) {
				System.out.print(arrTmp[k] + " ");
			}
			System.out.println();
		}
	}
}

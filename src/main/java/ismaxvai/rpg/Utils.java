package ismaxvai.rpg;

public class Utils {
	
	public int correctDiceFormat(String instruction){
		int n = instruction.length();
		if(n > 5 || n < 3) return -3;
		int nd = 0;
		for(int i = 0; i < n; ++i){
			char a = instruction.charAt(i);
			if (a != 'd' && (a < '0' && a > '9')) return -3;
			else if(a == 'd') {
				++nd;
				if(nd > 1) return -3;
			}
		}
		if (nd == 0) return -3;
		return 1;
	}
	
}

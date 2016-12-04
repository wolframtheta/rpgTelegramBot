package ismaxvai.rpg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Arrays;

/*  Format: a String "uwdyz" where "u", "w", "y" and "z" are integers,
 *  and "d" is just the "d" character. The number of integers must be
 *  minimum one at left and minimum one at right, and the char "d" must
 *  be always there.
 *  
 *   ERROR CODES:
 *   -1: too many dices in a roll
 *   -2: illegal dice type, it only can be used dices of 4, 6, 8, 10, 12 and 20 faces
 */


public class DiceV2 {
	private int nDices;
	private int tDices;
	private int maxNdices = 20;
	static List<Integer> permittedDices = new ArrayList<Integer>()
		{{  add(4);
	    	add(6);
	    	add(8);
	    	add(10);
	    	add(12);
	    	add(20);
		}};
	
	protected int getDicesNumber(String instruction){
		if(instruction.charAt(1) == 'd') return Character.getNumericValue(instruction.charAt(0));
		return (Character.getNumericValue(instruction.charAt(0))*10) + Character.getNumericValue(instruction.charAt(1));
	}
	
	private int getDicesType(String instruction){
		int i;
		for(i = 0; instruction.charAt(i) != 'd'; ++i);
		if(instruction.length()-(i) == 1) return Character.getNumericValue(instruction.charAt(i));
		return (Character.getNumericValue(instruction.charAt(i))*10) + Character.getNumericValue(instruction.charAt(i+1));
	}
	
	private int legalDiceType(int type){
		for(int i: permittedDices){
			if(i == type) return 0;
		}
		return -1;
	}
	
	private int randomize(int n){
		Random randomGenerator = new Random();
		return randomGenerator.nextInt(n+1);
	}
	
	public List<Integer> rollDices(String instruction){
		nDices = getDicesNumber(instruction);
		if(nDices > 20) return Arrays.asList(-1);
		tDices = getDicesType(instruction);
		if(legalDiceType(tDices) == -1)  return Arrays.asList(-2);
		List<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < nDices; ++i){
			result.add(randomize(tDices));
		}
		return result;
	}
}

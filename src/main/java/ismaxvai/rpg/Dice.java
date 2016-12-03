package ismaxvai.rpg;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Dice {
		private int maxDices = 20;
		private int minDices = 0;
		
		/*
		   Com utilitzar la classe:
						introduir una tirada en forma d'estring utilitzant la funció fullRolling. Full rolling retorna
						un List amb tots els valors obtinguts en la tirada. La tirada es representa d'aquesta manera:
						"xdy" on x es el nombre de daus i "y" es el tipus de dau (4, 6, 8, 10, 12 o 20). Si hi ha algun
						error es retorna un List amb l'error code associat.
		   
		   
		   ERROR CODES:
						-1: Too many dices
						-2: Illegal characters
						-3: Illegal dice number
		*/
		public int totalNumberDices(String instruction){
			int fin = instruction.length();
			int n = 0;
			for(int i = 0; i < fin; ++i){
				if(instruction.charAt(i) == 'd') {
					if(instruction.charAt(2) == 'd'){
						n = Character.getNumericValue(instruction.charAt(i-1))+Character.getNumericValue(instruction.charAt(i-2))*10;
					}
					else{
						n = Character.getNumericValue(instruction.charAt(i-1));
					}
				}
			}
			return n;
		}
		
		public int numberOfTheDice(String instruction){
			int fin = instruction.length();
			int n = 0;
			for(int i = 0; i < fin; ++i){
				if(instruction.charAt(i) == 'd') {
					if(fin == 5 || (fin > 3 && instruction.charAt(1) == 'd')){
						n = Character.getNumericValue(instruction.charAt(i+2))+Character.getNumericValue(instruction.charAt(i+1))*10;
					}
					else{
						n = Character.getNumericValue(instruction.charAt(i+1));
					}
				}
			}
			return n;
		}
		
		//Retorna un nombre random entre 1 i n
		private int randomize(int n){
			Random randomGenerator = new Random();
			return randomGenerator.nextInt(n+1);
		}
		
	
		//breaking: format de dau incorrecte
		private int breaking(String instruction){
			int n = instruction.length();
			if(n > 5) return 0;
			int nd = 0;
			for(int i = 0; i < n; ++n){
				char a = instruction.charAt(i);
				if (a != 'd' && (a < '0' && a > '9')) return 0;
				else if(a == 'd') {
					++nd;
					if(nd > 1) return 0;
				}
			}
			if (nd == 0) return 0;
			return 1;
		}

		//Retorna la tirada realitzada, no discrimina entre daus.
		public List<Integer> fullRolling(String instruction){
			List<Integer> result = new ArrayList<Integer>();
			if(breaking(instruction) == 0){
				result.add(-2);
			}
			else {
				int nDices = totalNumberDices(instruction);
				//total Number dices ens indica la suma total del nombre de daus
				if(nDices < 21) {
					
					//----------------------------------------------------------
					int tDice = numberOfTheDice(instruction);
					if (tDice != 4 && tDice != 6 && tDice != 8 && tDice != 10 && tDice != 12 && tDice != 20) {
						result.add(-3);
						return result;
					}
					//----------------------------------------------------------
					for(int j = 0; j < nDices; ++j) result.add(randomize(tDice));
				}
				else {
					result.add(-1);
				}
			}
			return result;
		}
}

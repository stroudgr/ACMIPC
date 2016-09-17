import java.util.LinkedList;

import ProblemG.Brownie;

public class ProblemG {
	public class Brownie{
		
		public int m;
		public int n;
		public String person;
		/**
		 * 
		 * @param person
		 * @param m is the number of "columns" (
		 * @param n
		 */
		public Brownie(String person, int m, int n){
			this.m = m;
			this.n = n;
			this.person = person;
		}
		/**
		 * Returns outcomes for cutting mxn brownie horizontally
		 * @return 
		 */
		public LinkedList<Brownie[]> cutHorizontal(){
			
			LinkedList<Brownie[]> outcomes = new LinkedList();
			
			//make a 1xn piece +(m-1)xn piece, 2xn,...,(m/2)xn
			for (int i=1; i<= m/2; i++){
				//A pair of Brownie (two pieces)
				Brownie B[]= {new Brownie("Vicky",i,n),new Brownie("Vicky",m-i,n)};
				outcomes.add(B);
			}
			return outcomes;
			
		}
		
		
		/**
		 * Returns whether the person specified can win.
		 */
		public String getWins(){
			
			//Base case is when the length or height is one for the player
			
			//Otherwise
			
			//get set of possible cuts
			
			if (person.equals("Harry")){
				LinkedList<Brownie[]> outcomes = this.cutHorizontal();				
				//for each outcome:
				while (!outcomes.isEmpty()){
					Brownie[] current = outcomes.pop();
					Brownie b1 = current[0]; Brownie b2 = current[1];
					String s1 = b1.getWins(), s2 = b2.getWins();
					//Case when 
					if (s1 == "Vicky cannot win" && s2 == "")
					
				}
			}
			
			
		}
		
		
	}
	
	
}

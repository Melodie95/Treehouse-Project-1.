public class Game {
	
	public static void main(String[] args){
		
		Prompter prompter = new Prompter();
		Jar jar = prompter.PromptforTypeAndMaxNumb();
		jar.fill();
		System.out.printf("The maximum number of %s in the jar is %d %n" ,jar.getType(), jar.getMaxNumberOfItems());
		
		
		jar.guess();
	
		 
			
			
			
		}
	}


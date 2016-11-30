package fcu.iecs.oop.pokemon;
import java.util.Random;

public class GYM {
	
	public static void fight(Pokemon p1,Pokemon p2){
		Random game = new Random() ;
		
		if (game.nextInt(1)+1 == 1){
			System.out.println("winner is "+p1.Getname()+" . ") ;
	        p1.SetCP(p1.GetCP()+500) ;
		}
		else{
			System.out.println("winner is "+p2.Getname()+" . ") ;
			p2.SetCP(p2.GetCP()+500) ;
		}
	    }

}

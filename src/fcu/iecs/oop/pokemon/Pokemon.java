package fcu.iecs.oop.pokemon;


public class Pokemon {
	
	private String name ;
	private int CP ;
	
	public Pokemon(String name,int CP) {
		this.name = name ;
		this.CP = CP ;
	}
	public String Getname(){
		return this.name ;
	}
	public int GetCP(){
	    return this.CP ;	
	}
	public void SetCP(int CP){
		this.CP = CP ;
	}
	public void REset(){
		name = "NULL" ;
		CP = 0 ;
	}

}

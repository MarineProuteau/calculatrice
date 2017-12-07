package sdc;

public class RationalValue extends Value {
	
	private int numerateur;
	private int denumerateur;
	
	public RationalValue() {
		this.numerateur = 0 ;
		this.denumerateur = 0;
    }

    public RationalValue(int numerateur, int denumerateur) {
    	this.numerateur = numerateur ;
    	this.denumerateur = denumerateur;
    }

    public boolean parse(String s) {
		try {
			String[] splittedInput = s.split("#");
		    this.numerateur = Integer.parseInt(splittedInput[0]);
		    this.denumerateur = Integer.parseInt(splittedInput[1]);
		} catch (NumberFormatException e) {
		    return false;
		}
		return true;
    }
}

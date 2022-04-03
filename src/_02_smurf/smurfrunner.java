package _02_smurf;

public class smurfrunner {
public static void main(String[] args) {
	
	Smurf smurf = new Smurf("handy smurf");
	smurf.eat();
	smurf.getName();
	Smurf papasmurf = new Smurf("papa smurf");
	papasmurf.getName();
	papasmurf.getHatColor();
	papasmurf.isGirlOrBoy();
	Smurf smurfette = new Smurf("smurfette");
	smurfette.getName();
	smurfette.getHatColor();
	smurfette.isGirlOrBoy();
}
}

package _01_sea_creature;

public class seacreaturerunner {
public static void main(String[] args) {
	SeaCreature creature = new SeaCreature("Spongebob");
	creature.eat();
	creature.laugh();
	SeaCreature skinnycreature = new SeaCreature("Squidward");
	skinnycreature.eat();
	skinnycreature.laugh();
	SeaCreature fatcreature = new SeaCreature("Patrick");
	fatcreature.eat();
	fatcreature.laugh();
}
}

package _99_extra;

public class pixelrunner {
public static void main(String[] args) {
	PixelParty party = new PixelParty();
	party.setColor(10, 46, 69);
	party.drawCircle(5, 9, 19);
	party.drawRectangle(50, 150, 40, 60);
	party.saveImage();
	party.displayImage();
}
}

package week4;
/*
 * Section Handout #6: More Arrays and HashMaps
 *
 * 1. Image processing (Chapter 11, exercise 12, page 458)
Write a method flipHorizontal that works similarly to the flipVertical method
presented in the chapter except that it reverses the picture in the horizontal dimension.
Thus, if you had a GImage containing the image on the left (of Jan Vermeer’s The
Milkmaid, c. 1659), calling flipHorizontal on that image would return a new GImage
as shown on the right:
 */
import acm.program.GraphicsProgram;
import acm.program.*;
import acm.graphics.*;


public class ImageProcessing extends GraphicsProgram {

	public void run() {	
		String filename = "Milkmaid.gif";  
		GImage image = new GImage(filename);
		GImage invertImage = flipHorizontal(image);
		
		image.scale(0.2);
		add(image, 10, 50);
	
		invertImage.scale(0.2);
		add(invertImage, 380, 50);	
	}
	
	public GImage flipHorizontal(GImage image) {
		
		int[][] array = image.getPixelArray();
		int width = array[0].length;
		int height = array.length;
		for (int row = 0; row < height; row++) {
			for (int p1 = 0; p1 < width / 2; p1++) {
				int p2 = width - p1 - 1;
				int temp = array[row][p1];
				array[row][p1] = array[row][p2];
				array[row][p2] = temp;
			}
		}
		
		return new GImage(array);
	}
	
}

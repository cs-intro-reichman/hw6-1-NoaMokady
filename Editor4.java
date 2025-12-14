import java.awt.Color;

/**
 * The program recieves two command-line arguments: a string representing the name
 * of the PPM file of an image and the number of morphing steps (an int). 
 * Morphs the image from color to black and white, gradually, in n steps.
 * For example, to morph the cake from color to black and white in 50 steps, use:
 * java Editor4 cake.ppm 50
 */
public class Editor4 {
    public static void main(String[] args) {
        String imageFile = args[0];
        int n = Integer.parseInt(args[1]);
        Color[][] Image = Runigram.read(imageFile);
        Color[][] grayScaledImage = Runigram.grayScaled(Image);
        Runigram.setCanvas(Image);
        Runigram.morph(Image, grayScaledImage, n);
    }
}

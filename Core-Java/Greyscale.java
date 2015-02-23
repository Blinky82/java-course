import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 * Created by blinky on 22.02.15.
 */
public class Greyscale {

    BufferedImage picture;
    int width;
    int height;

    public Greyscale() {

        try {
            File input = new File("john-romero.jpg");
            picture = ImageIO.read(input);
            width = picture.getWidth();
            height = picture.getHeight();

            for(int i = 0; i < height; i++){

                for(int j = 0; j < width; j++){

                    Color c = new Color(picture.getRGB(j, i));
                    int red = (int)(c.getRed() * 0.299);
                    int green = (int)(c.getGreen() * 0.587);
                    int blue = (int)(c.getBlue() *0.114);
                    Color convertToGreyscale = new Color(red+green+blue,red+green+blue,red+green+blue);

                    picture.setRGB(j,i,convertToGreyscale.getRGB());
                }
            }

            File ouptut = new File("john-romero-greyscale.jpg");
            ImageIO.write(picture, "jpg", ouptut);

        } catch (Exception e) {}
    }

    static public void main(String args[]) throws Exception
    {
        Greyscale obj = new Greyscale ();
    }
}


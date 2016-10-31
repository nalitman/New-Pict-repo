import java.awt.*;
import java.util.*;
import java.util.List;

public class Explore
{
    public static void main(String [] args)
    {
        Picture p = new Picture("images/Selfie.jpg");
        
        p.explore();
        pixels = p.getPixels();
        //R 209 G 138 B 118
        
        for (Pixel pixelObj : pixels)
        {
            if((pixelObj.getRed() < 224 && pixelObj.getRed() > 194) && 
               (pixelObj.getGreen() < 153 && pixelObj.getGreen() > 123) &&
               (pixelObj.getBlue() < 133 && pixelObj.getBlue() > 103))
               pixelObj.setBlue(255);
            }
    }
}

import java.awt.*;
import java.util.*;
import java.util.List;


public class PictureLoops
{
    public static void main(String [] args)
    {
        //Initializes pictures
        Picture p1 = new Picture("images/temple.jpg");
        Picture p2 = new Picture("images/temple.jpg");
        Picture p3 = new Picture("images/temple.jpg");
        Picture p4 = new Picture("images/temple.jpg");
        Picture p5 = new Picture("images/temple.jpg");
        Picture p6 = new Picture("images/temple.jpg");
        Picture p7 = new Picture("images/temple.jpg");
        Picture p8 = new Picture("images/temple.jpg");
        Picture p9 = new Picture("images/temple.jpg");
        Picture p10 = new Picture("images/Selfie.jpg");
        Picture p11 = new Picture("images/Selfie.jpg");
        Picture p12 = new Picture("images/temple.jpg");
        Picture p13 = new Picture("images/temple.jpg");
        Pixel [] pixels;
        Color color;
        //Original Picture
        p1.explore();
        
        //maxBlue()
        //Assigns pixels in image to an array
        pixels = p1.getPixels();
        
        //Loops through objects in pixels array
        for (Pixel pixelObj : pixels)
        {
            pixelObj.setBlue(255);
        }
        p1.explore();
        
        //maxRed()
        //Assigns pixels in image to an array
        pixels = p2.getPixels();
        
        //Loops through objects in pixels array
        for (Pixel pixelObj : pixels)
        {
            pixelObj.setRed(255);
        }
        p2.explore();
        
        //maxGreen()
        //Assigns pixels in image to an array
        pixels = p3.getPixels();
        
        //Loops through objects in pixels array
        for (Pixel pixelObj : pixels)
        {
            pixelObj.setGreen(255);
        }
        p3.explore();
        
        //negate()
        //Assigns pixels in image to an array
        pixels = p4.getPixels();
        
        //Initializes variables
        int red, blue, green;
        Color negative;
        
        //Loops through objects in pixels array
        for (Pixel pixelObj : pixels)
        {
            //Creates the opposite value color
            red = 255 - pixelObj.getRed();
            blue = 255 - pixelObj.getBlue();
            green = 255 - pixelObj.getGreen();
            negative = new Color(red, blue, green);
            
            //Sets the color
            pixelObj.setColor(negative);
            
        }
        p4.explore();
        
        //adjustRed(double factor)
        //Assigns pixels in image to an array
        pixels = p5.getPixels();
        
        //Initializes variables
        final double FACTOR = .5;
        int value;
        
        //Loops through objects in pixels array
        for (Pixel pixelObj : pixels)
        {
            //Gets red value
            value = pixelObj.getRed();
            
            //Decreases red by factor
            value = (int) (value * FACTOR);
            
            //Sets red value to new value
            pixelObj.setRed(value);
        }
        p5.explore();
        
        //adjustGreen(double factor)
        //Assigns pixels in image to an array
        pixels = p6.getPixels();
        
        //Initializes variables
        final double FACTOR1 = 1.5;
        int value1;
        
        //Loops through objects in pixels array
        for (Pixel pixelObj : pixels)
        {
            //Gets green value
            value1 = pixelObj.getGreen();
            
            //Decreases red by factor
            value1 = (int) (value1 * FACTOR1);
            
            //Sets red value to new value
            pixelObj.setGreen(value1);
        }
        p6.explore();
        
        //adjustBlue(double factor)
        //Assigns pixels in image to an array
        pixels = p7.getPixels();
        
        //Initializes variables
        final double FACTOR2 = .25;
        int value2;
        
        //Loops through objects in pixels array
        for (Pixel pixelObj : pixels)
        {
            //Gets blue value
            value2 = pixelObj.getBlue();
            
            //Decreases blue by factor
            value2 = (int) (value2 * FACTOR2);
            
            //Sets red value to new value
            pixelObj.setBlue(value2);
        }
        p7.explore();
        
        //greyscale()
        //Makes the picture greyscale
        pixels = p8.getPixels();
        int value99, value98, value97, avg;
        
        for ( Pixel pixelObj : pixels)
        {
            //Get current pixel
            value99 = pixelObj.getRed();
            value98 = pixelObj.getBlue();
            value97 = pixelObj.getGreen();
            
            //Average the color value
            avg = (int) ((value99 + value98 + value97)/3);
            
            //Set the color
            pixelObj.setRed(avg);
            pixelObj.setBlue(avg);
            pixelObj.setGreen(avg);
            
            //OR do this
            //pixel.setColor(new Color(avg, avg, avg));
        }
        p8.explore();
        
        //darken()
        //Darkens the picture
        pixels = p9.getPixels();
        
         for (Pixel pixelObj : pixels)
        {   //pixelObj is current pixel/spot
            
            //Get the current color
            color = pixelObj.getColor();
            
            //Ger a lighter color
            color = color.darker();
            
            //Set the pixel color to lighter color
            pixelObj.setColor(color);
        }
        p9.explore();
        
        //blueify()
        //makes a face blue
        int r = 243, g = 161, b = 139;
        pixels = p10.getPixels();
        Color blue1 = new Color(0, 0, 255);
        
        for (Pixel pixelObj : pixels)
        {
            if((pixelObj.getRed() > (r - 30) && pixelObj.getRed() < (r + 30)) &&
                (pixelObj.getGreen() > (g - 30) && pixelObj.getGreen() < (g + 30)) &&
                (pixelObj.getBlue() > (b - 30) && pixelObj.getBlue() < (b + 30)))
                pixelObj.setColor(blue1);
            }
            p10.explore();
            
       //colorify()
       //changes the color of a facial feature
       int R = 41, G = 33, B = 30;
       pixels = p11.getPixels();
       Color red1 = new Color(255, 0, 0);
       
       for (Pixel pixelObj : pixels)
       {
           if((pixelObj.getRed() > (R - 20) && pixelObj.getRed() < (R + 20)) &&
                (pixelObj.getGreen() > (G - 20) && pixelObj.getGreen() < (G + 20)) &&
                (pixelObj.getBlue() > (B - 20) && pixelObj.getBlue() < (B + 20)))
                pixelObj.setColor(red1);
            }
            p11.explore();
            
      //swap2()
       //Changes green value for red
       pixels = p12.getPixels();
       
       for (Pixel pixelObj : pixels)
       {
           pixelObj.setGreen(pixelObj.getRed());
        }
        p12.explore();
      
      //swap3()
       //swap all three red = green, green = blue, blue = red
       int hold, hold1, hold2;
       pixels = p13.getPixels();
       
       for(Pixel pixelObj : pixels)
       {
           hold = pixelObj.getGreen();
           hold1 = pixelObj.getRed();
           hold2 = pixelObj.getBlue();
           
           pixelObj.setRed(hold);
           pixelObj.setGreen(hold2);
           pixelObj.setBlue(hold1);
        }
        p13.explore();
            
            

}
}
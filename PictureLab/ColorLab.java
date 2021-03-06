
import java.awt.*;
import java.util.*;
import java.util.List;

public class ColorLab
{
        public static void main(String [] args)
        {
        //maxBlue()
        //Assigns pixels in image to an array
        pixels = p1.getPixels();
        
        //Loops through objects in pixels array
        for (Pixel pixelObj : pixels)
        {
            pixelObj.setBlue(255);
        }
        
        //maxRed()
        //Assigns pixels in image to an array
        pixels = p2.getPixels();
        
        //Loops through objects in pixels array
        for (Pixel pixelObj : pixels)
        {
            pixelObj.setRed(255);
        }
        
        //maxGreen()
        //Assigns pixels in image to an array
        pixels = p3.getPixels();
        
        //Loops through objects in pixels array
        for (Pixel pixelObj : pixels)
        {
            pixelObj.setGreen(255);
        }
        
        
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
        
        //adjustGreen(double factor)
        //Assigns pixels in image to an array
        pixels = p6.getPixels();
        
        //Initializes variables
        final double FACTOR = 1.5;
        int value;
        
        //Loops through objects in pixels array
        for (Pixel pixelObj : pixels)
        {
            //Gets green value
            value = pixelObj.getGreen();
            
            //Decreases red by factor
            value = (int) (value * FACTOR);
            
            //Sets red value to new value
            pixelObj.setGreen(value);
        }
            
    
        //adjustBlue(double factor)
        //Assigns pixels in image to an array
        pixels = p7.getPixels();
        
        //Initializes variables
        final double FACTOR = .25;
        int value;
        
        //Loops through objects in pixels array
        for (Pixel pixelObj : pixels)
        {
            //Gets blue value
            value = pixelObj.getBlue();
            
            //Decreases blue by factor
            value = (int) (value * FACTOR);
            
            //Sets red value to new value
            pixelObj.setBlue(value);
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
        
        //brighten()
        //Brightens the picture
        pixels = p9.getPixels();
        
         for (Pixel pixelObj : pixels)
        {   //pixelObj is current pixel/spot
            
            //Get the current color
            color = pixelObj.getColor();
            
            //Ger a lighter color
            color = color.brighter();
            
            //Set the pixel color to lighter color
            pixelObj.setColor(color);
        }
        p9.explore();
        
        //darken()
        //Darkens the picture
        pixels = p10.getPixels();
        
         for (Pixel pixelObj : pixels)
        {   //pixelObj is current pixel/spot
            
            //Get the current color
            color = pixelObj.getColor();
            
            //Ger a lighter color
            color = color.darker();
            
            //Set the pixel color to lighter color
            pixelObj.setColor(color);
        }
        p10.explore();
        
        //changeColors(double redAmount, double greenAmount, double blueAmount)
        //Changes the color to specified values
        
        int r, g, b;
        Color color;
        Scanner keys = new Scanner(System.in);
        
        System.out.print("Red value (Less than or equal to 255): ");
        r = keys.nextInt();
        
        System.out.print("Green value (Less than or equal to 255): ");
        g = keys.nextInt();
        
        System.out.print("Blue value (Less than or equal to 255): ");
        b = keys.nextInt();
        
        color = new Color(r, g, b);
        pixels = p11.getPixels();
        
        
        for (Pixel pixelObj : pixels)
        {
           pixelObj.setColor(color); 
        }
        p11.explore();
        
        //blueify()
        //makes a face blue
        int r = 243, g = 161, b = 139;
        pixels = p12.getPixels();
        
        for (Pixel pixelObj : pixels)
        {
            if((pixelObj.getRed() > (r - 15) && pixelObj.getRed() < (r + 15)) &&
                (pixelObj.getGreen() > (g - 15) && pixelObj.getGreen() < (g + 15)) &&
                (pixelObj.getBlue() > (b - 15) && pixelObj.getBlue() < (b + 15)))
                pixelObj.setColor(Blue);
            }
       
       //colorify()
       //changes the color of a facial feature
       int R = 41, G = 33, B = 30;
       pixels = p13.getPixels();
       
       for (Pixel pixelObj : pixels)
       {
           if((pixelObj.getRed() > (R - 10) && pixelObj.getRed() < (R + 10)) &&
                (pixelObj.getGreen() > (G - 10) && pixelObj.getGreen() < (G + 10)) &&
                (pixelObj.getBlue() > (B - 10) && pixelObj.getBlue() < (B + 10)))
                pixelObj.setColor(Red);
            }
            p12.explore();
            
       //swap2()
       //Changes green value for red
       pixels = p13.getPixels();
       
       for (Pixel pixelObj : pixels)
       {
           pixelObj.setGreen(pixelObj.setRed())
        }
        
       //swap3()
       //swap all three red = green, green = blue, blue = red
       int hold, hold1, hold2;
       pixels = p14.getPixels();
       
       for(Pixel pixelObj : pixels)
       {
           hold = pixelObj.getGreen();
           hold1 = pixelObj.getRed();
           hold2 = pixelObj.getBlue();
           
           pixelObj.setRed(hold);
           pixelObj.setGreen(hold2);
           pixelObj.setBlue(hold1);
        }
        p14.explore()
           
           
    }
}

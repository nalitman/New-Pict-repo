import java.awt.*;
import java.util.*;
import java.util.List;


public class TestPicture {
    /**      * main method, to test the picture      *      */
    public static void main(String[] args)  
    {   
        /**/
        //String fileName = FileChooser.pickAFile();   
        //Picture pictObj = new Picture(fileName);   
        //pictObj.explore();
        
        //Relative path
        Picture apic = new Picture("images/beach.jpg");
        Picture apic1 = new Picture("images/beach.jpg");
        Picture apic2 = new Picture("images/beach.jpg");
        Picture apic3 = new Picture("images/beach.jpg");
        Picture apic4 = new Picture("images/beach.jpg");
        Picture apic5 = new Picture("images/beach.jpg");
        //apic.explore();
        
        
        /**/
            //Array of pixels [] used to index
        int[] numbers = new int [10];
        System.out.println(numbers[5] + "-1");
        // [] this is an array
        Pixel [] pixels;
        //Gets all of the pixels in picture and assigns to pixel array
        pixels = apic.getPixels();
        System.out.println(pixels.length);
        
        
        /*
        
        //Access each index
        System.out.println(pixels[17]);
        System.out.println(pixels[17].getColor());
        
        pixels[17].setColor(Color.blue);
        pixels[20].setColor(new Color(150,150,150));
        pixels[30000].setColor(Color.blue);
        
        apic.explore();
        
        /*
        
        //for each loop spot is a ?
        for (Pixel spot : pixels)
            System.out.println( spot );
            
        /**/
        
        /**
         * Method to clear the red from picture
         * @param none
         * @return none
         */
        /*
        for (Pixel pixelObj : pixels)
        {
            //Set the red value of the current pixel to the new value
            pixelObj.setBlue(0);
        }
        apic.explore();
        
        /**/
        
        /**
         * Method to reduce red from picture by a factor of n
         * @param none
         * @return none
         */
        
        int value;
        final double FACTOR = .5;
        
        for (Pixel pixelObj : pixels)
        {
            //Gets the redvalue
            value = pixelObj.getRed();
            
            //Decreases red value by 50%
            value = (int) (value * FACTOR);
            
            //Set red value of current pixel to new value
            pixelObj.setRed(value);
        }
        apic.explore();
        /**/
        /**
         * Method to lighten the colors in the picture
         * @param none
         * @return none
         */
        /*
        pixels = apic1.getPixels();
        Color color;
        Color color2 = new Color(45, 134, 243); //You can make your own colors
        System.out.print(pixels[0].getRed());
        System.out.print(pixels[0].getColor());
        
        for (Pixel pixelObj : pixels)
        {   //pixelObj is current pixel/spot
            
            //Get the current color
            color = pixelObj.getColor();
            
            //Ger a lighter color
            color = color.brighter();
            
            //Set the pixel color to lighter color
            pixelObj.setColor(color);
        }
        apic1.explore();
        /**/
        /**
         * Method to make a friggin sunset by decreasing green and blue
         * @param none
         * @return none
         */
        /*
        int value1;
        value = 0;
        pixels = apic2.getPixels();
        final double FACTOR1 = .7;
        apic.explore();
        
        for (Pixel pixelObj : pixels)
        {
            //Gets the green and blue values
            value = pixelObj.getBlue();
            value1 = pixelObj.getGreen();
            
            //Decreases blue and green value by 70%
            value = (int) (value * FACTOR);
            value1 = (int) (value1 * FACTOR);
            
            //Set red value of current pixel to new value
            pixelObj.setBlue(value);
            pixelObj.setGreen(value1);
        }
        apic2.explore();
        
        /**/
        /**
         * Method to change a picture to greyscale
         * @param none
         * @return none
         */
        /**/
        
        pixels = apic3.getPixels();
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
        apic3.explore();
        
    }
}
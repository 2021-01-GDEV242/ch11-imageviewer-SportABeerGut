import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
/**
 * An image filter to make the image a bit lighter.
 * 
 * @author Colin Jones
 * @version 2021.04.18
 */
public class WarholFilter extends Filter
{
    
    /**
     * Constructor for objects of class WarholFilter.
     * @param name The name of the filter.
     */
    public WarholFilter(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     *
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        // create new image with double size
        int width = image.getWidth();
        int height = image.getHeight();
        //OFImage newImage = new OFImage(width, height);
        
        // copy pixel data into new image
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                if ((x > width/2) || (y > height/2))
                {
                    image.setPixel(x, y, new Color(255, 255, 255));
                }
            }
        }
        //image = newImage;
    }

}

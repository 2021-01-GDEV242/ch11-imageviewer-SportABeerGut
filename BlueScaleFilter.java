import java.awt.Color;

/**
 * An image filter to make the image a bit lighter.
 * 
 * @author Colin Jones
 * @version 2021.04.18
 */
public class BlueScaleFilter extends Filter
{
    /**
     * Constructor for objects of class BlueScaleFilter.
     * @param name The name of the filter.
     */
    public BlueScaleFilter(String name)
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
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                //int avg = ( + pix.getGreen() + pix.getBlue()) / 3;
                image.setPixel(x, y, new Color(0, 0, pix.getBlue()));
            }
        }
    }

}


package TextTool;

/**
 * @brief - Class containing rectangle definitions
 * @author GAPer
 * @version 1.0
 * @date of last modification 9 May 2015
 */
public class Rectangle
{
    
    public Point coordinates;
    public int     height;
    public int     width;
    
    public Rectangle( int x, int y, int width, int height)
    {
        coordinates = new Point(x, y);
        this.width    = width;
        this.height   = height;
    }
}

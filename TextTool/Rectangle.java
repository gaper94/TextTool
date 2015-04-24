
package TextTool;

/**
 *
 * @author GKO
 */
public class Rectangle {
    public Point coordinates;
    public int height;
    public int width;
    
    public Rectangle( int x, int y, int height, int width)
    {
        coordinates = new Point(x, y);
        this.height = height;
        this.width = width;
    }
}

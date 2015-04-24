
package TextTool;

/**
 * @brief - enum containing button definitions for the text tool
 * @author GAPer
 * @version 1.0
 * @date of last modification 24 April 2015
 */

public enum ButtonDefinition {
    
    
    EXIT_BTN(1 , "Exit" , new Rectangle(0, 0, 100, 10));//exit button

    private final int BTN_ID;// unique id to identify the button
    private final String BUTTON_TEXT;
    private final Rectangle SHAPE_DEF;
    
    ButtonDefinition(int ID, String Text, Rectangle ShapeDef)
    {
        this.BTN_ID = ID;
        BUTTON_TEXT = Text;
        SHAPE_DEF  = ShapeDef;
    }
        
    public int GetId()
    {
        return BTN_ID;
    }
    
    public String GetName()
    {
        return BUTTON_TEXT;
    }
    
    public Rectangle GetShape()
    {
        return SHAPE_DEF;
    }
}

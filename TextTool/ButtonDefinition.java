
package TextTool;

/**
 * @brief - enum containing button definitions for the text tool
 * @author GAPer
 * @version 1.0
 * @date of last modification 24 April 2015
 */

public enum ButtonDefinition 
{
    
    
    EXIT_BTN        ( 1 , "Exit"            , new Rectangle( 600, 10 , 150, 50 )), 
    NEW_RECORD_BTN  ( 2 , "Add New Record"  , new Rectangle( 600, 60 , 150, 50 ));

    private final int                    BUTTON_ID;// unique id to identify the button
    private final String               BUTTON_TEXT;// the text in the button
    private final Rectangle        SHAPE_DEF;// the location and size of the button
    
    ButtonDefinition(int ID, String Text, Rectangle ShapeDef)
    {
        BUTTON_ID                  = ID;
        BUTTON_TEXT            = Text;
        SHAPE_DEF                 = ShapeDef;
    }
        
    public int GetId()
    {
        return BUTTON_ID;
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

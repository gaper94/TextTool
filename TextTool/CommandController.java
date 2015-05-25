
package TextTool;

/*=================================*/
/*
* Imports
*/
/*=================================*/
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JScrollPane;

/**
 * @brief - Class containing definitions for the Text tool controller
 * @author GAPer
 * @version 1.0
 * @date of last modification 24 April 2015
 */

public class CommandController
{
    
    private List<JButton>   TextToolButtons;
    private JScrollPane      EntityChooser;
    
    public CommandController()
    {
        //empty
    }
    
    public List<JButton> SetButtons(TextTool TextToolRef)
    {
        TextToolButtons = new ArrayList<>();
        InitializeButtons( TextToolRef );
        
        return TextToolButtons;
    }
    
    private void InitializeButtons( TextTool TextToolRef )
    {
        JButton ButtonToAdd = null;
        for( ButtonDefinition Button : ButtonDefinition.values() )
        {
             ButtonToAdd = new JButton( Button.GetName() ); 
             ButtonToAdd.setBounds(  Button.GetShape().coordinates.x,  
                                                    Button.GetShape().coordinates.y, 
                                                    Button.GetShape().width, 
                                                    Button.GetShape().height );
             ButtonToAdd.addActionListener( new NewRecordButtonListener(TextToolRef) );
             TextToolButtons.add( ButtonToAdd );
        }   
    }

}

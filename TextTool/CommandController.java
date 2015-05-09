
package TextTool;

import com.sun.javafx.scene.control.skin.ButtonSkin;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.JButton;

/**
 * @brief - Class containing definitions for the Text tool controller
 * @author GAPer
 * @version 1.0
 * @date of last modification 24 April 2015
 */

public class CommandController {
    
    List<JButton> TextToolButtons;
    
    public CommandController()
    {
        //empty for now
    }
    
    public List<JButton> SetControls()
    {
        TextToolButtons = new ArrayList<>();
        InitExitBtn();
        return TextToolButtons;
    }
    
    private void InitExitBtn()
    {
        JButton ExitBtn = new JButton(ButtonDefinition.EXIT_BTN.GetName());
        ExitBtn.addActionListener( evt -> System.exit(0) );
        ExitBtn.setVerticalTextPosition(AbstractButton.CENTER);
        ExitBtn.setSize( ButtonDefinition.EXIT_BTN.GetShape().height,
                         ButtonDefinition.EXIT_BTN.GetShape().width );
        
        ExitBtn.setLocation( ButtonDefinition.EXIT_BTN.GetShape().coordinates.x,
                             ButtonDefinition.EXIT_BTN.GetShape().coordinates.y );
        
        TextToolButtons.add(ExitBtn);
    }
}

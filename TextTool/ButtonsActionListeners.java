
package TextTool;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @brief - Classes containing callback implementation of Text tool buttons
 * @author GAPer
 * @version 1.0
 * @date of last modification 9 May 2015
 */

// Exit Button Listener
 class ExitButtonListener implements ActionListener
 {
    public void actionPerformed(ActionEvent e) 
    {
        System.exit(0);
    } 
}

// Add New Record Button Listener
class NewRecordButtonListener implements ActionListener
{
    private TextTool textToolRef;
    
    NewRecordButtonListener(TextTool textToolRef)
    {
        this.textToolRef = textToolRef;
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        AddEditRecordPanel temp = new AddEditRecordPanel(textToolRef);
    }
}

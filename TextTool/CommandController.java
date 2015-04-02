
package TextTool;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * @brief Initialize controls for Text Tool 
 * @author GAPer
 * @version 1.0
 * @date of last modification 4 April 2015
 */

enum ButtonsDscr{
    EXIT_BUTTON(0);
    
    private final int BtnIdx;

    private ButtonsDscr(int BtnIdx) {
        this.BtnIdx = BtnIdx;
    }
    
    public int GetIdx()
    {
        return BtnIdx;
    }
}
public class CommandController {
    //reference to the TextTool to call functions
    private TextTool TextToolRef;
    private static final int NUMBER_OF_BUTTONS = 1;
    
    public CommandController(TextTool TextToolRef)
    {
        this.TextToolRef = TextToolRef;
    }
    
    public void SetControls(JButton Buttons[])
    {
        Buttons = new JButton[NUMBER_OF_BUTTONS];

        SetExitBtn(Buttons[ButtonsDscr.EXIT_BUTTON.GetIdx()]);
        
    }
    
    private void SetExitBtn(JButton btn)
    {
        btn = new JButton("Exit");
        btn.addActionListener( new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        } );
    }
}


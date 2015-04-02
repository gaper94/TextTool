package TextTool;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Text Tool is tool for managing text on your project. The program will be used
 * to unify the entrance of text and facilitate the usage in real projects. It
 * will have the function to export the entered texts in C/C++ headers to create
 * dll and in Java source files.
 *
 * @author GAPer
 */
public class TextTool extends JFrame{

    /*
     * Text Tool Components
     */
    private JButton Buttons[];//array of buttons
    
    private Configurator TextToolConfigurator;

    public TextTool() {
        TextToolConfigurator = new Configurator(this);
        InitComponents();
    }

    private int InitComponents() {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(Configurator.SCREEN_HEIGHT, Configurator.SCREEN_WIDTH);
        setResizable(false);
        
        TextToolConfigurator.InitializeControls(Buttons);
        //add buttons to the frame
//        for(JButton arrBtns:Buttons)
//        {
//            add(arrBtns);
//        }
        if(Buttons==null)
        {
            System.out.println("whe");
        }
        add(Buttons[0]);
        return 0;//everything is ok
    }

    public void SetButtons(JButton Buttons[]) {
        this.Buttons = Buttons;
    }
}

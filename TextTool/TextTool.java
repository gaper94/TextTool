package TextTool;

import java.awt.FlowLayout;
import java.util.List;
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
    private List<JButton> Buttons;//array of buttons
    
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
        setLayout( new FlowLayout() );
        List<JButton> Buttons = TextToolConfigurator.InitializeControls();
        //add buttons to the frame
        if(Buttons == null)
        {
            System.out.println("Hello nul ptr excp");
        }
        for(int i=0;i<Buttons.size();++i)
        {
            add(Buttons.get(i));
        }

        return 0;//everything is ok
    }

 
}

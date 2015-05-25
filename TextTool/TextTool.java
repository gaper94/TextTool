package TextTool;

/*=================================*/
/*
* Imports
*/
/*=================================*/
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.MouseInputAdapter;

/**
 * Text Tool is tool for managing text on your project. The program will be used
 * to unify the entrance of text and facilitate the usage in real projects. It
 * will have the function to export the entered texts in C/C++ headers to create
 * dll-s and in Java source files.
 *
 * @author GAPer
 */
public class TextTool extends JFrame
{

    /*
     * Text Tool Components
     */
    private List<JButton>   Buttons; // array of buttons
    private TextEntityList  EntitiesList;//  
    
    private final  Configurator TextToolConfigurator;

    public TextTool() {
        TextToolConfigurator = new Configurator(this);
        InitComponents();
    }

    private int InitComponents() 
    {
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(Configurator.SCREEN_WIDTH, Configurator.SCREEN_HEIGHT);
        setResizable(false);
        
        // Coordiantes and size of components are earlier defined
        setLayout( null ); 
        
         Buttons = new ArrayList<>( TextToolConfigurator.InitializeButtons() );

         // Add the buttons in the frame
        int i = 0;
        for( i=0;i<Buttons.size();++i)
        {
            add(Buttons.get(i));
        }
        
        /********* TEST CODE START *********/
        DefaultListModel list_model;
        list_model= new DefaultListModel();
        for (i =0; i < 50 ;++i)
        {
            list_model.addElement("Gogo" + i);
        }
        
        JList list_test = new JList(list_model);
        
        list_test.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        list_test.setSelectedIndex(0);
        list_test.setVisibleRowCount(10);
        list_test.setLayoutOrientation(JList.VERTICAL);
        list_test.addMouseListener(new MouseInputAdapter()
        {
            public void mouseClicked(MouseEvent mouseEvent)
            {
                JList list = (JList) mouseEvent.getSource();
                if( mouseEvent.getClickCount() == 2)
                {
                    int idx = list.locationToIndex(mouseEvent.getPoint());
                    System.out.println(list.getModel().getElementAt(idx).toString());
                }
            }
        } );

        JScrollPane test_pane = new JScrollPane( list_test );
        test_pane.setBounds(20, 50, 100, 300);
        
        add(test_pane);
        /********* TEST CODE FINISH *********/
        this.repaint();
        
        return 0;// Everything is ok
    }

 
}

package TextTool;

/*=================================*/
/*
* Imports
*/
/*=================================*/
import java.util.HashMap;
import java.util.List;
import javax.swing.JButton;

/**
 * @brief - Class containing configuration settings and functions for the text tool
 * @author GAPer
 * @version 1.0
 * @date of last modification 4 April 2015
 */
public class Configurator
{
    
     //Map containing all configured languages in Text Tool 
    static HashMap<String, Integer> Languages;
    
    // Screen resolution
    public static final int SCREEN_WIDTH  = 1080;
    public static final int SCREEN_HEIGHT = 720;
    
    // Add/Edit panel resolution
    public static final int EDIT_PANEL_WIDTH  = 640;
    public static final int EDIT_PANEL_HEIGHT = 482;
    
    private final  TextTool                  TextTool;
    private final  CommandController TextToolController;
    
    public Configurator(TextTool TextTool)
    {
        this.TextTool               = TextTool;
        this.TextToolController = new CommandController();
    }
    
    //languages confugred 
    public static int GetNumberOfLanguagesConfigured()
    {
        return Languages.size();
    }
    
    //insert new language in the Text Tool
    public static void AddNewLanguage(String LangDscr)
    {
        Languages.put(LangDscr, Languages.size()+ 1 );
    }
    
    public  List<JButton> InitializeButtons()
    {
        return this.TextToolController.SetButtons( TextTool );
    }
    

}

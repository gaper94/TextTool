package TextTool;




import java.util.HashMap;
import javax.swing.JButton;

/**
 * @brief - Class containing configuration settings and functions for the text tool
 * @author GAPer
 * @version 1.0
 * @date of last modification 4 April 2015
 */
public class Configurator {
    /* Map containing all configured languages in Text Tool  */
    static HashMap<String, Integer> Languages;
    // Screen resolution
    public static final int SCREEN_WIDTH  = 600;
    public static final int SCREEN_HEIGHT = 400;
    
    private TextTool TextTool;
    private CommandController TextToolController;
    
    public Configurator(TextTool TextTool)
    {
        this.TextTool = TextTool;
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
    
    public  void InitializeControls(JButton Buttons[])
    {
        TextToolController.SetControls(Buttons);
    }
    

}

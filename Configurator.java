
package TextTool;

import java.util.HashMap;

/**
 * @brief - Class containing configuration settings for the text tool
 * @author GAPer
 * @version 1.0
 * @date of last modification 4 April 2015
 */
public class Configurator {
    /* Map containing all configured languages in Text Tool  */
    static HashMap<String, Integer> Languages;
    
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

}

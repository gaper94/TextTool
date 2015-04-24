package TextTool;

/**
 * @brief -Class to summarise text entity used in the text tool
 * @author GAPer
 * @version 1.0
 * @date of last modification 4 April 2015
 */
public class TextEntity {
        // array containg the the different translations 
        // for the current current record
        private String textContent[];
        
        public TextEntity()
        {
            textContent = new String[Configurator.GetNumberOfLanguagesConfigured()];
        }
        
        public void fillLanguages(String translations[])
        {
        
        }
}

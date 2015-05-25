package TextTool;

/*=================================*/
/*
* Imports
*/
/*=================================*/
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @brief -Class to summarize text entity used in the text tool
 * @author GAPer
 * @version 1.0
 * @date of last modification 4 April 2015
 */
public class TextEntity implements Serializable
{
     
    private List<String> EntityContent;
    private final String TextID; // Unique id of the entity

    public TextEntity( String TextID )
    {
        EntityContent  =  new ArrayList<>();
        this.TextID     = TextID;
    }

    public void AddNewTranslation(String newTranslation)
    {
        EntityContent.add(newTranslation);
    }

    public String toString() 
    {
        return TextID;
    }
        
        

}

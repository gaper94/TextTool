
package TextTool;

/*=================================*/
/*
* Imports
*/
/*=================================*/
import java.util.HashSet;
import java.util.Set;

/**
 * @brief - Class containing list of text entities
 * @author GAPer
 * @version 1.0
 * @date of last modification 9 May 2015
 */
public class TextEntityList
{
    private Set<TextEntity> EntityList;
    
    public TextEntityList()
    {
        EntityList = new HashSet<>();
    }
    
    public void AddNewRecord( TextEntity entityToAdd )
    {
        EntityList.add( entityToAdd );
    }
    
    public void EditCurrentRecord( TextEntity entityToEdit )
    {
        EntityList.remove(entityToEdit);
        AddNewRecord(entityToEdit);
    }
    
    public boolean CheckForRecord( String EntityName )
    {
        for( TextEntity Entity : EntityList)
        {
            if( Entity.toString().equals(EntityName) )
            {
                return true;
            }
        }
        return false;
    }
}

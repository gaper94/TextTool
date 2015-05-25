
package TextTool;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * @brief - Classes containing implementation of Text tool add/edit panel
 * @author GAPer
 * @version 1.0
 * @date of last modification 24 April 2015
 */

public class AddEditRecordPanel extends JFrame
{
    // UI controls
    TextTool    textToolRef;
    JLabel      lblEntityName;
    JTextField  txfEntityName;
    JTabbedPane tbpaLanguagesPanel;
    
    boolean     isEditable;
            
    AddEditRecordPanel(TextTool textToolRef)
    {
        this.textToolRef = textToolRef;
        initPanel();
    }
    
    private void initPanel()
    {
        setVisible(true);
        setSize(Configurator.EDIT_PANEL_WIDTH, Configurator.EDIT_PANEL_HEIGHT);
        setResizable(false);
        setLayout( null ); 
        this.textToolRef.setEnabled(false);// Freeze the main panel
        initLayout();
    }
    
    private void initLayout()
    {
        lblEntityName = new JLabel("Name:");
        lblEntityName.setBounds(100, 100, 50, 100);
        txfEntityName = new JTextField();
        txfEntityName.setEditable(true);
        txfEntityName.setBounds(145, 140, 100, 20);
        
        tbpaLanguagesPanel = new JTabbedPane();
        JComponent panel1 = makeEditPanel("Georgi");
        tbpaLanguagesPanel.addTab("Table1", panel1);
        panel1 = makeEditPanel("Viki");
        tbpaLanguagesPanel.addTab("Table2", panel1);
        tbpaLanguagesPanel.setBounds(200, 200, 400, 50);
        
        this.add(lblEntityName);
        this.add(txfEntityName);
        this.add(tbpaLanguagesPanel);
        
        // Unfreeze the main panel on close
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                textToolRef.setEnabled(true);
              }
        });

    }
    
       private JComponent makeEditPanel(String defaultText) {
        JPanel panel = new JPanel(false);
        JTextField filler = new JTextField(defaultText);
        filler.setHorizontalAlignment(JTextField.NORTH_EAST);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }
     
    
    
}

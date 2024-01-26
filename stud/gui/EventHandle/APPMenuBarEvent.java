package stud.gui.EventHandle;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import stud.gui.*;
import stud.helpler.*;
import stud.*;

public class APPMenuBarEvent implements ItemListener,ActionListener{
    public APPMenuBar menuBar;
    public JPanel viewJPanel;
    public entryPanel entry;
    public result resultPanel;
    public APPMenuBarEvent(APPMenuBar menuBar,JPanel viJPanel,entryPanel entry,result resultPanel){
        this.menuBar = menuBar;
        this.viewJPanel = viJPanel;
        this.entry = entry;
        this.resultPanel = resultPanel;
    }
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == menuBar.entryButton){
            this.viewJPanel.remove(resultPanel);
            this.viewJPanel.add(entry);
        }else if(event.getSource()==menuBar.searchButton){
            this.viewJPanel.remove(entry);
            this.viewJPanel.add(resultPanel);
        }
        this.viewJPanel.revalidate();
    }
    public void itemStateChanged(ItemEvent event){
        if(event.getSource()==menuBar.searchBy){
            menuBar.searchField.setText(menuBar.searchBy.getSelectedItem().toString());
        }
    }
}
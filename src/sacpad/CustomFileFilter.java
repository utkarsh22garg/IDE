/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sacpad;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author utkarsh
 */
public class CustomFileFilter extends FileFilter{

    @Override
    public boolean accept(File file) {
        
        // allow directories to be seen
        if(file.isDirectory())
        {
            return true;
        }
        // select custom files
        else if(file.getName().endsWith(".c")||file.getName().endsWith(".cpp")||file.getName().endsWith(".java"))
        {
            return true;
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "Executable Files aka \".java\",\".c\",\".cpp\" ";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game2;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author User
 */
public class Checker 
{
    public Color checkWinner(JButton jb[][])
    {
   // boolean flag = false;  
    int rows = jb.length;
    int cols = jb[0].length;

    for (int i = 0; i < rows; i++) 
    {
        for (int j = 0; j < cols; j++) 
        {
            Color c = jb[i][j].getBackground();
            
            
            if (c == null || c.equals(new JButton().getBackground()))
                continue;

            
            if (j + 3 < cols && jb[i][j + 1].getBackground().equals(c) && jb[i][j + 2].getBackground().equals(c) && jb[i][j + 3].getBackground().equals(c)) 
            {    
                jb[i][j].setBackground(Color.GREEN);
                jb[i][j + 1].setBackground(Color.GREEN);
                jb[i][j + 2].setBackground(Color.GREEN);
                jb[i][j + 3].setBackground(Color.GREEN);
               // flag = true;
               return c;
            }

            
            if (i + 3 < rows && jb[i + 1][j].getBackground().equals(c) && jb[i + 2][j].getBackground().equals(c) && jb[i + 3][j].getBackground().equals(c)) 
            {    
                jb[i][j].setBackground(Color.GREEN);
                jb[i + 1][j].setBackground(Color.GREEN);
                jb[i + 2][j].setBackground(Color.GREEN);
                jb[i + 3][j].setBackground(Color.GREEN);
                //flag= true;
                return c;
            }

            
            if (i + 3 < rows && j + 3 < cols && jb[i + 1][j + 1].getBackground().equals(c) && jb[i + 2][j + 2].getBackground().equals(c) && jb[i + 3][j + 3].getBackground().equals(c)) 
            { 
                jb[i][j].setBackground(Color.GREEN);
                jb[i + 1][j + 1].setBackground(Color.GREEN);
                jb[i + 2][j + 2].setBackground(Color.GREEN);
                jb[i + 3][j + 3].setBackground(Color.GREEN);
                //flag = true;
                return c;
            }

            
            if (i + 3 < rows && j - 3 >= 0 && jb[i + 1][j - 1].getBackground().equals(c) && jb[i + 2][j - 2].getBackground().equals(c) &&  jb[i + 3][j - 3].getBackground().equals(c)) 
            {
                jb[i][j].setBackground(Color.GREEN);
                jb[i + 1][j - 1].setBackground(Color.GREEN);
                jb[i + 2][j - 2].setBackground(Color.GREEN);
                jb[i + 3][j - 3].setBackground(Color.GREEN);
                //flag = true;
                return c;
            }
        }
    }
    return null;
}

    
}

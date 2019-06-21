package com.vanny96;

import javax.swing.SwingUtilities;

import com.vanny96.ui.UserInterface;


public class App 
{
    public static void main( String[] args )
    {
        UserInterface interface1 = new UserInterface(new PersonalCalculator());
        SwingUtilities.invokeLater(interface1);
    }
}

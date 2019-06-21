package com.vanny96;

import javax.swing.SwingUtilities;

public class App 
{
    public static void main( String[] args )
    {
        NoticeBoard board = new NoticeBoard();
        SwingUtilities.invokeLater(board);
    }
}

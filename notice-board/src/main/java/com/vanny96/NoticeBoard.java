package com.vanny96;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class NoticeBoard implements Runnable {
  private JFrame frame;

  public NoticeBoard(){
    
  }

  @Override
  public void run() {
    frame = new JFrame("Notice Board");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setPreferredSize(new Dimension(300, 200));

    addComponent(frame.getContentPane());

    frame.pack();
    frame.setVisible(true);
  }

  private void addComponent(Container container){
    GridLayout layout = new GridLayout(3, 1);
    container.setLayout(layout);

    JTextArea origin = new JTextArea();
    JTextArea destination = new JTextArea();

    JButton button = new JButton("Copy!");
    button.addActionListener(new MessageCopier(origin, destination));

    container.add(origin);
    container.add(button);
    container.add(destination);
  }

  public JFrame getFrame(){
    return frame;
  }
  
}
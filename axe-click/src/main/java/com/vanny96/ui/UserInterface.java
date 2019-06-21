package com.vanny96.ui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import com.vanny96.Calculator;

public class UserInterface implements Runnable {
  private JFrame frame;
  private Calculator calculator;

  public UserInterface(Calculator calculator){
    this.calculator = calculator;
  }

  @Override
  public void run() {
    frame = new JFrame("Axe Click");
    frame.setPreferredSize(new Dimension(200, 200));

    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    addComponentsToFrame(frame.getContentPane());

    frame.pack();
    frame.setVisible(true);
  }

  private void addComponentsToFrame(Container container){
    GridLayout layout = new GridLayout(2, 1);
    container.setLayout(layout);

    JLabel counter = new JLabel();
    JButton button = new JButton("Click");

    button.addActionListener(new ClickListener(this.calculator, counter));

    container.add(counter);
    container.add(button);
  }
  
}
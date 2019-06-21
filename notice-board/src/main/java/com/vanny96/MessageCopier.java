package com.vanny96;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class MessageCopier implements ActionListener {
  private JTextArea origin;
  private JTextArea destination;

  public MessageCopier(JTextArea origin, JTextArea destination){
    this.origin = origin;
    this.destination = destination;
  }

  @Override
  public void actionPerformed(ActionEvent arg0) {
    this.destination.setText(this.origin.getText());
  }

}
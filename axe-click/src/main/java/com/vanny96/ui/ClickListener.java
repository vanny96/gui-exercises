package com.vanny96.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import com.vanny96.Calculator;
import com.vanny96.PersonalCalculator;

public class ClickListener implements ActionListener {
  private Calculator personalCalculator;
  private JLabel label;

  public ClickListener(Calculator calculator, JLabel label){
    this.personalCalculator = calculator;
    this.label = label;
  }

  @Override
  public void actionPerformed(ActionEvent arg0) {
    this.personalCalculator.increase();
    this.label.setText(String.valueOf(this.personalCalculator.giveValue()));
  }
  
}
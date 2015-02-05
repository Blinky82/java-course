import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

/**
 * Created by blinky on 05.01.15.
 */
public class DifferentFiles extends JFrame implements ActionListener {

 /**
  * Create the frame.
  */
 public DifferentFiles() {
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 450, 300);
  JPanel contentPane = new JPanel();
  contentPane.setBackground(UIManager
    .getColor("CheckBoxMenuItem.acceleratorForeground"));
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  setContentPane(contentPane);
  contentPane.setLayout(null);

  JButton btnNewButton = new JButton("Upload File");
  btnNewButton.setFont(new Font("Dialog", Font.BOLD, 20));
  btnNewButton.setBounds(88, 159, 195, 59);
  btnNewButton.addActionListener(this);
  contentPane.add(btnNewButton);
 }

 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
    	DifferentFiles frame = new DifferentFiles();
     frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 @Override
 public void actionPerformed(ActionEvent arg0) {
  JFileChooser fc = new JFileChooser();
  int returnVal = fc.showOpenDialog(DifferentFiles.this);
  if (returnVal == JFileChooser.APPROVE_OPTION) {
   File file = fc.getSelectedFile();
   BufferedWriter oddWriter;
   BufferedWriter evenWriter;

   try {
    oddWriter = new BufferedWriter(new FileWriter("Odd.txt"));
    evenWriter = new BufferedWriter(new FileWriter("Even.txt"));

    String res = "";
    int counter = 0;
    BufferedReader fr = new BufferedReader(new FileReader(file));

    while ((res = fr.readLine()) != null) {

     if (counter % 2 == 0) {
      oddWriter.write(res);
      oddWriter.newLine();
     } else {
      evenWriter.write(res);
      evenWriter.newLine();
     }

     counter++;
    }

    oddWriter.flush();
    evenWriter.flush();
    oddWriter.close();
    evenWriter.close();
    
   } catch (IOException e1) {
    // TODO Auto-generated catch block
    e1.printStackTrace();
   }
  }
 }
}
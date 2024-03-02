import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class EinAus extends JFrame implements ActionListener { 
  
  // start attributes
  private JTextField EingabeFeld, AusgabeFeld;
  // end attributes
               
   public EinAus() {  
     super("Syntaxanalyse durch Automaten");
      this.getContentPane().setBackground(Color.lightGray);
      this.getContentPane().setLayout(new FlowLayout());
      //Dialog-Button
      JButton button = new JButton("Analyse");
      button.setBackground(Color.red);
      button.addActionListener(this);
      this.getContentPane().add(button);
      //Ende-Button
      button = new JButton("Ende");
      button.setBackground(Color.red);
      button.addActionListener(this);
      this.getContentPane().add(button);
      //Eingabe-Textfeld
      EingabeFeld = new JTextField (20);
      this.getContentPane().add (EingabeFeld);
      //Ausgabe-Textfeld
      AusgabeFeld = new JTextField (20);
      this.getContentPane().add (AusgabeFeld);
   }
    // start components
    // end components

  // start methods
   public void actionPerformed(ActionEvent event) {  
      String cmd = event.getActionCommand();
      String antwort, quelltext;
      if (cmd.equals("Analyse")) {   
        String zeile = EingabeFeld.getText();
         //Erzeugen und Initialisieren des Automaten
         Prüfer meinAutomat = new Prüfer (zeile);
         if (meinAutomat.sagtJa())   
            AusgabeFeld.setText ("Ja");
        else
            AusgabeFeld.setText ("Nein");
      } 
      else if (cmd.equals("Ende")) { 
        setVisible(false);
         dispose();
         System.exit(0);
      }
   }
  // end methods
}
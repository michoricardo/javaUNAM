import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.util.Random;
public class TextFieldFrame extends JFrame implements ActionListener {
//crear elementos visuales de JFrame
JLabel label1 = new JLabel("");
JPanel panel = new JPanel();
JButton boton = new JButton("Mostrar");
JTextField campo_texto = new JTextField(20);
TextFieldFrame() {
super("Informática V");
panel.setBackground(Color.orange); //color inicial
setBounds(100,100,500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container contenedor = this.getContentPane();
contenedor.add(panel);
boton.addActionListener(this);
label1.setText("Escribe algo: ");
panel.add(label1);
panel.add(campo_texto);
panel.add(boton);
boton.requestFocus();
setVisible(true);
}
public void actionPerformed(ActionEvent event) {
  //genera color random
  Random rand = new Random();
  Color color = new Color(rand.nextInt(0xFFFFFF));
  Object listener = event.getSource();
if (listener == boton) { //mensaje de diálogo
JOptionPane.showMessageDialog(this, "Escribiste: " + campo_texto.getText()); //this para centrar el mensaje de diálogo en el frame
setVisible(true);
panel.setBackground(color); //Pone el color generado como background del panel
}
}
}

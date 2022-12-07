import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.Color;
public class JEditor extends JFrame {
JEditorPane editorPane = new JEditorPane();
//menu bar
JMenuBar bar = new JMenuBar();
JEditor() {
super("Editor de estilo y color");
setBounds(200,200,500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//caracteristicas editor
editorPane.setContentType("text/plain");
editorPane.setText("Escribe algo...");
editorPane.setEditable(true);
editorPane.setEditorKit(new StyledEditorKit());
setContentPane(editorPane);
setVisible(true);
setJMenuBar(bar);
//definicion de menus
JMenu menu = new JMenu("Estilo");
menu.setOpaque(true);
menu.setBackground(Color.CYAN);
JMenu menu2 = new JMenu("Colorsillo");
menu2.setOpaque(true);
menu2.setBackground(Color.GREEN);
bar.add(menu);
bar.add(menu2);
//definicion de acciones
Action action1 = new StyledEditorKit.BoldAction();
action1.putValue(Action.NAME, "Negritas");
menu.add(action1);
Action action2 = new StyledEditorKit.FontFamilyAction("SansSerif", "SansSerif");
menu.addSeparator();
action2.putValue(Action.NAME, "SansSerif");
menu.add(action2);
Action action3 = new StyledEditorKit.FontFamilyAction("Monospaced", "Monospaced");
action3.putValue(Action.NAME, "Monospaced");
menu.add(action3);
Action action4 = new StyledEditorKit.FontSizeAction("8", 8);
menu.addSeparator();
action4.putValue(Action.NAME, "Tamaño 8");
menu.add(action4);
Action action5 = new StyledEditorKit.FontSizeAction("24", 24);
action5.putValue(Action.NAME, "Tamaño 24");
menu.add(action5);
Action action6 = new StyledEditorKit.ForegroundAction("Azul", Color.BLUE);
action6.putValue(Action.NAME, "Azul");
menu2.add(action6);
menu2.addSeparator();
Action action7 = new StyledEditorKit.ForegroundAction("Rojo", Color.RED);
action7.putValue(Action.NAME, "Rojo");
menu2.add(action7);
menu2.addSeparator();
Action action8 = new StyledEditorKit.ForegroundAction("Magenta", Color.MAGENTA);
action8.putValue(Action.NAME, "Magenta");
menu2.add(action8);
menu2.addSeparator();
Action action9 = new StyledEditorKit.ForegroundAction("Negro", Color.BLACK);
action9.putValue(Action.NAME, "Negro");
menu2.add(action9);
menu2.addSeparator();
Action action10 = new StyledEditorKit.ForegroundAction("Verde", Color.GREEN);
action10.putValue(Action.NAME, "Verde");
menu2.add(action10);
}
}

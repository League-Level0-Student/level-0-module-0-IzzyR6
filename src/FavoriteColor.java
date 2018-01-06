import javax.swing.JOptionPane;

public class FavoriteColor {
public static void main(String[] args) {
	String favoritecolor= JOptionPane.showInputDialog("What is your favorite color?");
	JOptionPane.showMessageDialog(null, "My favorite color is "+ favoritecolor + " too!");
}
}

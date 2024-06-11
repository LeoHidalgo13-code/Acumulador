package acumulador;
import javax.swing.JOptionPane;
public class Acumulador {
    public static void main(String[] args) {
    int i=1;
    String aux="";
        for (i=1;i<=10;i++)
        {
            aux+=i+"\n";
           // System.out.println(i);
        }
        JOptionPane.showMessageDialog(null, aux);
    }
    
}

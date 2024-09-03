import javax.swing.JOptionPane;

public class VerificaLetraA {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Insira um texto:");

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            JOptionPane.showMessageDialog(null, "A letra 'a' aparece " + contador + " vezes no texto inserido.");
        } else {
            JOptionPane.showMessageDialog(null, "A letra 'a' não aparece no texto.");
        }
    }
}

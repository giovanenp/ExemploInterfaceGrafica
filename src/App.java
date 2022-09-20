import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int res = JOptionPane.showConfirmDialog(null, "Tem certeza?", "Confirma", 1);

        if (res == 0) {
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
        }
    }
}

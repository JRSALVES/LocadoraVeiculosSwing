package locadoraveiculosswing;

import bancolib.SqlUtil;

import locadoraveiculosswing.gui.TelaPrincipalGUI;

public class App {
    
    public static SqlUtil sqlUtil = new SqlUtil("localhost", "5432", "lucaslocadora", "postgres", "postgres");
    
    public static void main(String[] args) {
        TelaPrincipalGUI form = new TelaPrincipalGUI();
        form.setVisible(true);
    }
}

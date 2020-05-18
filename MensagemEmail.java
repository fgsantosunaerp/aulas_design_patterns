import javax.swing.JOptionPane;

public class MensagemEmail implements Mensagem{
    public void enviar(String msg){
        JOptionPane.showMessageDialog(null, "Email: " + msg);
    }

}
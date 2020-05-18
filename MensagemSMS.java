import javax.swing.JOptionPane;

public class MensagemSMS implements Mensagem{
    public void enviar(String msg){
        JOptionPane.showMessageDialog(null, "SMS: " + msg);
    }

}
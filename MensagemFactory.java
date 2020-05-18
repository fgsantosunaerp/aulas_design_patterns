
public class MensagemFactory {
    public static Mensagem getMensagem(char tipo){
        if (tipo == 'e'){
            return new MensagemEmail();
        }
        else{
            if (tipo == 's')
                return new MensagemSMS();
            else
                return null;
        }
    }
}
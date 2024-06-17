import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;
public class ContaTeminal {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {

        LocalDate hoje = LocalDate.now();
        String saudacao ;
        Locale brasil = new Locale("pt" , "BR");
        LocalDateTime agora = LocalDateTime.now();

        if(agora.getHour() >=0 && agora.getHour()<12){
            saudacao = "Bom dia";
        }else if (agora.getHour() >=12 && agora.getHour()<18){
            saudacao = "Boa tarde";
        }else if (agora.getHour() >=18 && agora.getHour() <24){
            saudacao = "Boa noite";
        }else {
            saudacao = "Olá";
        }


        double saldo = 237.48;
        DecimalFormat formatoSaldo = new DecimalFormat("R$ 0.###");

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQual seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("\nPor favor, digite o número de sua conta:");
        int conta = scanner.nextInt();

        System.out.println("\nPor favor, digite o número sua agência:");
        String agencia = scanner.next();



        System.out.println(saudacao + "!" + "\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ conta + " e seu saldo " + formatoSaldo.format(saldo) + " já está disponivel para saque.");
        
       
        System.out.println("\n############### Bem vindo ao nosso banco, segue seus dados #################");
        System.out.println( "|" + "Número da conta " + "|" + conta  + "|");
        System.out.println( "|" + "Agência " + "        |" + agencia  + "|");
        System.out.println( "|" + "Nome do cliente " + "|" + nome  + "|");
        System.out.println( "|" + "Saldo " + "          |" + formatoSaldo.format(saldo)  + "|");


    }
}

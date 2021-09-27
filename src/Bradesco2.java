import java.util.*;

public class Bradesco2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int option;
        char charOption;

        System.out.println("----------------------------------------------------------");
        System.out.println("---------------- Bradesco Financiamentos -----------------");
        System.out.println("------------------- Seja bem vindo(a)! -------------------");
        System.out.println("----------------------------------------------------------");

        do{
            System.out.println("---------------\n1- Crédito Pessoal\n2- Crédito Imobiliário\n3 - Crédito Empresarial\n4 - Empréstimo Consignado\n---------------\nDigite uma opção: ");
            option = Integer.parseInt(sc.nextLine());

            while(option < 1 || option > 4){
                System.out.println("Digite uma opção válida: ");
                option = Integer.parseInt(sc.nextLine());
            }

            switch (option) {
                case (1):
                    System.out.println("Opção Escolhida: Crédito Pessoal");
                    break;
                case (2):
                    System.out.println("Opção Escolhida: Crédito Imobiliário");
                    break;
                case (3):
                    System.out.println("Opção Escolhida: Crédito Empresarial");
                    break;
                case (4):
                    System.out.println("Opção Escolhida: Empréstimo Consignado");
                    break;
                }

            do{
                System.out.println("Voltar ao menu ou sair (v/s): ");
                charOption = sc.nextLine().toLowerCase().charAt(0);
            }while (charOption != 'v' && charOption != 's');
            
        }while(charOption == 'v');

        System.out.println("Obrigada. Volte sempre (◠‿・)—☆");
    }
}

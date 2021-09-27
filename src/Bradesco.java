import java.util.*;

public class Bradesco{

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        head();
        printMenu();
        chooseMenu();
    }

    static void head(){
        System.out.println("----------------------------------------------------------");
        System.out.println("---------------- Bradesco Financiamentos -----------------");
        System.out.println("------------------- Seja bem vindo(a)! -------------------");
        System.out.println("----------------------------------------------------------");
    }

    static void printMenu(){
        System.out.println("Menu de opções: ");
        System.out.println("\t 1 - Crédito Pessoal");
        System.out.println("\t 2 - Crédito Imobiliário");
        System.out.println("\t 3 - Crédito Empresarial");
        System.out.println("\t 4 - Empréstimo Consignado");
    }

    static void chooseMenu(){
        char option;
        int op = numberOption("Digite uma opção do menu: ");

        while (op < 1 || op > 4) {
            op = numberOption("Opção inválida. Digite novamente: ");
        }

        switch (op){
            case 1: pCredit();
                break;
            case 2: iCredit();;
                break;
            case 3: eCredit();;
                break;
            case 4: consignedE();
                break;
        }
        
        do{
            option = charOption("Voltar ao menu ou sair (v/s): ");
        }while (option != 'v' && option != 's');

        if(option == 'v'){
            printMenu();
            chooseMenu();
        }
        else{
            System.out.println("Volte sempre (◠‿・)—☆");
        }
    }

    static void pCredit(){
        System.out.println("Crédito Pessoal");
    }
    
    static void iCredit(){
        System.out.println("Crédito Imobiliário");
    }

    static void eCredit(){
        System.out.println("Crédito Empresarial");
    }

    static void consignedE(){
        System.out.println("Empréstimo Consignado");
    }

    static int numberOption(String mensagem){
        System.out.print(mensagem);
        int entrada = Integer.parseInt(sc.nextLine());
        return entrada;
    }

    static char charOption(String mensagem){
        System.out.print(mensagem);
        char option = sc.nextLine().toLowerCase().charAt(0);;
        return option;
    }
}
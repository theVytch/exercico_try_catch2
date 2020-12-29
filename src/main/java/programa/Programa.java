package programa;

import entidade.Conta;
import entidade.exceptions.DomainExceptions;

import java.util.*;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        try{
        System.out.print("Numero da conta: ");
        int numero = ler.nextInt();
        ler.nextLine();
        System.out.print("Titular: ");
        String titular = ler.nextLine();
        System.out.print("Saldo: ");
        Double saldo = ler.nextDouble();
        System.out.print("Limite de Saque: ");
        Double limiteSaque = ler.nextDouble();
        Conta conta = new Conta(numero, titular, saldo, limiteSaque);
        System.out.println(conta);
        System.out.println();
        System.out.print("Entre com um valor para saque:");
        Double montante = ler.nextDouble();
        conta.saque(montante);
        System.out.print("Novo Saldo: "+ conta.getSaldo());
        System.out.println();
        System.out.println("conta atualizada" + conta);
        }catch (DomainExceptions e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Digite numero do tipo Inteiro");
        }
        ler.close();
    }
}

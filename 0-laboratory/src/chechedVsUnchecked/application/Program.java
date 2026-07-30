package chechedVsUnchecked.application;

import chechedVsUnchecked.model.entities.Usuario;
import chechedVsUnchecked.model.exceptions.ValidacaoException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
        checked é um resultado esperado de negócio, algo que foi validado antes.
        unchecked é um erro de lógica, uma violação de uma pré-condição imposta.
        */

        Scanner sc = new Scanner(System.in);
        Usuario usuario = criacaoUsuario(sc);
        System.out.println("Usuário(a) " + usuario.getNome() + " criado!");
    }

    public static Usuario criacaoUsuario(Scanner sc) {
        while (true) {
            try {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("E-mail: ");
                String email = sc.nextLine();
                System.out.print("Idade: ");
                int idade = sc.nextInt();

                return new Usuario(nome, email, idade);
            } catch (ValidacaoException e) {
                System.out.println(e.getMessage());
            } catch (RuntimeException e) {
                System.out.println("Erro inesperado: " + e.getMessage());
                sc.nextLine();
            }
        }
    }
}

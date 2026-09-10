package chechedVsUnchecked.model.entities;

import chechedVsUnchecked.model.exceptions.ValidacaoException;

public class Usuario {
    private String nome;
    private String email;
    private Integer idade;

    public Usuario() {
    }

    public Usuario(String nome, String email, Integer idade) {
        if (nome == null || nome.isBlank()) {
            throw new ValidacaoException("O nome não pode ser vazio ou nulo.");
        }

        if (!email.contains("@")) {
            throw new ValidacaoException("O e-mail precisa conter @.");
        }

        if (idade < 18) {
            throw new ValidacaoException("É necessário ser maior de idade");
        }

        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }


    public String getEmail() {
        return email;
    }


    public Integer getIdade() {
        return idade;
    }
}

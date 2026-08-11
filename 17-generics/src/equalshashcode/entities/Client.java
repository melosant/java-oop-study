package equalshashcode.entities;

import java.util.Objects;
/*
hashcode - é gerado um código hash para comparações entre objetos (pode haver colisões, mas rápido)
equals - compara objetos e atributos específicos (preciso)

normalmente se utiliza hashcodes para buscas em larga escala por ser rápido, caso os hashs sejam iguais, por garantia,
utiliza-se o método equals para comparar ambos.
 */
public class Client {
    private String name;
    private String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(email, client.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
}

package controle;

import java.io.Serializable;

public class Login implements Serializable {
    private static final long serialVersionUID = 1L;
    public Long _id;
    public String nome;
    public String senha;


    @Override
    public String toString() {
        return "Login{" +
                "_id=" + _id +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
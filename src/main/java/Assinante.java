public abstract class Assinante {
    private String nome;
    private String username;

    private String plano;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public abstract String visualizarCatalogo();

    public String getTipo() {
        return "Assinante";
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    @Override
    public String toString() {
        return "Assinante{" +
                "nome='" + nome + '\'' +
                ", username='" + username + '\'' +
                ", plano='" + plano + '\'' +
                '}';
    }
}

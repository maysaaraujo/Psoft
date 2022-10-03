public class produto {
    private String Nome;
    private String Fabricante;
    private double Preco;

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setFabricante(String fabricante) {
        this.Fabricante = fabricante;
    }

    public void setPreco(double preco) {
        this.Preco = preco;
    }

    public String getNome() {
        return Nome;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public double getPreco() {
        return Preco;
    }

    public produto(String nome, String fabricante, double preco) {
        this.Nome = nome;
        this.Fabricante = fabricante;
        this.Preco = preco;
    }
}

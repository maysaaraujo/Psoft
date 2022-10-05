public class serviceProduto {

    repositoryProduto repositoryProduto = new repositoryProduto();
    private produto produto1;

    void setProduto(String nome, String fabricante, double valor){
        produto produto1 = new produto(nome,fabricante,valor);
        repositoryProduto.listaProdutos.add(produto1);
    }

    void listProduto
}

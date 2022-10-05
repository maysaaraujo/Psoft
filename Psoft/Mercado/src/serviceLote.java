public class serviceLote {
    repositoryLote repositoryLote = new repositoryLote();
    private lote lote1;

    void setLote(int Quant, Date Validade,double valor){
        lote produto1 = new produto(nome,fabricante,valor);
        repositoryProduto.listaProdutos.add(produto1);
    }
}

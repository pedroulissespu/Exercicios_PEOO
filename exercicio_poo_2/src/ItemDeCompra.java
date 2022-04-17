public class ItemDeCompra {
    private int id;
    private String descricao_do_produto;
    private int quantidade_comprada_de_item;
    private double preco_do_item;

    public ItemDeCompra(int id, String descricao_do_produto,int quantidade_comprada_de_item, double preco_do_item){
        this.id = id;
        this.descricao_do_produto = descricao_do_produto;
        if(quantidade_comprada_de_item < 0) quantidade_comprada_de_item = 0;
        else if(preco_do_item < 0.0) preco_do_item = 0;

        this.quantidade_comprada_de_item = quantidade_comprada_de_item;
        this.preco_do_item = preco_do_item;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getDescricao_do_produto(){
        return descricao_do_produto;
    }

    public void setDescricao_do_produto(String descricao_do_produto){
        this.descricao_do_produto = descricao_do_produto;
    }

    public int getQuantidade_comprada_de_item(){
        return quantidade_comprada_de_item;
    }

    public void setQuantidade_comprada_do_item(int quantidade_comprada_de_item){
        this.quantidade_comprada_de_item = quantidade_comprada_de_item;
    }

    public double getPreco_do_item(){
        return preco_do_item;
    }

    public void setPreco_do_item(double preco_do_item){
        this.preco_do_item = preco_do_item;
    }

    public double getItemDeCompra(){
        return quantidade_comprada_de_item * preco_do_item;
    }

    public String toString(){
        return "O Id do produto : " + id +
                " , sua descrição : " + descricao_do_produto +
                " , quantidade disponivel : " + String.format("%d", quantidade_comprada_de_item) +
                " , preço : " + preco_do_item +
                "e o total da compra foi : R$ " + String.format(".2f", getItemDeCompra());
    }
}

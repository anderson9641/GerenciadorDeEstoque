package Model.Entidades;

import java.util.List;
import java.util.logging.Logger;

public class Estoque {

    public Estoque() {
    }

    public Estoque(Produto produto, double quantidadeDisponivel) {
        this.produto = produto;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    private Produto produto;
    private double quantidadeDisponivel;
    private List<ItemSaida> produtos;

    public List<ItemSaida> getProdutos() {
        return produtos;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(double quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public void EntradaItens(ItemSaida itemProduto) {
        ItemSaida item = itemProduto;
        for (ItemSaida i : produtos) {

            if (item.getProduto().getId() == i.getProduto().getId()) {
                
                i.setQuantidade(quantidadeDisponivel + item.getQuantidade());

            }
        }
    }
    
    public void saidaItens(ItemSaida itemProduto) {
        ItemSaida item = itemProduto;
        for (ItemSaida i : produtos) {

            if (item.getProduto().getId() == i.getProduto().getId()) {
                if(item.getQuantidade() > i.getQuantidade())
                i.setQuantidade(quantidadeDisponivel - item.getQuantidade());

            }
        }
    }

}

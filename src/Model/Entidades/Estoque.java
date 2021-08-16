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
    private List<ItemProduto> produtos;

    public List<ItemProduto> getProdutos() {
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

    public void EntradaItens(ItemProduto itemProduto) {
        ItemProduto item = itemProduto;
        for (ItemProduto i : produtos) {

            if (item.getProduto().getId() == i.getProduto().getId()) {
                
                i.setQuantidade(quantidadeDisponivel + item.getQuantidade());

            }
        }
    }
    
    public void saidaItens(ItemProduto itemProduto) {
        ItemProduto item = itemProduto;
        for (ItemProduto i : produtos) {

            if (item.getProduto().getId() == i.getProduto().getId()) {
                if(item.getQuantidade() > i.getQuantidade())
                i.setQuantidade(quantidadeDisponivel - item.getQuantidade());

            }
        }
    }

}

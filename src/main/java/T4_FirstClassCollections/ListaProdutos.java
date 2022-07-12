package T4_FirstClassCollections;

import utils.Produto;

import java.util.*;
import java.util.stream.Collectors;

public class ListaProdutos {

    private final List<Produto> produtos = new ArrayList<>();

    public boolean add(Produto produto) {
        if(!verificarSePodeAdicionarProduto(produto))
            return false;

        return produtos.add(produto);
    }

    public List<Produto> listarProdutosAcimaDeMilReais() {
        return produtos.stream()
                .filter(produto -> produto.getValor()>1000)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public List<Produto> buscarPorNome(String nome) {
        return produtos.stream()
                .filter(produto -> produto.getNome().contains(nome))
                .collect(Collectors.toList());
    }

    public boolean verificarSePodeAdicionarProduto(Produto produto) {
        return produto.getValor()>=0.0 && buscarPorNome(produto.getNome()).isEmpty();
    }

    public int size() {
        return produtos.size();
    }

    public boolean isEmpty() {
        return produtos.isEmpty();
    }

    /*
     * Outros métodos de lista...
     * */
}

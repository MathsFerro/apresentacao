package T4_FirstClassCollections;


import utils.Produto;
import utils.Vendedor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class SemT4 {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", 5000.00);
        List<Produto> listaProdutos = new ArrayList<>();

        if(verificarSePodeAdicionarProduto(listaProdutos, notebook))
            listaProdutos.add(notebook);

        listarProdutosAcimaDeMilReais(listaProdutos);
    }

    private static boolean verificarSePodeAdicionarProduto(List<Produto> listaProdutos, Produto produto) {
        return produto.getValor()>=0.0 && buscarPorNome(listaProdutos, produto.getNome()).isEmpty();
    }

    private static List<Produto> listarProdutosAcimaDeMilReais(List<Produto> produtos) {
        return produtos.stream()
                .filter(produto -> produto.getValor()>1000)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    private static List<Produto> buscarPorNome(List<Produto> produtos, String nome) {
        return produtos.stream()
                .filter(produto -> produto.getNome().contains(nome))
                .collect(Collectors.toList());
    }
}

class ComT4 {

    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", 5000.00);
        ListaProdutos listaProdutos = new ListaProdutos();

        listaProdutos.add(notebook);
        listaProdutos.listarProdutosAcimaDeMilReais();
    }
}

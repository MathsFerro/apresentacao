package T4_FirstClassCollections;

import utils.Produto;

import java.util.*;
import java.util.stream.Collectors;

public class ListaProdutos2 implements List<Produto> {

    private final List<Produto> produtos = new ArrayList<>();

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return produtos.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return produtos.contains(o);
    }

    @Override
    public Iterator<Produto> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Produto produto) {
        if(!verificarSePodeAdicionarProduto(produto))
            return false;

        return produtos.add(produto);
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Produto> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Produto> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
    }

    @Override
    public Produto get(int index) {
        return null;
    }

    @Override
    public Produto set(int index, Produto element) {
        return null;
    }

    @Override
    public void add(int index, Produto element) {
    }

    @Override
    public Produto remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Produto> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Produto> listIterator(int index) {
        return null;
    }

    @Override
    public List<Produto> subList(int fromIndex, int toIndex) {
        return null;
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
}


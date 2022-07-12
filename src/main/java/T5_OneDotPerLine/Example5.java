package T5_OneDotPerLine;

import utils.Produto;
import utils.Vendedor;

import java.util.ArrayList;

// Um ponto por linha
class SemT5 {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Matheus", new ArrayList<>());
        Produto p1 = new Produto("Iphone", 4000.0);

        if(vendedor.getProdutosVendidos().isEmpty()) {
            vendedor.getProdutosVendidos().add(p1);
            vendedor.getProdutosVendidos().get(0).getNome();
        }

        if(vendedor.getNome().equals("Teste")) {
            ...
        }
    }
}


class ComT5 {
    public static void main(String[] args) {
        VendedorT5 vendedor = new VendedorT5("Matheus", new ArrayList<>());
        Produto p1 = new Produto("Iphone", 4000.0);

        if(vendedor.verificarListaSeEstaVazia()) {
            vendedor.adicionarProdutoVendido(p1);
            vendedor.nomeDoPrimeiroProduto();
        }

        if(vendedor.validarNome("Teste")) {
        }
    }

}

// Exceções - Builder, Query Builder e o uso de "this"

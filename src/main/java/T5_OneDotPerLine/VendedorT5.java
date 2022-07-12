package T5_OneDotPerLine;

import lombok.AllArgsConstructor;
import lombok.Data;
import utils.Produto;

import java.util.List;

@Data
@AllArgsConstructor
public class VendedorT5 {

    private String nome;
    private List<Produto> produtosVendidos;

    public boolean validarNome(String nome) {
        return this.nome.equalsIgnoreCase(nome);
    }

    public void adicionarProdutoVendido(Produto produto) {
        produtosVendidos.add(produto);
    }

    public boolean verificarListaSeEstaVazia() {
        return produtosVendidos.isEmpty();
    }

    public Produto primeiraPosicao() {
        return produtosVendidos.get(0);
    }

    public String nomeDoPrimeiroProduto() {
        return primeiraPosicao().getNome();
    }

}

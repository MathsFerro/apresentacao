package utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import utils.Produto;

import java.util.List;

@Data
@AllArgsConstructor
public class Vendedor {

    private String nome;
    private List<Produto> produtosVendidos;

}

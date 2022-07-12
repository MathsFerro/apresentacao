package T1_OnlyOneLevelOfIndentationPerMethod;

import utils.Produto;
import utils.Vendedor;

import java.util.ArrayList;

class SemT1 {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Matheus", new ArrayList<>());
        Produto produto = new Produto("Iphone", 4000.0);

        if(produto.getValor()>=0.0) {
            boolean produtoJaVendido = Boolean.FALSE;
            if (produtoJaVendido) {
                System.out.println("Esse produto já foi vendido");

                if(produto.getNome().equalsIgnoreCase("Iphone")) {
                    System.out.println("É um iphone");
                }
            } else {
                vendedor.getProdutosVendidos().add(produto);
            }
        } else {
            System.out.println("Produto está com preço abaixo de R$ 0");
        }
    }
}

class ComT1 {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Matheus", new ArrayList<>());
        Produto produto = new Produto("Iphone", 4000.0);

        if(produto.getValor()>=0.0) {
            Boolean produtoJaVendido = Boolean.FALSE;
            adicionarProduto(produtoJaVendido, produto, vendedor);
        } else {
            System.out.println("Produto está com preço abaixo de R$ 0");
        }
    }

    private static void adicionarProduto(Boolean produtoJaVendido, Produto produto, Vendedor vendedor) {
        if (produtoJaVendido) {
            System.out.println("Esse produto já foi vendido");
            verificarSeClienteEIphone(produto);
        } else {
            vendedor.getProdutosVendidos().add(produto);
        }
    }

    private static void verificarSeClienteEIphone(Produto produto) {
        if(produto.getNome().equalsIgnoreCase("Iphone")) {
            System.out.println("É um iphone");
        }
    }

}

class SemT1Ex2 {
    public static void main(String[] args) {

        final int[][] matriz = { {2,7,9},{3,6,1},{7,4,2} };

        for (int linha=0; linha<matriz[0].length; linha++) {
            for (int coluna=0; coluna<matriz[linha].length; coluna++) {
                System.out.print(matriz[coluna][linha] + " ");
            }
            System.out.println("");
        }
    }
}

class ComT1Ex2 {
    public static void main(String[] args) {

        final int[][] matriz = { {2,7,9},{3,6,1},{7,4,2} };

        for (int linha=0; linha<matriz[0].length; linha++) {
            printarColunas(matriz, linha);
            System.out.println("");
        }
    }

    private static void printarColunas(int[][] matriz, int linha) {
        for (int coluna=0; coluna<matriz[linha].length; coluna++) {
            System.out.print(matriz[coluna][linha] + " ");
        }
    }
}
package T2_DontUseElseKeyword;

import jdk.internal.access.SharedSecrets;
import utils.Produto;
import utils.Vendedor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class SemT2 {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Matheus", new ArrayList<>());
        Produto produto = new Produto("Iphone", 4000.0);

        if(produto.getValor()>=0.0) {
            if(verificarSeProdutoFoiVendido(produto, vendedor)) {
                System.out.println("Esse produto já foi vendido");
            } else {
                if(produto.getNome().equalsIgnoreCase("Iphone")) {
                    System.out.println("É um iphone não deve dar desconto");
                } else {
                    System.out.println("Dar um desconto");
                }
                vendedor.getProdutosVendidos().add(produto);
            }
        } else {
            System.out.println("Produto está com preço abaixo de R$ 0");
        }
    }

    private static boolean verificarSeProdutoFoiVendido(Produto produto, Vendedor vendedor) {
        return vendedor.getProdutosVendidos().stream()
                .anyMatch(p -> p.getNome().equalsIgnoreCase(produto.getNome()));
    }
}

class ComT2 {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Matheus", new ArrayList<>());
        Produto produto = new Produto("Iphone", 4000.0);

        if(produto.getValor() < 0.0) {
            System.out.println("Produto está com preço abaixo de R$ 0");
            return;
        }

        if(verificarSeProdutoFoiVendido(produto, vendedor)) {
            System.out.println("Esse produto já foi vendido");
            return;
        }

        verificarSeDeveDarDesconto(produto);
        vendedor.getProdutosVendidos().add(produto);
    }

    private static void verificarSeDeveDarDesconto(Produto produto) {
        if(produto.getNome().equalsIgnoreCase("Iphone")) {
            System.out.println("É um iphone não deve dar desconto");
            return;
        }

        System.out.println("Dar um desconto");
    }

    private static boolean verificarSeProdutoFoiVendido(Produto produto, Vendedor vendedor) {
        return vendedor.getProdutosVendidos().stream()
                .anyMatch(p -> p.getNome().equalsIgnoreCase(produto.getNome()));
    }
}

class SemT2Ex2 {

    // ArrayList
    public ArrayList(Collection<? extends E> c) {
        Object[] a = c.toArray();
        if ((size = a.length) != 0) {
            if (c.getClass() == ArrayList.class) {
                elementData = a;
            } else {
                elementData = Arrays.copyOf(a, size, Object[].class);
            }
        } else {
            // replace with empty array.
            elementData = EMPTY_ELEMENTDATA;
        }
    }
}

class ComT2Ex2 {

    public ArrayList(Collection<? extends E> c) {
        Object[] a = c.toArray();
        if ((size = a.length) == 0) {
            elementData = EMPTY_ELEMENTDATA;
            return;
        }

        if (c.getClass() == ArrayList.class) {
            elementData = a;
            return;
        }

        elementData = Arrays.copyOf(a, size, Object[].class);
    }
}

class SemT2Ex3 {
    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {
        if (size > 0) {
            // like clone(), allocate array based upon size not capacity
            SharedSecrets.getJavaObjectInputStreamAccess().checkArray(s, Object[].class, size);
            Object[] elements = new Object[size];

            // Read in all elements in the proper order.
            for (int i = 0; i < size; i++) {
                elements[i] = s.readObject();
            }

            elementData = elements;
        } else if (size == 0) {
            elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new java.io.InvalidObjectException("Invalid size: " + size);
        }
    }
}

class ComT2Ex3 {
    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {
        if(size < 0)
            throw new java.io.InvalidObjectException("Invalid size: " + size);

        if(size == 0) {
            elementData = EMPTY_ELEMENTDATA;
            return;
        }

        SharedSecrets.getJavaObjectInputStreamAccess().checkArray(s, Object[].class, size);
        Object[] elements = new Object[size];
        for (int i = 0; i < size; i++) {
            elements[i] = s.readObject();
        }

        elementData = elements;
    }
}

/*

Return early é a maneira de escrever funções ou métodos para que o resultado positivo esperado é retornado no final da
função e o restante do código encerra a execução (retornando ou lançando uma exceção) quando as condições não são atendidas.


 */






package T6_DontAbbreviate;

import utils.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SemR6 {

    public static void main(String[] args) {
        Produto pr = new Produto("Iphone", 10000.0);
        String n = pr.getNome();
        String s = "Samsung";
        String x = "Xiaomi";

        if(n.equalsIgnoreCase(s)) {
            ...
        }

        List<Produto> prs = Stream.of(pr)
                .filter(it -> it.getNome().equalsIgnoreCase(x))
                .collect(Collectors.toList());
    }

}

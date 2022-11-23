package estrutural.proxy.código;

import java.util.ArrayList;
import java.util.List;

public class ProxyExample {
    public static void main(String[] args) {
          List<IPessoa> pessoas = new ArrayList<IPessoa>();

          pessoas.add(new ProxyPessoa("A"));
          pessoas.add(new ProxyPessoa("B"));
          pessoas.add(new ProxyPessoa("C"));

          System.out.println("Nome: " + pessoas.get(0).getNome());
          System.out.println("Nome: " + pessoas.get(1).getNome());
          System.out.println("Nome: " + pessoas.get(0).getNome());

          System.out.println("Id da 3ª - " + pessoas.get(2).getId());
    }
}

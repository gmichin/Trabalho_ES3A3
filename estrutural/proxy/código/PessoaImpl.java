package estrutural.proxy.código;

class PessoaImpl implements IPessoa {
    private String nome;
    private String id;

    public PessoaImpl(String id,String nome) {
          this.id       = id;
          this.nome = nome;
          System.out.println("Retornou a pessoa do banco de dados ->  " + nome);
    }

    public String getNome() {
          return nome;
    }
    public String getId() {
          return this.id;
    }
}


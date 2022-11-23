package estrutural.proxy.código;

class ProxyPessoa implements IPessoa {
    private String id;

    private IPessoa pessoa;

    public ProxyPessoa(String nome) {
          this.id = nome;
    }

    public String getNome() {
          if (pessoa == null) {
                pessoa = PessoaDAO.getPessoaByID(this.id);
          }
          return pessoa.getNome();
    }

    public String getId() {
          return this.id;
    }
}


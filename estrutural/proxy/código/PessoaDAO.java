package estrutural.proxy.código;

class PessoaDAO {
      public static IPessoa getPessoaByID(String id){
            System.out.println("select * from PESSOA where id="+id);
            return new PessoaImpl(id,"Pessoa " + id);
      }
}
package criacional.builder.código;

public class Director {
    IBuilder meuBuilder;
 
    public void construir(IBuilder builder)
    {
          meuBuilder=builder;
          meuBuilder.constroiCarcaca();
          meuBuilder.inserePneus();
          meuBuilder.adicionaFarois();
    }
 }
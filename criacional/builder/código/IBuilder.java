package criacional.builder.código;

public interface IBuilder {
    void constroiCarcaca();
    void inserePneus();
    void adicionaFarois();
    Produto getVeiculo();
}
package criacional.prototype.código;

public class PrototypePatternEx  {


    public static void main(String args[]) throws CloneNotSupportedException {
  
      System.out.println("***Exemplo do padrão Prototype***\n");
      Carro chevrolet = new Chevrolet("Cruze Sport v6");
      chevrolet.preco = 100000;
      Carro ford = new Ford("Focus 2.0");
      ford.preco=500000;
  
      Carro bc1;
      bc1 = chevrolet.clone();
  
      bc1.preco = chevrolet.preco + Carro.setPreco();
      System.out.println("Nome do Carro: "+ bc1.getNomeModelo() + ", Preço do Carro: " + bc1.preco);
  
      bc1 = ford.clone();
  
      bc1.preco = ford.preco + Carro.setPreco();
      System.out.println("Nome do Carro: "+ bc1.getNomeModelo() + ", Preço do Carro: "+bc1.preco);
  
   }
  
  }
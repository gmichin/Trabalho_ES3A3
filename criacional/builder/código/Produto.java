package criacional.builder.código;

import java.util.LinkedList;

public class Produto {

   private LinkedList<String> partesDoVeiculo;

   public Produto()
   {
         partesDoVeiculo= new LinkedList<String>();
   }

   public void adicionar(String parteDoVeiculo)
   {
         partesDoVeiculo.addLast(parteDoVeiculo);
   }

   public void exibir()
   {
         System.out.println("\n Produto completo: ");

         for(int i=0; i<partesDoVeiculo.size(); i++)
         {
                System.out.println(partesDoVeiculo.get(i));
         }
   }
}
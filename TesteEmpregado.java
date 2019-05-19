public class TesteEmpregado{
   public static void main(String[] args){
      Empregado emp1 = new Empregado("Joao da Silva");
     /* System.out.println(emp1.getNome());
      System.out.println(emp1.salario()); */
      System.out.println(emp1); //invoca o toString.
      
      Empregado emp2 = new Mensalista("Jose Pereira", 3500.00);
      //System.out.println(emp2.getNome());
      //System.out.println(emp2.salario());
      System.out.println(emp2);
      
      Empregado emp3 = new Comissionado("Maria Pereira", 1500.00, 5000.00);
      //System.out.println(emp3.getNome());
      //System.out.println(emp3.salario());
      System.out.println(emp3);
      emp3.setComissao(10000.0);
      //System.out.println(emp3.salario());
      System.out.println(emp3);
      
      Empregado emp4 = new Horista ("Arnald Figueiras", 120, 30);
      System.out.println (emp4);
   }

}
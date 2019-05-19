public class Mensalista extends Empregado{
   private double salario;
   
   public Mensalista(String nome, double salario){
      super(nome);
      this.salario = salario;
   }
   
   public double salario(){  // num projeto adequado seria abstrato
      return this.salario;
   }
   
}
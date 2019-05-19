public class Horista extends Empregado{
   
   //criar atributos
   private int horasTrabalhadas;
   private double valorHora;
   
   //inicializar os atributos com construtor
   public Horista (String nome, int horasTrabalhadas, double valorHora){
      super(nome);
      this.horasTrabalhadas = horasTrabalhadas;
      this.valorHora = valorHora;
   }
   
   //sobrepor metodo salario para retornar horasTrabalhadas
   public double salario() {
      return horasTrabalhadas * valorHora;
   }
   
   
}
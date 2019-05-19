public class Comissionado extends Mensalista{
   private double comissao;
   
   public Comissionado(String nome, double salario, double comissao){
      super(nome, salario); // pede para classe pai os atributos nome e salario
      this.comissao = comissao;
   }
   
   public double salario(){
      return super.salario()+comissao;
   }
   
   public void setComissao(double comissao){
      this.comissao = comissao;
   }
}
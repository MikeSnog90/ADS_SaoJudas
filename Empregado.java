public class Empregado{
   
   private String nome;
   
   public Empregado(String nome){
      this.nome = nome;
   }
   public Empregado(){}
   
   public String getNome(){
      return nome;
   }
   
   public void setNome(String nome){
      this.nome = nome;
   }
   
   public double salario(){  //num projeto adequado seria abstrato
      return 0.0;
   }
   
   public void setComissao(double comissao){
      //não faz nada -> vai ser abstrato mais adiante
   }
   
   @Override // sobrescrita - não pode mudar assinatura do metodo
   public String toString(){
      return "Empregado [ nome " + nome + ", salario " + salario()+" ]";
   }
}
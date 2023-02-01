public class Assistente extends funcionario {

    public Assistente(String nome, int matricula, double salario_base) {
        super(nome, matricula, salario_base);
        
    }
   
    @Override
    public double calcularSalario() {
        // TODO Auto-generated method stub
      
       return getSalario_base();
    }
     
    @Override
    public String toString(){
        return super.toString()+"->Eu sou o Assistente e recebo: R$ "+calcularSalario();

    }
    
}

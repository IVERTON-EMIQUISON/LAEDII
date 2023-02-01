public class Gerente extends funcionario{

    public Gerente(String nome, int matricula, double salario_base) {
        super(nome, matricula, salario_base);
      
    }
    
    @Override
    public double calcularSalario() {
        return getSalario_base()*2;
    }

    @Override
    public String toString(){
        return super.toString()+"->Eu sou o gerente e recebo: R$ "+calcularSalario();
    }
}

public class Vendedor extends funcionario {

    private double comissao;

    public Vendedor(String nome, int matricula, double salario_base) {
        super(nome, matricula, salario_base);
        this.comissao = 150;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    @Override
    public double calcularSalario() {
        // TODO Auto-generated method stub
        return getSalario_base() + this.comissao;
    }
       
    @Override
    public String toString(){
        return super.toString()+"->Eu sou o Vendedor e recebo: R$ "+calcularSalario()+" desse valor eu recebi :R$ "+this.comissao+" de comissão";

    }
}

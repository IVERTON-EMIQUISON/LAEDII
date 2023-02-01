
public abstract class funcionario {
    private String nome;
    private int matricula;
    private double salario_base;
    
    public funcionario(String nome, int matricula, double salario_base) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario_base = salario_base;
    }

    public funcionario() {
        this.nome = "-";
        this.matricula = 0;
        this.salario_base = 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    @Override
    public String toString() {
        return "nome = " + nome + "\nmatricula = " + matricula + "\nsalario_base = " + salario_base + "";
    }

    public abstract double calcularSalario();
        
}

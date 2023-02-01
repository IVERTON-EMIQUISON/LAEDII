import java.util.ArrayList;

public class Gerentefuncionario {
    private ArrayList<funcionario> lista;
    
    public Gerentefuncionario(){
        this.lista = new ArrayList<funcionario>();
    }
    
    public void AddFuncionario(funcionario f){
        for(funcionario funcionario:this.lista){
            if(funcionario.getMatricula() == f.getMatricula()){
                System.out.println("Erro o funcionario já foi cadastrado");
                return;
            }
        }
       // System.out.println("Funcionario "+i+" foi adicionado com sucesso!");
        this.lista.add(f);
      
    }

    public void RemoverFuncionario(int matricula){
        for(funcionario f: this.lista){
            if(f.getMatricula() == matricula){
                this.lista.remove(f);
                System.out.println("Funcionário Removido foi: " +f.getNome());
                return;
            }
            
        }
        System.out.println("Não ha funcionario com essa matricula");
    }

    public funcionario imprimirFuncionario(int matricula){
        for(funcionario f:  this.lista){
            if(f.getMatricula() == matricula){
                System.out.println("Funcionario imprimido com sucesso!");
                return f;
            }
        }
        return null;
    }

    public void imprimirTodos(){
        if( this.lista.isEmpty()){
            System.out.println("Não há cadastro de funcionario!");
            
        }
        for(funcionario f : this.lista){
            System.out.println("Funcionarios cadastrados\n ");
            System.out.println("\n"+f+"\n");
        }
    }

    public double folhaSalarial(){
        double cont = 0;
        for(funcionario f :  this.lista){
           cont += f.calcularSalario();   
        }
        System.out.println("Folha salarial " +cont);
        return cont;
    }


}

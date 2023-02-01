import java.util.Scanner;

public class principal {
  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);
    Vendedor v1 = new Vendedor("Iverton",2,300); 
    Vendedor v2 = new Vendedor("carlas",3,340); 

    Assistente a1 = new Assistente("Vito", 5, 550);
    Assistente a2 = new Assistente("Lucas", 4, 500);

    Gerente g1 = new Gerente("Mateus", 8, 880);
    Gerente g2 = new Gerente("Italo", 9, 800);

    Gerentefuncionario gf = new Gerentefuncionario();

    gf.AddFuncionario(v1);
    gf.AddFuncionario(v2);
    gf.AddFuncionario(new Vendedor("Emiquison",43,3440));

    gf.AddFuncionario(a1);
    gf.AddFuncionario(a2);

    gf.AddFuncionario(g1);
    gf.AddFuncionario(g2);

    gf.imprimirTodos();
    gf.folhaSalarial();
    

    gf.RemoverFuncionario(3);
    gf.RemoverFuncionario(43);
    gf.RemoverFuncionario(8);

    gf.imprimirTodos();

    gf.folhaSalarial();

    gf.imprimirFuncionario(2);
    
    gf.imprimirTodos();

    gf.folhaSalarial();

    sc.close();

  }
 
}

package br.com.geovanni.sistemafuncionarios;
import br.com.geovanni.sistemafuncionarios.model.Funcionario;
import br.com.geovanni.sistemafuncionarios.service.Empresa;

public class Main {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		
		empresa.setNomeEmpresa("Geovanni Tech");
		
		Funcionario ana = new Funcionario("Ana", 25, "111", "Chefe", 5000.00);
		Funcionario bruno = new Funcionario("Bruno", 21, "222", "Analista", 4000.00);
		Funcionario carlos = new Funcionario("Carlos", 18, "333", "Estagiário", 3000.00);
		
		empresa.adicionarFuncionario(ana);
		empresa.adicionarFuncionario(bruno);
		empresa.adicionarFuncionario(carlos);
			
		
		//Teste de métodos:
		
		empresa.atualizarFuncionario("Ana", "Gerente", 7000);
		
		//empresa.removerFuncionario("Bruno");
		//empresa.listarFuncionarios();
		//empresa.buscarFuncionario("Bruno");
	}

}

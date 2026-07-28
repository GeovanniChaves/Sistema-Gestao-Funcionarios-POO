package br.com.geovanni.sistemafuncionarios.service;
import java.util.ArrayList;

import br.com.geovanni.sistemafuncionarios.model.Funcionario;

public class Empresa {

	private String nomeEmpresa;	
	private ArrayList<Funcionario> funcionarios;
	
	
	public Empresa() {
		funcionarios = new ArrayList<>();
	}
	
	public Empresa(String nomeEmpresa, ArrayList<Funcionario> funcionarios) {
		this.nomeEmpresa = nomeEmpresa;
		this.funcionarios = funcionarios;
	}
	
	
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
	
	public ArrayList<Funcionario> getFuncionarios(){
		return funcionarios;
	}
	
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	
	
	public void adicionarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
		
	}
	
	public void listarFuncionarios() {
		System.out.println("Funcionários ativos:");
		System.out.println("");
		for (int i = 0; i < funcionarios.size(); i++) {
		    
		    Funcionario funcionario = funcionarios.get(i);
		    
		    funcionario.exibirDados();
		}
	}
		
	
	public void buscarFuncionario(String nome) {
		boolean encontrado = false;
		
		for (int i = 0; i < funcionarios.size(); i++) {
		    Funcionario funcionario = funcionarios.get(i);
		    	if(nome.equalsIgnoreCase(funcionario.getNome())){
		    		funcionario.exibirDados();
		    		
		    		encontrado = true;
		    	}	    
		}
		
		if(!encontrado) {
			System.out.println("Funcionário não encontrado.");
		}
		
	}
	
	
	public void removerFuncionario(String nome) {
		boolean remover = false;
		
		for(int i = 0; i < funcionarios.size(); i++) {
			Funcionario funcionario = funcionarios.get(i);
				if(nome.equalsIgnoreCase(funcionario.getNome())) {
					System.out.println("Funcionário removido:");
					funcionario.exibirDados();
					
					funcionarios.remove(funcionario);
					
					remover = true;
					
					break;
				}						
		}
		
		if(!remover) {
			 System.out.println("Funcionário não encontrado.");
		}
	}
	
	
	public void atualizarFuncionario(String nome, String novoCargo, double novoSalario) {
	    for(int i = 0; i < funcionarios.size(); i++) {

	        Funcionario funcionario = funcionarios.get(i);

	        if(nome.equalsIgnoreCase(funcionario.getNome())) {

	            funcionario.setCargo(novoCargo);
	            funcionario.setSalario(novoSalario);

	            System.out.println("Funcionário atualizado!");
	            break;
	        }
	    }
	}
	
	
}

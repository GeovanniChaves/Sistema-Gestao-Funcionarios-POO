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
	
	
	
}

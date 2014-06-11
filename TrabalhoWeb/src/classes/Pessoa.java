package classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PESSOA")
public class Pessoa {
	
	@Id
	@Column(name= "PESSOA_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	String nome;
	String sexo;
	String cpf;
	String nu_telefone;
	String nu_celular;
	String de_endereco;
	String senha;
	String rg;
	String email_login;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNu_telefone() {
		return nu_telefone;
	}
	public void setNu_telefone(String nu_telefone) {
		this.nu_telefone = nu_telefone;
	}
	public String getNu_celular() {
		return nu_celular;
	}
	public void setNu_celular(String nu_celular) {
		this.nu_celular = nu_celular;
	}
	public String getDe_endereco() {
		return de_endereco;
	}
	public void setDe_endereco(String de_endereco) {
		this.de_endereco = de_endereco;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email_login;
	}
	public void setEmail(String email) {
		this.email_login = email;
	}
}

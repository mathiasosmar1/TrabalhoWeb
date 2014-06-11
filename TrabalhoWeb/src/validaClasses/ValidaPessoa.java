package validaClasses;

import classes.Pessoa;

public class ValidaPessoa {
	
	public static boolean validarCamposNulos(Pessoa pessoa){
		String nome = pessoa.getNome();
		String cpf = pessoa.getCpf();
		String email_login = pessoa.getEmail();
  		String endereco = pessoa.getDe_endereco();
		String nu_celular = pessoa.getNu_celular();
		String nu_telefone = pessoa.getNu_telefone();
		String rg = pessoa.getRg();
		String senha = pessoa.getSenha();
		String sexo = pessoa.getSexo();
			
		return false;		
	}
	
	public static String validaLogin(String login){
		if (login.isEmpty() || login == null){
			return "Login inválido";
		}
		return "";
	}
}

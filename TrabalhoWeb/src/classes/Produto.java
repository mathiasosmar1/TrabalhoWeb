package classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO")
public class Produto {
	
	@Id
	@Column(name = "PRODUTO_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	String de_produto;
	int qt_produto;
	String enderecoImagem;
	
	
	
	
}

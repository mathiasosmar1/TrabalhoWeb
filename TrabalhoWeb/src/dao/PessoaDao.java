package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import util.PersistenceManager;
import classes.Pessoa;

public class PessoaDao {

	private EntityManager em = PersistenceManager.getInstance().getEntityManagerFactory().createEntityManager();

	public void inserir(Pessoa pessoa){
		try{
			EntityTransaction t = em.getTransaction();
			try{
				t.begin();
				em.persist(pessoa);
				t.commit();
			}finally{
				if(t.isActive())
					t.rollback();
			}
		}finally{
			em.close();
		}
	}

	public String retornarSenha(String usuario){
		try{
			Query q = em.createQuery("from Pessoa as p where p.email_login = :login");
			q.setParameter("login", usuario);
			if (q.getResultList().size() <= 0 )
				return null;
			Pessoa pessoa = (Pessoa) q.getSingleResult();
			String senha = pessoa.getSenha();
			return senha;
		}finally{
			em.close();
		}
	}
}

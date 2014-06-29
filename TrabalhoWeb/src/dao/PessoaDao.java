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

	public boolean retornarSenha(String usuario, String senha){
		try{
			Query q = em.createQuery("from Pessoa as p where p.email_login = :login and p.senha = :senha");
			q.setParameter("login", usuario);
			q.setParameter("senha", senha);
			
			if (q.getResultList().size() > 0){
				return true;
			}
			return false;
		}finally{
			em.close();
		}
	}
}

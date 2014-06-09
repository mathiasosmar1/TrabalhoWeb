package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
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
}

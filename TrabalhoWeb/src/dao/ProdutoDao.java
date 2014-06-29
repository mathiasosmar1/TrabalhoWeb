package dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import util.PersistenceManager;
import classes.Produto;

public class ProdutoDao {
	
	private EntityManager em = PersistenceManager.getInstance().getEntityManagerFactory().createEntityManager();
	
	public void inserir(Produto produto){
		try{
			EntityTransaction t = em.getTransaction();
			try{
				t.begin();
				em.persist(produto);
				t.commit();
			}finally{
				if(t.isActive())
					t.rollback();
			}
		}finally{
			em.close();
		}
	}

	public void deleteProduto(Produto produto){
		try{
			EntityTransaction t = em.getTransaction();
			try{
				t.begin();
				em.remove(produto);
				t.commit();
			}finally{
				if(t.isActive())
					t.rollback();
			}
		}finally{
			em.close();
		}
	}
	
	public void updateProduto(Produto produto){
		try{
			EntityTransaction t = em.getTransaction();
			try{
				t.begin();
				em.merge(produto);
				t.commit();
			}finally{
				if(t.isActive())
					t.rollback();
			}
		}finally{
			em.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Produto> retornarTodosProdutos(){
		try{
			Query q = em.createQuery("from Produto", Produto.class);
			if (q.getResultList().size() > 0){
				return null;
			}
			return (ArrayList<Produto>) q.getResultList();
		}finally{
			em.close();
		}
	}
	
	
	public Produto retornarProduto(String nome){
		try{
			Query q = em.createQuery("from Produto as p where p.nome = :nome");
			q.setParameter("nome", nome);
			
			if (q.getResultList().size() > 0){
				return null;
			}
			return (Produto) q.getSingleResult();
		}finally{
			em.close();
		}
	}

}

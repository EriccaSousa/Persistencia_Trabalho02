package teste.persistencia.teste_11_neo4j.dao;

import java.util.List;

import teste.persistencia.teste_11_neo4j.model.Bean;

public interface GenericDAO<T extends Bean> {

	public void insert(T t);
	
	public void update(T t);
	
	public void delete(T t);
	
	public void delete(Object id);
	
	public T find(Object id);
	
	public List<T> findAll();
	
	public void close();
}

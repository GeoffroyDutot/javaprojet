package fr.imie.bank.model;

import java.util.List;

public interface Dao<T> {

	public List<T> findAll();

	public T findById(int id);

	public void save(T entity);

	public void saveAll(List<T> entities);

	public void deleteAll();
	
	public void deleteById(int id);

}

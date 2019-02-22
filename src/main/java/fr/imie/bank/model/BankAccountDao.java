package fr.imie.bank.model;

import java.util.List;

public interface BankAccountDao extends Dao<BankAccount> {

	public List<BankAccount> findByPersonId(int id);

}

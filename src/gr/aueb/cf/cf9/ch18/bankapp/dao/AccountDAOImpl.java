package gr.aueb.cf.cf9.ch18.bankapp.dao;

import gr.aueb.cf.cf9.ch18.bankapp.model.Account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO{
    private final List<Account> accounts = new ArrayList<>();


    @Override
    public Account saveOrUpdate(Account account) {
        int index = accounts.indexOf(account);  // override equals

        if (index == -1) {              // If it doesn't exist in the list
            accounts.add(account);      // then perform insert
            return account;
        }

        // If it already exists
        accounts.set(index, account);   // then perform update
        return accounts.get(index);
    }

    @Override
    public void remove(String iban) {
        accounts.removeIf(account -> account.getIban().equals(iban));
    }

    @Override
    public Optional<Account> findByIban(String iban) {
        return accounts.stream()
                .filter(account -> account.getIban().equals(iban))
                .findFirst();
    }

    @Override
    public List<Account> getAllAccounts() {
        // return new ArrayList<>(accounts);        // if the client want to change something in the list
        return Collections.unmodifiableList(accounts);
        // return List.copyOf(accounts);
    }

    @Override
    public long count() {
        return accounts.size();
    }

    @Override
    public boolean isAccountExists(String iban) {
        return accounts.stream()
                .anyMatch(account -> account.getIban().equals(iban));
    }
}

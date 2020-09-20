package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accountsUser = users.get(user);
            if (!accountsUser.contains(account)) {
                accountsUser.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account acc : accounts) {
                if (acc.getRequisite().equals(requisite)) {
                    return acc;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        Account accSrc = findByRequisite(srcPassport, srcRequisite);
        Account accDest = findByRequisite(destPassport, dеstRequisite);
        if (accSrc != null && accDest != null) {
            double balanceSrc = accSrc.getBalance();
            double balanceDest = accDest.getBalance();
            if (balanceSrc >= amount) {
                balanceSrc -= amount;
                accSrc.setBalance(balanceSrc);
                balanceDest += amount;
                accDest.setBalance(balanceDest);
                rsl = true;
            }
        }

        return rsl;
    }

}

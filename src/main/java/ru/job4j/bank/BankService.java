package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        var user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accountsUser = users.get(user.get());
            if (!accountsUser.contains(account)) {
                accountsUser.add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        Optional<User> rsl = Optional.empty();
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = Optional.of(user);
                break;
            }
        }
        return rsl;
//        return  users.keySet()
//                        .stream().filter(u -> u.getPassport().equals(passport))
//                        .findFirst()
//                        .orElse(null);

    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> rsl = Optional.empty();
        var user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
            for (Account acc : accounts) {
                if (acc.getRequisite().equals(requisite)) {
                    rsl = Optional.of(acc);
                }
            }
//            return accounts.stream()
//                    .filter(acc -> acc.getRequisite().equals(requisite))
//                    .findFirst()
//                    .orElse(null);
        }
        return rsl;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        var rsl = false;
        Optional<Account> accSrc = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> accDest = findByRequisite(destPassport, destRequisite);
        if (accSrc.isPresent() && accDest.isPresent()) {
            var balanceSrc = accSrc.get().getBalance();
            var balanceDest = accDest.get().getBalance();
            if (balanceSrc >= amount) {
                balanceSrc -= amount;
                accSrc.get().setBalance(balanceSrc);
                balanceDest += amount;
                accDest.get().setBalance(balanceDest);
                rsl = true;
            }
        }

        return rsl;
    }

}

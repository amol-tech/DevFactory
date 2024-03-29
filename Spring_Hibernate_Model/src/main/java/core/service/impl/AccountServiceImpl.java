package core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import core.dao.AccountDAO;
import core.model.Account;
import core.service.AccountService;

@Component
public class AccountServiceImpl implements AccountService
{
    @Autowired
    private AccountDAO accountDAO;

    @Transactional(readOnly = true)
    public List<Account> getAllAccounts()
    {
        return accountDAO.getAllAccounts();
    }
    
    @Transactional
    public void add(Account account)
    {
        accountDAO.add(account);
    }
    
    @Transactional
    public void remove(Account account)
    {
        accountDAO.remove(account);
    }
    
    @Transactional
    public Account getAccountByIdentifer(String id)
    {
        return accountDAO.getAccountByIdentifer(id);
    }

}

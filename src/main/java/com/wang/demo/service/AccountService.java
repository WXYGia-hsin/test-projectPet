package com.wang.demo.service;
import com.wang.demo.mapper.AccountMapper;
import com.wang.demo.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountMapper dao;
    public Account login(String username, String password){

        return dao.login(username,password);
    }

}

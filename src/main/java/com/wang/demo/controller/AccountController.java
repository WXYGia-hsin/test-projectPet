package com.wang.demo.controller;
import com.wang.demo.model.Account;
import com.wang.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping(value = "/login",method =RequestMethod.POST)
    public ResponseEntity<Account> login(@RequestBody Account account){
        Account account1=accountService.login(account.getUsername(),account.getPassword());
       if(account1!=null) {
           return new ResponseEntity<Account>(account1,HttpStatus.OK);
       }else{
           return new ResponseEntity<Account>(HttpStatus.CONFLICT);

       }

    }
}

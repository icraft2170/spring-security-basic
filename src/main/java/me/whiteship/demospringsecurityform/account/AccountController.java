package me.whiteship.demospringsecurityform.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }
    @GetMapping("/account/{role}/{username}/{password}")
    public Account createAccount(@PathVariable("username") String username,
                                 @PathVariable("role") String role,
                                 @PathVariable("password") String password) {
        return accountService.createNew(new Account(username,password,role));
    }

}

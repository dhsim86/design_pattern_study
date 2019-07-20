package com.dongho.df.web.user;

import com.dongho.df.application.user.UserApplicationService;
import com.dongho.df.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserApplicationService userApplicationService;

    @GetMapping
    public Flux<User> getUsers() {
        return userApplicationService.findAllUser();
    }

}

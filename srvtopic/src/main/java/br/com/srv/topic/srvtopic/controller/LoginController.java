package br.com.srv.topic.srvtopic.controller;

import br.com.srv.topic.srvtopic.domain.UserRequest;
import br.com.srv.topic.srvtopic.model.AuthUser;
import br.com.srv.topic.srvtopic.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {
    @PostMapping
    public ResponseBody login(UserRequest user ) {
        AuthUser authUser = new AuthUser();
        authUser.setToken("12345646da654");
        return (ResponseBody) authUser;
    }
}

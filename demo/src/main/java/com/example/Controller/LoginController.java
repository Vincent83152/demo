package com.example.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Service.LoginService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private LoginService loginS;

    /* 登入頁 */
    @GetMapping(value = "/index")
    public String index() {
        log.info(" 登入頁 .... ");
        return "login/index";
    }

    /* 登入頁 */
    @PostMapping(value = "/login",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE )
    public @ResponseBody String login(ModelMap map,@RequestBody Map<String,String> reqParam) {      
        log.info(" 登入 .... ");       
        loginS.findAll(); 
        loginS.findById();
        return "success";
    }
}

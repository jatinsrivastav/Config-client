package com.spring.config.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {


    @Value("${spring.application.name}")
    private  String appname;


    @Value("${db.host}")
    private  String dbhost;

    @Value("${db.port}")
    private int dbport;

    @Autowired
    private DbConfiguration dbConfiguration;



    @GetMapping("/greeting")
    public String greeting(){
        return appname + ":" +dbhost + ":" + dbport ;
    }

    @GetMapping("/beanProp")
    public String greeting1(){
        return appname + ":" +dbConfiguration.getHost() + ":" + dbConfiguration.getPort() ;
    }
}

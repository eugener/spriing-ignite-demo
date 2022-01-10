package com.gluonhq.springignitedemo;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {

    public String initialMessage() {
       return "Message from simple service";
    }

}

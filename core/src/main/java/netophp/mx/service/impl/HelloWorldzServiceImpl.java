package netophp.mx.service.impl;

import netophp.mx.service.HelloWorldzService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldzServiceImpl implements HelloWorldzService {

    @Override
    public String getHelloWorldz() {
        return "Saludos Netillo, esta es una prueba";
    }
}

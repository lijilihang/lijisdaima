package com.imooc.springvideo.config;

import com.imooc.springvideo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.*;

import static com.sun.xml.internal.ws.api.message.Packet.State.ServerResponse;

/**
 * @author liji
 */

@Configuration
public class RouterFunctionConfig {

    @Bean
    public RouterFunction<ServerResponse> personFindALl() {
       return RouterFunctions.route(RequestPredicates.GET("/userRequest"),
                request ->{
                    User user = new User();
                    //Flux是0-n个对象的集合
                    //Mono是0-1个对象集合
                    Mono<ServerResponse> response = null;
                    List<User> list = new ArrayList<User>();
                    user.setId(1);
                    user.setName("liji");
                    list.add(user);
                    Flux<User> userFlux = Flux.fromIterable(list);
                    return ServerResponse.ok().body(userFlux, User.class);
                });
    }
}
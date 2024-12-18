package com.kafka.kafkaDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class messagePublisher {

    @Autowired
    private KafkaTemplate<String,Object> temp;

    public void getMessage(String message) throws Exception{
       CompletableFuture<SendResult<String,Object>> future=temp.send("Namikaze",message);
       future.whenComplete((result,ex)->{
           if(ex==null){
               System.out.println("Your Message: " + message);
           }
           else{
               System.out.println("Unable to get your message");
           }
       });
    }
}

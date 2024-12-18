package com.example.ProdProj.Controller;

import com.example.ProdProj.EntityDto.UserRequestDto;
import com.example.ProdProj.Service.InsertService;
import com.example.ProdProj.Service.InsertServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @Autowired
    private InsertService insertService;

    @PostMapping("/userInfo")
    public ResponseEntity<?> createUser(@Validated @RequestBody UserRequestDto user){
        try {
            insertService.PostUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).body("Inserted Successfully");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Insertion Failed");

    }
}

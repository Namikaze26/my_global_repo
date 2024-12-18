package com.example.ProdProj.Service;

import com.example.ProdProj.EntityDto.UserRequestDto;
import org.springframework.stereotype.Service;

@Service
public interface InsertService {
     UserRequestDto PostUser(UserRequestDto user);
}

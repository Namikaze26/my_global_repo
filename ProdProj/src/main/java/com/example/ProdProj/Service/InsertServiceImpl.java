package com.example.ProdProj.Service;

import com.example.ProdProj.Entity.users;
import com.example.ProdProj.Entity.usersDepartment;
import com.example.ProdProj.Entity.usersDetails;
import com.example.ProdProj.EntityDto.UserRequestDto;
import com.example.ProdProj.Repository.usersDepartmentRepository;
import com.example.ProdProj.Repository.usersDetailsRepository;
import com.example.ProdProj.Repository.usersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertServiceImpl implements InsertService{
  @Autowired
    private usersRepository userRepository;
    @Autowired
    private usersDepartmentRepository userDepartmentRepository;
    @Autowired
    private usersDetailsRepository userDetailsRepository;

    public UserRequestDto PostUser(UserRequestDto userRequestDto){
        users user=new users();
        usersDepartment userDepartment=new usersDepartment();
        usersDetails userDetails=new usersDetails();
        user.setUserName(userRequestDto.getUserName());
        userDepartment.setUserDepartmentId(userRequestDto.getUserDepartment().getUserDepartmentId());
        userDepartment.setUserDepartmentName(userRequestDto.getUserDepartment().getUserDepartmentName());
        userDetails.setUserAadhar(userRequestDto.getUserDetails().getUserAadhar());
        userDetails.setUserAddress(userRequestDto.getUserDetails().getUserAddress());
        userRepository.save(user);
        userDepartmentRepository.save(userDepartment);
        userDetailsRepository.save(userDetails);
        return userRequestDto;
    }
}

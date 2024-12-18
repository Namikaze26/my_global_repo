package com.example.ProdProj.EntityDto;

import com.example.ProdProj.Entity.usersDepartment;
import com.example.ProdProj.Entity.usersDetails;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

import java.util.List;
@Data

public class UserRequestDto {

        private String userName;
        private usersDetails userDetails;
        private usersDepartment userDepartment;

        public UserRequestDto(String userName, usersDetails userDetails, usersDepartment userDepartment) {
                this.userName = userName;
                this.userDetails = userDetails;
                this.userDepartment = userDepartment;
        }

        public String getUserName() {
                return userName;
        }



        public usersDetails getUserDetails() {
                return userDetails;
        }



        public usersDepartment getUserDepartment() {
                return userDepartment;
        }



        @Override
        public String toString() {
                return "UserRequestDto{" +
                        "userName='" + userName + '\'' +
                        ", userDetails=" + userDetails +
                        ", userDepartment=" + userDepartment +
                        '}';
        }
}

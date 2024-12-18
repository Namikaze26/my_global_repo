package com.example.ProdProj.EntityDto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class usersDto {
 private long userID;

    @Size(min = 6,max = 15, message = "username should be of length 6-15 characters")
    @NotEmpty(message = "username should not be empty")
    private String userName;

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public @Size(min = 6, max = 15, message = "username should be of length 6-15 characters") @NotEmpty(message = "username should not be empty") String getUserName() {
        return userName;
    }

    public void setUserName(@Size(min = 6, max = 15, message = "username should be of length 6-15 characters") @NotEmpty(message = "username should not be empty") String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "usersDto{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                '}';
    }
}

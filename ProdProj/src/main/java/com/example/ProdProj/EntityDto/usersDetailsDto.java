package com.example.ProdProj.EntityDto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class usersDetailsDto {
    @NotNull(message = "Aadhar can not be null")
    private String userAadhar;

    public String getUserAadhar() {
        return userAadhar;
    }

    public void setUserAadhar(String userAadhar) {
        this.userAadhar = userAadhar;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    @NotNull(message = "User Address is mandatory")
    private String userAddress;
    @NotNull
    private Long userId;

    public @NotNull Long getUserId() {
        return userId;
    }

    public void setUserId(@NotNull Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "usersDetailsDto{" +
                "userAadhar='" + userAadhar + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userId='" + userId +
                '}';
    }
}

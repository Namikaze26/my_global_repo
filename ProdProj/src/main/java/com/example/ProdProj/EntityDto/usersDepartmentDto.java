package com.example.ProdProj.EntityDto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data

public class usersDepartmentDto {
    @NotNull(message = "User need to have some Department Id")
    private String userDepartmentId;
    private String userDepartmentName;
    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserDepartmentName() {
        return userDepartmentName;
    }

    public void setUserDepartmentName(String userDepartmentName) {
        this.userDepartmentName = userDepartmentName;
    }

    public String getUserDepartmentId() {
        return userDepartmentId;
    }

    public void setUserDepartmentId(String userDepartmentId) {
        this.userDepartmentId = userDepartmentId;
    }

    @Override
    public String toString() {
        return "usersDepartmentDto{" +
                "userDepartmentId=" + userDepartmentId +
                ", userDepartmentName='" + userDepartmentName + '\'' +
                ", userId=" + userId +
                '}';
    }
}

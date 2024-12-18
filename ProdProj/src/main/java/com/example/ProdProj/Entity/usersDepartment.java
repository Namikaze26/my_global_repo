package com.example.ProdProj.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;


@Data

@Entity(name="usersDepartment")

public class usersDepartment {
    @Id
    private String userDepartmentId;

    @Column(nullable = false)
    private String userDepartmentName;

    @CreationTimestamp
    @Column(name = "created_on", updatable = false)
    private LocalDateTime createdOn;

    @UpdateTimestamp
    @Column(name = "updated_on")
    private LocalDateTime updatedOn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private users user;

    public usersDepartment(String userDepartmentId, String userDepartmentName) {
        this.userDepartmentId = userDepartmentId;
        this.userDepartmentName = userDepartmentName;
    }
    public usersDepartment() {

    }


    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUserDepartmentId() {
        return userDepartmentId;
    }

    public void setUserDepartmentId(String userDepartmentId) {
        this.userDepartmentId = userDepartmentId;
    }

    public String getUserDepartmentName() {
        return userDepartmentName;
    }

    public void setUserDepartmentName(String userDepartmentName) {
        this.userDepartmentName = userDepartmentName;
    }

    @Override
    public String toString() {
        return "usersDepartment{" +
                "createdOn=" + createdOn +
                ", userDepartmentId='" + userDepartmentId + '\'' +
                ", userDepartmentName='" + userDepartmentName + '\'' +
                ", user=" + user +
                ", updatedOn=" + updatedOn +
                '}';
    }
}

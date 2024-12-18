package com.example.ProdProj.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="users")

public class users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(nullable = false)
    private String userName;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<usersDepartment> userDepartment;


    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private usersDetails userdetails;


    @CreationTimestamp
    @Column(name = "created_on", updatable = false)
    private LocalDateTime createdOn;

    @UpdateTimestamp
    @Column(name = "updated_on")
    private LocalDateTime updatedOn;

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

    public List<usersDepartment> getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(List<usersDepartment> userDepartment) {
        this.userDepartment = userDepartment;
    }

    public usersDetails getUserdetails() {
        return userdetails;
    }

    public void setUserdetails(usersDetails userdetails) {
        this.userdetails = userdetails;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "users{" +
                "createdOn=" + createdOn +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userDepartment=" + userDepartment +
                ", userdetails=" + userdetails +
                ", updatedOn=" + updatedOn +
                '}';
    }
}

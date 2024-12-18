package com.example.ProdProj.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="usersDetails")

public class usersDetails {
    @Id
    @Column(nullable = false,unique = true)
    private String userAadhar;

    @Column(nullable = false)
    private String userAddress;

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
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private users user;

    @Override
    public String toString() {
        return "usersDetails{" +
                "createdOn=" + createdOn +
                ", userAadhar='" + userAadhar + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", updatedOn=" + updatedOn +
                ", user=" + user +
                '}';
    }
}

package br.com.tbi.soundservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "user_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "country")
    private String country;

    @Column(name = "highlights")
    private String highlights;

    @Column(name = "bio")
    private String bio;

    @Column(name = "isProvider")
    private boolean isProvider;

    @Column(name = "imageUrl")
    private String imageUrl;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;
    
    public User() {
    }

    public User(Long id, String name,
                String email, String phoneNumber,
                String country, String highlights,
                String bio, boolean isProvider,
                String imageUrl,
                LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.country = country;
        this.highlights = highlights;
        this.bio = bio;
        this.isProvider = isProvider;
        this.imageUrl = imageUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getHighlights() {
        return highlights;
    }

    public String getBio() {
        return bio;
    }

    public boolean isProvider() {
        return isProvider;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}

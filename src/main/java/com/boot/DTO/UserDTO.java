package com.boot.DTO;

public class UserDTO
{
    String id;
    String socializeUsername;
    String email;
    String profilepicture;

    public UserDTO() {
    }

    public UserDTO(String id, String socializeUsername, String email, String profilepicture) {
        this.id = id;
        this.socializeUsername = socializeUsername;
        this.email = email;
        this.profilepicture = profilepicture;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSocializeUsername() {
        return socializeUsername;
    }

    public void setSocializeUsername(String socializeUsername) {
        this.socializeUsername = socializeUsername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilepicture() {
        return profilepicture;
    }

    public void setProfilepicture(String profilepicture) {
        this.profilepicture = profilepicture;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", socializeUsername='" + socializeUsername + '\'' +
                ", email='" + email + '\'' +
                ", profilepicture='" + profilepicture + '\'' +
                '}';
    }
}


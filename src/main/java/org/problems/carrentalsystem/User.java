package org.problems.carrentalsystem;

class User {
    private int userId;
    private String license;
    private String userName;

    public User(int userId, String license, String userName) {
        this.userId = userId;
        this.license = license;
        this.userName = userName;
    }

    // Getters and setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
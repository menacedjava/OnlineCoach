package model;

public class Admin extends User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private boolean active;

    public Admin(Integer id, String name, String email, String password, String phoneNumber, String role, Integer id1, String username, String password1, String email1, String phoneNumber1, boolean active) {
        super(id, name, email, password, phoneNumber, role);
        this.id = id1;
        this.username = username;
        this.password = password1;
        this.email = email1;
        this.phoneNumber = phoneNumber1;
        this.active = active;
    }


    public Admin() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", active=" + active +
                '}';
    }

}

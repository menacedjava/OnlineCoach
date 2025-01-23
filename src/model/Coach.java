package model;

public class Coach extends User {
    private String specialization;
    private Integer experienceYears;
    private Double rating;

    public Coach(Integer id, String name, String email, String password, String phoneNumber, String role, String specialization, Integer experienceYears, Double rating) {
        super(id, name, email, password, phoneNumber, role);
        this.specialization = specialization;
        this.experienceYears = experienceYears;
        this.rating = rating;
    }

}

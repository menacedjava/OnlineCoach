package service;

import model.Admin;
import repository.AdminOperations;

import java.util.ArrayList;
import java.util.List;

public class AdminService implements AdminOperations {
    private final List<Admin> adminDatabase = new ArrayList<>();
    @Override
    public String createAdmin(Admin admin) {
        if (admin.getUsername() == null || admin.getPassword() == null || admin.getEmail() == null) {
            return "All fields are required!";
        }
        adminDatabase.add(admin);
        return "Admin successfully created!";
    }


    @Override
    public Admin getAdminById(Integer id) {
        return adminDatabase.stream()
                .filter(admin -> admin.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Admin> getAllAdmins() {
        return adminDatabase;

    }

    @Override
    public String updateAdmin(Integer id, Admin updatedAdmin) {
        for (Admin admin : adminDatabase) {
            if (admin.getId().equals(id)) {
                admin.setUsername(updatedAdmin.getUsername());
                admin.setPassword(updatedAdmin.getPassword());
                admin.setEmail(updatedAdmin.getEmail());
                admin.setPhoneNumber(updatedAdmin.getPhoneNumber());
                admin.setActive(updatedAdmin.isActive());
                return "Admin successfully updated!";
            }
        }
        return "Admin not found!";
    }


    @Override
    public String deleteAdmin(Integer id) {
        return adminDatabase.removeIf(admin -> admin.getId().equals(id)) ?
                "Admin successfully deleted!" : "Admin not found!";
    }
}

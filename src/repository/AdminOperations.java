package repository;

import model.Admin;

import java.util.List;

public interface AdminOperations {
    String createAdmin(Admin admin);

    Admin getAdminById(Integer id);

    List<Admin> getAllAdmins();

    String updateAdmin(Integer id, Admin admin);

    String deleteAdmin(Integer id);
}

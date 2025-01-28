package controller;

import model.Admin;
import service.AdminService;
import utils.Result;

import java.util.List;

public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }
    public Result addAdmin(Admin admin) {
        String admin1 = adminService.createAdmin(admin);
        return new Result(true, admin1);
    }
    public List<Admin> getAllAdmins() {
        return adminService.getAllAdmins();
    }
    public Admin getAdminById(Integer id) {
        return adminService.getAdminById(id);
    }
    public Result updateAdmin(Integer id, Admin updatedAdmin) {
        String s = adminService.updateAdmin(id, updatedAdmin);
        return new Result(true, s);
    }
    public Result deleteAdmin(Integer id) {
        String s = adminService.deleteAdmin(id);
        return new Result(true, s);
    }
    public void login(String username, String password) {
        String result = adminService.login(username, password);
        System.out.println(result);
    }


}

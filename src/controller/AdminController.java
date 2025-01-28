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



}

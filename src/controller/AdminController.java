package controller;

import model.Admin;
import service.AdminService;
import utils.Result;

public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }
    public Result addAdmin(Admin admin) {
        String admin1 = adminService.createAdmin(admin);
        return new Result(true, admin1);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Timestamp;

/**
 *
 * @author Lenovo
 */
public class Users {
    private int id;
    private String username;
    private String password;
    private String fullname;
    private String dob;
    private String email;
    private String phone;
    private String otp;
    private Timestamp otpExpiry;
    private int is_active;
    private String permission;
    private String created_at;
    private String update_at;
    private String create_by;
    private String delete_at;
    private String delete_by;
    private int is_delete;

    public Users() {
    }

    public Users(int id, String username, String password, String fullname, String dob, String email, String phone, int is_active, String permission, String created_at, String update_at, String create_by, String delete_at, String delete_by, int is_delete) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.is_active = is_active;
        this.permission = permission;
        this.created_at = created_at;
        this.update_at = update_at;
        this.create_by = create_by;
        this.delete_at = delete_at;
        this.delete_by = delete_by;
        this.is_delete = is_delete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getIs_active() {
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(String update_at) {
        this.update_at = update_at;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getDelete_at() {
        return delete_at;
    }

    public void setDelete_at(String delete_at) {
        this.delete_at = delete_at;
    }

    public String getDelete_by() {
        return delete_by;
    }

    public void setDelete_by(String delete_by) {
        this.delete_by = delete_by;
    }

    public int getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(int is_delete) {
        this.is_delete = is_delete;
    }

    public Users(String otp, Timestamp otpExpiry) {
        this.otp = otp;
        this.otpExpiry = otpExpiry;
    }
    
    

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", username=" + username + ", password=" + password + ", fullname=" + fullname + ", dob=" + dob + ", email=" + email + ", phone=" + phone + ", is_active=" + is_active + ", permission=" + permission + ", created_at=" + created_at + ", update_at=" + update_at + ", create_by=" + create_by + ", delete_at=" + delete_at + ", delete_by=" + delete_by + ", is_delete=" + is_delete + '}';
    }
    
    
}



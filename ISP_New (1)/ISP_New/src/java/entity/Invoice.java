/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Lenovo
 */
public class Invoice {
    private int id;
    private int userid;
    private String borrowerName;
    private String borrowerPhone;
    private String borrowerEmail;
    private String borrowerAddress;
    private Double amountMoney;
    private String status;
    private String time;
    private String created_at;
    private String update_at;
    private String create_by;
    private String delete_at;
    private String delete_by;
    private int is_delete;

    public Invoice() {
    }

    public Invoice(int id, int userid, String borrowerName, String borrowerPhone, String borrowerEmail, String borrowerAddress, Double amountMoney, String status, String time, String created_at, String update_at, String create_by, String delete_at, String delete_by, int is_delete) {
        this.id = id;
        this.userid = userid;
        this.borrowerName = borrowerName;
        this.borrowerPhone = borrowerPhone;
        this.borrowerEmail = borrowerEmail;
        this.borrowerAddress = borrowerAddress;
        this.amountMoney = amountMoney;
        this.status = status;
        this.time = time;
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

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public String getBorrowerPhone() {
        return borrowerPhone;
    }

    public void setBorrowerPhone(String borrowerPhone) {
        this.borrowerPhone = borrowerPhone;
    }

    public String getBorrowerEmail() {
        return borrowerEmail;
    }

    public void setBorrowerEmail(String borrowerEmail) {
        this.borrowerEmail = borrowerEmail;
    }

    public String getBorrowerAddress() {
        return borrowerAddress;
    }

    public void setBorrowerAddress(String borrowerAddress) {
        this.borrowerAddress = borrowerAddress;
    }

    public Double getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(Double amountMoney) {
        this.amountMoney = amountMoney;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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

    @Override
    public String toString() {
        return "Invoice{" + "id=" + id + ", userid=" + userid + ", borrowerName=" + borrowerName + ", borrowerPhone=" + borrowerPhone + ", borrowerEmail=" + borrowerEmail + ", borrowerAddress=" + borrowerAddress + ", amountMoney=" + amountMoney + ", status=" + status + ", time=" + time + ", created_at=" + created_at + ", update_at=" + update_at + ", create_by=" + create_by + ", delete_at=" + delete_at + ", delete_by=" + delete_by + ", is_delete=" + is_delete + '}';
    }
    
    
}

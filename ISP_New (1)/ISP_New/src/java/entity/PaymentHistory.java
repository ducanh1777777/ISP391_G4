/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Lenovo
 */
public class PaymentHistory {
    private int id;
    private int invoice_id;
    private Double amountMoney;
    private String debt;
    private String status;
    private String created_at;
    private String update_at;
    private String create_by;
    private String delete_at;
    private String delete_by;
    private int is_delete;

    public PaymentHistory() {
    }

    public PaymentHistory(int id, int invoice_id, Double amountMoney, String debt, String status, String created_at, String update_at, String create_by, String delete_at, String delete_by, int is_delete) {
        this.id = id;
        this.invoice_id = invoice_id;
        this.amountMoney = amountMoney;
        this.debt = debt;
        this.status = status;
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

    public int getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(int invoice_id) {
        this.invoice_id = invoice_id;
    }

    public Double getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(Double amountMoney) {
        this.amountMoney = amountMoney;
    }

    public String getDebt() {
        return debt;
    }

    public void setDebt(String debt) {
        this.debt = debt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        return "PaymentHistory{" + "id=" + id + ", invoice_id=" + invoice_id + ", amountMoney=" + amountMoney + ", debt=" + debt + ", status=" + status + ", created_at=" + created_at + ", update_at=" + update_at + ", create_by=" + create_by + ", delete_at=" + delete_at + ", delete_by=" + delete_by + ", is_delete=" + is_delete + '}';
    }
    
    
}

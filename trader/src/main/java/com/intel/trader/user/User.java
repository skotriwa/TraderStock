package com.intel.trader.user;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User {
    @Id
    private String user_Name;
    private String full_Name;
    private String email;
    private String user_Type;

    public float getCashInAccount() {
        return cashInAccount;
    }

    public void setCashInAccount(float cashInAccount) {
        this.cashInAccount = cashInAccount;
    }

    public float cashInAccount;
    public String getUser_Type() {
        return user_Type;
    }

    public String getFull_Name() {
        return full_Name;
    }
    public String getUser_Name() {
        return user_Name;
    }
    public String getEmail() {
        return email;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFull_Name(String full_Name) {
        this.full_Name = full_Name;
    }
    public void setUser_Type(String user_Type) {
        this.user_Type = user_Type;
    }
}



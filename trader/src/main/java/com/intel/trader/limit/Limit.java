package com.intel.trader.limit;
import javax.persistence.*;
import java.util.Date;
@Entity(name="Stock_Limit")
public class Limit {
    public int getLimit_Id() {
        return limit_Id;
    }

    public void setLimit_Id(int limit_Id) {
        this.limit_Id = limit_Id;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int limit_Id;
    private String user_name;
    private String tic_name;
    private float price;
    private Date start_Date;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getTic_name() {
        return tic_name;
    }

    public void setTic_name(String tic_name) {
        this.tic_name = tic_name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getStart_Date() {
        return start_Date;
    }

    public void setStart_Date(Date start_Date) {
        this.start_Date = start_Date;
    }

    public Date getEnd_Date() {
        return end_Date;
    }

    public void setEnd_Date(Date end_Date) {
        this.end_Date = end_Date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private Date end_Date;
    private String type;
}

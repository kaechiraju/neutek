package demo.model;

import java.util.Date;

public class User {
    private String last_name;
    private String first_name;
    private String address;
    private Date DOB;
    private Integer phone_no;

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public Integer getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(Integer phone_no) {
        this.phone_no = phone_no;
    }


}

package com.home.hjd.model;

import lombok.Data;

import java.io.Serializable;

/**
 * (Book)实体类
 *
 * @author makejava
 * @since 2020-04-27 20:56:11
 */
@Data
public class Book implements Serializable {
    private static final long serialVersionUID = 196565379486935569L;
    
    private Integer bid;
    
    private String bnumber;
    
    private String bname;
    
    private String bprice;
    
    private String bdetail;
    
    private Integer inventcy;
    
    private String redundancy;


    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBnumber() {
        return bnumber;
    }

    public void setBnumber(String bnumber) {
        this.bnumber = bnumber;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBprice() {
        return bprice;
    }

    public void setBprice(String bprice) {
        this.bprice = bprice;
    }

    public String getBdetail() {
        return bdetail;
    }

    public void setBdetail(String bdetail) {
        this.bdetail = bdetail;
    }

    public Integer getInventcy() {
        return inventcy;
    }

    public void setInventcy(Integer inventcy) {
        this.inventcy = inventcy;
    }

    public String getRedundancy() {
        return redundancy;
    }

    public void setRedundancy(String redundancy) {
        this.redundancy = redundancy;
    }

}
package com.tunan.doris.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_profile")
public class UserProfile implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userid;
    private String username;
    private String phone;
    private String registertime;
    private String location;
    private String registerexamname;
    private String province;
    private String city;
    private String originsource;
    private String platform;
    private String registerchannel;
    private String focusexamname;
    private String urltype;
    private String originurl;
    private String registertype;
    private String columntype;
    private String lastlogintime;
    private String lastordertime;
    private String lastpaytime;
    private String ispay;
    private int paynum;
    private double realpay;
    private String iscoursepay;
    private int coursepaynum;
    private double courserealpay;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRegistertime() {
        return registertime;
    }

    public void setRegistertime(String registertime) {
        this.registertime = registertime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRegisterexamname() {
        return registerexamname;
    }

    public void setRegisterexamname(String registerexamname) {
        this.registerexamname = registerexamname;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOriginsource() {
        return originsource;
    }

    public void setOriginsource(String originsource) {
        this.originsource = originsource;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getRegisterchannel() {
        return registerchannel;
    }

    public void setRegisterchannel(String registerchannel) {
        this.registerchannel = registerchannel;
    }

    public String getFocusexamname() {
        return focusexamname;
    }

    public void setFocusexamname(String focusexamname) {
        this.focusexamname = focusexamname;
    }

    public String getUrltype() {
        return urltype;
    }

    public void setUrltype(String urltype) {
        this.urltype = urltype;
    }

    public String getOriginurl() {
        return originurl;
    }

    public void setOriginurl(String originurl) {
        this.originurl = originurl;
    }

    public String getRegistertype() {
        return registertype;
    }

    public void setRegistertype(String registertype) {
        this.registertype = registertype;
    }

    public String getColumntype() {
        return columntype;
    }

    public void setColumntype(String columntype) {
        this.columntype = columntype;
    }

    public String getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(String lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getLastordertime() {
        return lastordertime;
    }

    public void setLastordertime(String lastordertime) {
        this.lastordertime = lastordertime;
    }

    public String getLastpaytime() {
        return lastpaytime;
    }

    public void setLastpaytime(String lastpaytime) {
        this.lastpaytime = lastpaytime;
    }

    public String getIspay() {
        return ispay;
    }

    public void setIspay(String ispay) {
        this.ispay = ispay;
    }

    public int getPaynum() {
        return paynum;
    }

    public void setPaynum(int paynum) {
        this.paynum = paynum;
    }

    public double getRealpay() {
        return realpay;
    }

    public void setRealpay(double realpay) {
        this.realpay = realpay;
    }

    public String getIscoursepay() {
        return iscoursepay;
    }

    public void setIscoursepay(String iscoursepay) {
        this.iscoursepay = iscoursepay;
    }

    public int getCoursepaynum() {
        return coursepaynum;
    }

    public void setCoursepaynum(int coursepaynum) {
        this.coursepaynum = coursepaynum;
    }

    public double getCourserealpay() {
        return courserealpay;
    }

    public void setCourserealpay(double courserealpay) {
        this.courserealpay = courserealpay;
    }

    public UserProfile() {
    }

    public UserProfile(String userid, String username, String phone, String registertime, String location, String registerexamname, String province, String city, String originsource, String platform, String registerchannel, String focusexamname, String urltype, String originurl, String registertype, String columntype, String lastlogintime, String lastordertime, String lastpaytime, String ispay, int paynum, double realpay, String iscoursepay, int coursepaynum, double courserealpay) {
        this.userid = userid;
        this.username = username;
        this.phone = phone;
        this.registertime = registertime;
        this.location = location;
        this.registerexamname = registerexamname;
        this.province = province;
        this.city = city;
        this.originsource = originsource;
        this.platform = platform;
        this.registerchannel = registerchannel;
        this.focusexamname = focusexamname;
        this.urltype = urltype;
        this.originurl = originurl;
        this.registertype = registertype;
        this.columntype = columntype;
        this.lastlogintime = lastlogintime;
        this.lastordertime = lastordertime;
        this.lastpaytime = lastpaytime;
        this.ispay = ispay;
        this.paynum = paynum;
        this.realpay = realpay;
        this.iscoursepay = iscoursepay;
        this.coursepaynum = coursepaynum;
        this.courserealpay = courserealpay;
    }
}

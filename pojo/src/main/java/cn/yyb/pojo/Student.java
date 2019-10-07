package cn.yyb.pojo;

import java.util.Date;

public class Student {
    private String sid;

    private String name;

    private Integer gender;

    private Date birthday;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("sid='").append(sid).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append('}');
        return sb.toString();
    }
}
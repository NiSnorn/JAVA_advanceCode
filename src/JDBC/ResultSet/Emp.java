package JDBC.ResultSet;

import java.util.Date;

public class Emp{
    private int id;
    private String ename;
    private int jobId;
    private Date joinDate;
    private double sal;
    private  double bon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getBon() {
        return bon;
    }

    public void setBon(double bon) {
        this.bon = bon;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", jobId=" + jobId +
                ", joinDate=" + joinDate +
                ", sal=" + sal +
                ", bon=" + bon +
                '}';
    }

}

package me.hifancy.domain.pojo;

/**
 * @author facny
 * @Description:
 * @Modify by:
 * @since Create in 0:17 2018/7/5
 */
public class Guy {
    private String gName;
    private String deptNo;
    private String email;
    private long tel;

    @Override
    public String toString() {
        return "Guy{" +
                "gName='" + gName + '\'' +
                ", deptNo='" + deptNo + '\'' +
                ", email='" + email + '\'' +
                ", tel=" + tel +
                '}';
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }
}

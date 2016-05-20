package com.boco.eoms.commons.system.user.module;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TawSystemUser implements Serializable {
    private String id;;

    private String cptroomid;

    private String cptroomname;

    private String deptid;

    private String deptname;

    private String email;

    private String familyaddress;

    private String fax;

    private String mobile;

    private String operuserid;

    private String phone;

    private String remark;

    private String sex;

    private String userdegree;

    private String userid;

    private String username;

    private String operremotip;

    private Date savetime;

    private String updatetime;

    private String accountEnabled;

    private String accountExpired;

    private String accountLocked;

    private String credentialsExpired;

    private String password;

    private String postalCode;

    private String deleted;

    private String isfullemploy;

    private String isrest;

    private String userstatus;

    private String portalrolename;

    private BigDecimal flag;

    private BigDecimal failCount;

    private String ispartners;

    private String centername;

    private String centerid;

    private String postuser;

    private String posttype;

    private String parentleader;

    private String stafftype;

    private String parentleadername;

    private String position;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCptroomid() {
        return cptroomid;
    }

    public void setCptroomid(String cptroomid) {
        this.cptroomid = cptroomid;
    }

    public String getCptroomname() {
        return cptroomname;
    }

    public void setCptroomname(String cptroomname) {
        this.cptroomname = cptroomname;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFamilyaddress() {
        return familyaddress;
    }

    public void setFamilyaddress(String familyaddress) {
        this.familyaddress = familyaddress;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOperuserid() {
        return operuserid;
    }

    public void setOperuserid(String operuserid) {
        this.operuserid = operuserid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserdegree() {
        return userdegree;
    }

    public void setUserdegree(String userdegree) {
        this.userdegree = userdegree;
    }

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

    public String getOperremotip() {
        return operremotip;
    }

    public void setOperremotip(String operremotip) {
        this.operremotip = operremotip;
    }

    public Date getSavetime() {
        return savetime;
    }

    public void setSavetime(Date savetime) {
        this.savetime = savetime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getAccountEnabled() {
        return accountEnabled;
    }

    public void setAccountEnabled(String accountEnabled) {
        this.accountEnabled = accountEnabled;
    }

    public String getAccountExpired() {
        return accountExpired;
    }

    public void setAccountExpired(String accountExpired) {
        this.accountExpired = accountExpired;
    }

    public String getAccountLocked() {
        return accountLocked;
    }

    public void setAccountLocked(String accountLocked) {
        this.accountLocked = accountLocked;
    }

    public String getCredentialsExpired() {
        return credentialsExpired;
    }

    public void setCredentialsExpired(String credentialsExpired) {
        this.credentialsExpired = credentialsExpired;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getIsfullemploy() {
        return isfullemploy;
    }

    public void setIsfullemploy(String isfullemploy) {
        this.isfullemploy = isfullemploy;
    }

    public String getIsrest() {
        return isrest;
    }

    public void setIsrest(String isrest) {
        this.isrest = isrest;
    }

    public String getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(String userstatus) {
        this.userstatus = userstatus;
    }

    public String getPortalrolename() {
        return portalrolename;
    }

    public void setPortalrolename(String portalrolename) {
        this.portalrolename = portalrolename;
    }

    public BigDecimal getFlag() {
        return flag;
    }

    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }

    public BigDecimal getFailCount() {
        return failCount;
    }

    public void setFailCount(BigDecimal failCount) {
        this.failCount = failCount;
    }

    public String getIspartners() {
        return ispartners;
    }

    public void setIspartners(String ispartners) {
        this.ispartners = ispartners;
    }

    public String getCentername() {
        return centername;
    }

    public void setCentername(String centername) {
        this.centername = centername;
    }

    public String getCenterid() {
        return centerid;
    }

    public void setCenterid(String centerid) {
        this.centerid = centerid;
    }

    public String getPostuser() {
        return postuser;
    }

    public void setPostuser(String postuser) {
        this.postuser = postuser;
    }

    public String getPosttype() {
        return posttype;
    }

    public void setPosttype(String posttype) {
        this.posttype = posttype;
    }

    public String getParentleader() {
        return parentleader;
    }

    public void setParentleader(String parentleader) {
        this.parentleader = parentleader;
    }

    public String getStafftype() {
        return stafftype;
    }

    public void setStafftype(String stafftype) {
        this.stafftype = stafftype;
    }

    public String getParentleadername() {
        return parentleadername;
    }

    public void setParentleadername(String parentleadername) {
        this.parentleadername = parentleadername;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    private TawSystemUser(Builder b) {
        id = b.id;
        cptroomid = b.cptroomid;
        cptroomname = b.cptroomname;
        deptid = b.deptid;
        deptname = b.deptname;
        email = b.email;
        familyaddress = b.familyaddress;
        fax = b.fax;
        mobile = b.mobile;
        operuserid = b.operuserid;
        phone = b.phone;
        remark = b.remark;
        sex = b.sex;
        userdegree = b.userdegree;
        userid = b.userid;
        username = b.username;
        operremotip = b.operremotip;
        savetime = b.savetime;
        updatetime = b.updatetime;
        accountEnabled = b.accountEnabled;
        accountExpired = b.accountExpired;
        accountLocked = b.accountLocked;
        credentialsExpired = b.credentialsExpired;
        password = b.password;
        postalCode = b.postalCode;
        deleted = b.deleted;
        isfullemploy = b.isfullemploy;
        isrest = b.isrest;
        userstatus = b.userstatus;
        portalrolename = b.portalrolename;
        flag = b.flag;
        failCount = b.failCount;
        ispartners = b.ispartners;
        centername = b.centername;
        centerid = b.centerid;
        postuser = b.postuser;
        posttype = b.posttype;
        parentleader = b.parentleader;
        stafftype = b.stafftype;
        parentleadername = b.parentleadername;
        position = b.position;
    }

    public TawSystemUser() {
        super();
    }

    public static class Builder {
        private String id;

        private String cptroomid;

        private String cptroomname;

        private String deptid;

        private String deptname;

        private String email;

        private String familyaddress;

        private String fax;

        private String mobile;

        private String operuserid;

        private String phone;

        private String remark;

        private String sex;

        private String userdegree;

        private String userid;

        private String username;

        private String operremotip;

        private Date savetime;

        private String updatetime;

        private String accountEnabled;

        private String accountExpired;

        private String accountLocked;

        private String credentialsExpired;

        private String password;

        private String postalCode;

        private String deleted;

        private String isfullemploy;

        private String isrest;

        private String userstatus;

        private String portalrolename;

        private BigDecimal flag;

        private BigDecimal failCount;

        private String ispartners;

        private String centername;

        private String centerid;

        private String postuser;

        private String posttype;

        private String parentleader;

        private String stafftype;

        private String parentleadername;

        private String position;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder cptroomid(String cptroomid) {
            this.cptroomid = cptroomid;
            return this;
        }

        public Builder cptroomname(String cptroomname) {
            this.cptroomname = cptroomname;
            return this;
        }

        public Builder deptid(String deptid) {
            this.deptid = deptid;
            return this;
        }

        public Builder deptname(String deptname) {
            this.deptname = deptname;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder familyaddress(String familyaddress) {
            this.familyaddress = familyaddress;
            return this;
        }

        public Builder fax(String fax) {
            this.fax = fax;
            return this;
        }

        public Builder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Builder operuserid(String operuserid) {
            this.operuserid = operuserid;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder userdegree(String userdegree) {
            this.userdegree = userdegree;
            return this;
        }

        public Builder userid(String userid) {
            this.userid = userid;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder operremotip(String operremotip) {
            this.operremotip = operremotip;
            return this;
        }

        public Builder savetime(Date savetime) {
            this.savetime = savetime;
            return this;
        }

        public Builder updatetime(String updatetime) {
            this.updatetime = updatetime;
            return this;
        }

        public Builder accountEnabled(String accountEnabled) {
            this.accountEnabled = accountEnabled;
            return this;
        }

        public Builder accountExpired(String accountExpired) {
            this.accountExpired = accountExpired;
            return this;
        }

        public Builder accountLocked(String accountLocked) {
            this.accountLocked = accountLocked;
            return this;
        }

        public Builder credentialsExpired(String credentialsExpired) {
            this.credentialsExpired = credentialsExpired;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder deleted(String deleted) {
            this.deleted = deleted;
            return this;
        }

        public Builder isfullemploy(String isfullemploy) {
            this.isfullemploy = isfullemploy;
            return this;
        }

        public Builder isrest(String isrest) {
            this.isrest = isrest;
            return this;
        }

        public Builder userstatus(String userstatus) {
            this.userstatus = userstatus;
            return this;
        }

        public Builder portalrolename(String portalrolename) {
            this.portalrolename = portalrolename;
            return this;
        }

        public Builder flag(BigDecimal flag) {
            this.flag = flag;
            return this;
        }

        public Builder failCount(BigDecimal failCount) {
            this.failCount = failCount;
            return this;
        }

        public Builder ispartners(String ispartners) {
            this.ispartners = ispartners;
            return this;
        }

        public Builder centername(String centername) {
            this.centername = centername;
            return this;
        }

        public Builder centerid(String centerid) {
            this.centerid = centerid;
            return this;
        }

        public Builder postuser(String postuser) {
            this.postuser = postuser;
            return this;
        }

        public Builder posttype(String posttype) {
            this.posttype = posttype;
            return this;
        }

        public Builder parentleader(String parentleader) {
            this.parentleader = parentleader;
            return this;
        }

        public Builder stafftype(String stafftype) {
            this.stafftype = stafftype;
            return this;
        }

        public Builder parentleadername(String parentleadername) {
            this.parentleadername = parentleadername;
            return this;
        }

        public Builder position(String position) {
            this.position = position;
            return this;
        }

        public TawSystemUser build() {
            return new TawSystemUser(this);
        }
    }
}
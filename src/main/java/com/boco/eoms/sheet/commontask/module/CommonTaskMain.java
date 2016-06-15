package com.boco.eoms.sheet.commontask.module;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CommonTaskMain implements Serializable {
    private String id;

    private String sheetid;

    private String title;

    private Date sheetacceptlimit;

    private Date sheetcompletelimit;

    private Date sendtime;

    private String sendorgtype;

    private String senduserid;

    private String sendcontact;

    private String sheetaccessories;

    private Date endtime;

    private String endresult;

    private BigDecimal status;

    private BigDecimal holdstatisfied;

    private String enduserid;

    private BigDecimal deleted;

    private String piid;

    private String sheettemplatename;

    private String parentsheetname;

    private String parentsheetid;

    private String parentphasename;

    private String correlationkey;

    private String parentcorrelation;

    private String todeptid;

    private String senddeptid;

    private String sendroleid;

    private String endroleid;

    private String enddeptid;

    private String templateflag;

    private String cancelreason;

    private String mainnetsort1;

    private String mainnetsort2;

    private String mainnetsort3;

    private String maintasktype;

    private String maintaskdescription;

    private String mainremark;

    private BigDecimal sendyear;

    private BigDecimal sendmonth;

    private BigDecimal sendday;

    private String invokemode;

    private String ifcomplaint;

    private String complaintid;

    private String maintasktype2;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSheetid() {
        return sheetid;
    }

    public void setSheetid(String sheetid) {
        this.sheetid = sheetid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getSheetacceptlimit() {
        return sheetacceptlimit;
    }

    public void setSheetacceptlimit(Date sheetacceptlimit) {
        this.sheetacceptlimit = sheetacceptlimit;
    }

    public Date getSheetcompletelimit() {
        return sheetcompletelimit;
    }

    public void setSheetcompletelimit(Date sheetcompletelimit) {
        this.sheetcompletelimit = sheetcompletelimit;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getSendorgtype() {
        return sendorgtype;
    }

    public void setSendorgtype(String sendorgtype) {
        this.sendorgtype = sendorgtype;
    }

    public String getSenduserid() {
        return senduserid;
    }

    public void setSenduserid(String senduserid) {
        this.senduserid = senduserid;
    }

    public String getSendcontact() {
        return sendcontact;
    }

    public void setSendcontact(String sendcontact) {
        this.sendcontact = sendcontact;
    }

    public String getSheetaccessories() {
        return sheetaccessories;
    }

    public void setSheetaccessories(String sheetaccessories) {
        this.sheetaccessories = sheetaccessories;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getEndresult() {
        return endresult;
    }

    public void setEndresult(String endresult) {
        this.endresult = endresult;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public BigDecimal getHoldstatisfied() {
        return holdstatisfied;
    }

    public void setHoldstatisfied(BigDecimal holdstatisfied) {
        this.holdstatisfied = holdstatisfied;
    }

    public String getEnduserid() {
        return enduserid;
    }

    public void setEnduserid(String enduserid) {
        this.enduserid = enduserid;
    }

    public BigDecimal getDeleted() {
        return deleted;
    }

    public void setDeleted(BigDecimal deleted) {
        this.deleted = deleted;
    }

    public String getPiid() {
        return piid;
    }

    public void setPiid(String piid) {
        this.piid = piid;
    }

    public String getSheettemplatename() {
        return sheettemplatename;
    }

    public void setSheettemplatename(String sheettemplatename) {
        this.sheettemplatename = sheettemplatename;
    }

    public String getParentsheetname() {
        return parentsheetname;
    }

    public void setParentsheetname(String parentsheetname) {
        this.parentsheetname = parentsheetname;
    }

    public String getParentsheetid() {
        return parentsheetid;
    }

    public void setParentsheetid(String parentsheetid) {
        this.parentsheetid = parentsheetid;
    }

    public String getParentphasename() {
        return parentphasename;
    }

    public void setParentphasename(String parentphasename) {
        this.parentphasename = parentphasename;
    }

    public String getCorrelationkey() {
        return correlationkey;
    }

    public void setCorrelationkey(String correlationkey) {
        this.correlationkey = correlationkey;
    }

    public String getParentcorrelation() {
        return parentcorrelation;
    }

    public void setParentcorrelation(String parentcorrelation) {
        this.parentcorrelation = parentcorrelation;
    }

    public String getTodeptid() {
        return todeptid;
    }

    public void setTodeptid(String todeptid) {
        this.todeptid = todeptid;
    }

    public String getSenddeptid() {
        return senddeptid;
    }

    public void setSenddeptid(String senddeptid) {
        this.senddeptid = senddeptid;
    }

    public String getSendroleid() {
        return sendroleid;
    }

    public void setSendroleid(String sendroleid) {
        this.sendroleid = sendroleid;
    }

    public String getEndroleid() {
        return endroleid;
    }

    public void setEndroleid(String endroleid) {
        this.endroleid = endroleid;
    }

    public String getEnddeptid() {
        return enddeptid;
    }

    public void setEnddeptid(String enddeptid) {
        this.enddeptid = enddeptid;
    }

    public String getTemplateflag() {
        return templateflag;
    }

    public void setTemplateflag(String templateflag) {
        this.templateflag = templateflag;
    }

    public String getCancelreason() {
        return cancelreason;
    }

    public void setCancelreason(String cancelreason) {
        this.cancelreason = cancelreason;
    }

    public String getMainnetsort1() {
        return mainnetsort1;
    }

    public void setMainnetsort1(String mainnetsort1) {
        this.mainnetsort1 = mainnetsort1;
    }

    public String getMainnetsort2() {
        return mainnetsort2;
    }

    public void setMainnetsort2(String mainnetsort2) {
        this.mainnetsort2 = mainnetsort2;
    }

    public String getMainnetsort3() {
        return mainnetsort3;
    }

    public void setMainnetsort3(String mainnetsort3) {
        this.mainnetsort3 = mainnetsort3;
    }

    public String getMaintasktype() {
        return maintasktype;
    }

    public void setMaintasktype(String maintasktype) {
        this.maintasktype = maintasktype;
    }

    public String getMaintaskdescription() {
        return maintaskdescription;
    }

    public void setMaintaskdescription(String maintaskdescription) {
        this.maintaskdescription = maintaskdescription;
    }

    public String getMainremark() {
        return mainremark;
    }

    public void setMainremark(String mainremark) {
        this.mainremark = mainremark;
    }

    public BigDecimal getSendyear() {
        return sendyear;
    }

    public void setSendyear(BigDecimal sendyear) {
        this.sendyear = sendyear;
    }

    public BigDecimal getSendmonth() {
        return sendmonth;
    }

    public void setSendmonth(BigDecimal sendmonth) {
        this.sendmonth = sendmonth;
    }

    public BigDecimal getSendday() {
        return sendday;
    }

    public void setSendday(BigDecimal sendday) {
        this.sendday = sendday;
    }

    public String getInvokemode() {
        return invokemode;
    }

    public void setInvokemode(String invokemode) {
        this.invokemode = invokemode;
    }

    public String getIfcomplaint() {
        return ifcomplaint;
    }

    public void setIfcomplaint(String ifcomplaint) {
        this.ifcomplaint = ifcomplaint;
    }

    public String getComplaintid() {
        return complaintid;
    }

    public void setComplaintid(String complaintid) {
        this.complaintid = complaintid;
    }

    public String getMaintasktype2() {
        return maintasktype2;
    }

    public void setMaintasktype2(String maintasktype2) {
        this.maintasktype2 = maintasktype2;
    }

    private CommonTaskMain(Builder b) {
        id = b.id;
        sheetid = b.sheetid;
        title = b.title;
        sheetacceptlimit = b.sheetacceptlimit;
        sheetcompletelimit = b.sheetcompletelimit;
        sendtime = b.sendtime;
        sendorgtype = b.sendorgtype;
        senduserid = b.senduserid;
        sendcontact = b.sendcontact;
        sheetaccessories = b.sheetaccessories;
        endtime = b.endtime;
        endresult = b.endresult;
        status = b.status;
        holdstatisfied = b.holdstatisfied;
        enduserid = b.enduserid;
        deleted = b.deleted;
        piid = b.piid;
        sheettemplatename = b.sheettemplatename;
        parentsheetname = b.parentsheetname;
        parentsheetid = b.parentsheetid;
        parentphasename = b.parentphasename;
        correlationkey = b.correlationkey;
        parentcorrelation = b.parentcorrelation;
        todeptid = b.todeptid;
        senddeptid = b.senddeptid;
        sendroleid = b.sendroleid;
        endroleid = b.endroleid;
        enddeptid = b.enddeptid;
        templateflag = b.templateflag;
        cancelreason = b.cancelreason;
        mainnetsort1 = b.mainnetsort1;
        mainnetsort2 = b.mainnetsort2;
        mainnetsort3 = b.mainnetsort3;
        maintasktype = b.maintasktype;
        maintaskdescription = b.maintaskdescription;
        mainremark = b.mainremark;
        sendyear = b.sendyear;
        sendmonth = b.sendmonth;
        sendday = b.sendday;
        invokemode = b.invokemode;
        ifcomplaint = b.ifcomplaint;
        complaintid = b.complaintid;
        maintasktype2 = b.maintasktype2;
    }

    public CommonTaskMain() {
        super();
    }

    public static class Builder {
        private String id;

        private String sheetid;

        private String title;

        private Date sheetacceptlimit;

        private Date sheetcompletelimit;

        private Date sendtime;

        private String sendorgtype;

        private String senduserid;

        private String sendcontact;

        private String sheetaccessories;

        private Date endtime;

        private String endresult;

        private BigDecimal status;

        private BigDecimal holdstatisfied;

        private String enduserid;

        private BigDecimal deleted;

        private String piid;

        private String sheettemplatename;

        private String parentsheetname;

        private String parentsheetid;

        private String parentphasename;

        private String correlationkey;

        private String parentcorrelation;

        private String todeptid;

        private String senddeptid;

        private String sendroleid;

        private String endroleid;

        private String enddeptid;

        private String templateflag;

        private String cancelreason;

        private String mainnetsort1;

        private String mainnetsort2;

        private String mainnetsort3;

        private String maintasktype;

        private String maintaskdescription;

        private String mainremark;

        private BigDecimal sendyear;

        private BigDecimal sendmonth;

        private BigDecimal sendday;

        private String invokemode;

        private String ifcomplaint;

        private String complaintid;

        private String maintasktype2;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder sheetid(String sheetid) {
            this.sheetid = sheetid;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder sheetacceptlimit(Date sheetacceptlimit) {
            this.sheetacceptlimit = sheetacceptlimit;
            return this;
        }

        public Builder sheetcompletelimit(Date sheetcompletelimit) {
            this.sheetcompletelimit = sheetcompletelimit;
            return this;
        }

        public Builder sendtime(Date sendtime) {
            this.sendtime = sendtime;
            return this;
        }

        public Builder sendorgtype(String sendorgtype) {
            this.sendorgtype = sendorgtype;
            return this;
        }

        public Builder senduserid(String senduserid) {
            this.senduserid = senduserid;
            return this;
        }

        public Builder sendcontact(String sendcontact) {
            this.sendcontact = sendcontact;
            return this;
        }

        public Builder sheetaccessories(String sheetaccessories) {
            this.sheetaccessories = sheetaccessories;
            return this;
        }

        public Builder endtime(Date endtime) {
            this.endtime = endtime;
            return this;
        }

        public Builder endresult(String endresult) {
            this.endresult = endresult;
            return this;
        }

        public Builder status(BigDecimal status) {
            this.status = status;
            return this;
        }

        public Builder holdstatisfied(BigDecimal holdstatisfied) {
            this.holdstatisfied = holdstatisfied;
            return this;
        }

        public Builder enduserid(String enduserid) {
            this.enduserid = enduserid;
            return this;
        }

        public Builder deleted(BigDecimal deleted) {
            this.deleted = deleted;
            return this;
        }

        public Builder piid(String piid) {
            this.piid = piid;
            return this;
        }

        public Builder sheettemplatename(String sheettemplatename) {
            this.sheettemplatename = sheettemplatename;
            return this;
        }

        public Builder parentsheetname(String parentsheetname) {
            this.parentsheetname = parentsheetname;
            return this;
        }

        public Builder parentsheetid(String parentsheetid) {
            this.parentsheetid = parentsheetid;
            return this;
        }

        public Builder parentphasename(String parentphasename) {
            this.parentphasename = parentphasename;
            return this;
        }

        public Builder correlationkey(String correlationkey) {
            this.correlationkey = correlationkey;
            return this;
        }

        public Builder parentcorrelation(String parentcorrelation) {
            this.parentcorrelation = parentcorrelation;
            return this;
        }

        public Builder todeptid(String todeptid) {
            this.todeptid = todeptid;
            return this;
        }

        public Builder senddeptid(String senddeptid) {
            this.senddeptid = senddeptid;
            return this;
        }

        public Builder sendroleid(String sendroleid) {
            this.sendroleid = sendroleid;
            return this;
        }

        public Builder endroleid(String endroleid) {
            this.endroleid = endroleid;
            return this;
        }

        public Builder enddeptid(String enddeptid) {
            this.enddeptid = enddeptid;
            return this;
        }

        public Builder templateflag(String templateflag) {
            this.templateflag = templateflag;
            return this;
        }

        public Builder cancelreason(String cancelreason) {
            this.cancelreason = cancelreason;
            return this;
        }

        public Builder mainnetsort1(String mainnetsort1) {
            this.mainnetsort1 = mainnetsort1;
            return this;
        }

        public Builder mainnetsort2(String mainnetsort2) {
            this.mainnetsort2 = mainnetsort2;
            return this;
        }

        public Builder mainnetsort3(String mainnetsort3) {
            this.mainnetsort3 = mainnetsort3;
            return this;
        }

        public Builder maintasktype(String maintasktype) {
            this.maintasktype = maintasktype;
            return this;
        }

        public Builder maintaskdescription(String maintaskdescription) {
            this.maintaskdescription = maintaskdescription;
            return this;
        }

        public Builder mainremark(String mainremark) {
            this.mainremark = mainremark;
            return this;
        }

        public Builder sendyear(BigDecimal sendyear) {
            this.sendyear = sendyear;
            return this;
        }

        public Builder sendmonth(BigDecimal sendmonth) {
            this.sendmonth = sendmonth;
            return this;
        }

        public Builder sendday(BigDecimal sendday) {
            this.sendday = sendday;
            return this;
        }

        public Builder invokemode(String invokemode) {
            this.invokemode = invokemode;
            return this;
        }

        public Builder ifcomplaint(String ifcomplaint) {
            this.ifcomplaint = ifcomplaint;
            return this;
        }

        public Builder complaintid(String complaintid) {
            this.complaintid = complaintid;
            return this;
        }

        public Builder maintasktype2(String maintasktype2) {
            this.maintasktype2 = maintasktype2;
            return this;
        }

        public CommonTaskMain build() {
            return new CommonTaskMain(this);
        }
    }
}
package com.boco.eoms.sheet.commontask.module;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CommonTaskLink implements Serializable {
    private String id;

    private String mainid;

    private Date nodeacceptlimit;

    private Date nodecompletelimit;

    private BigDecimal operatetype;

    private Date operatetime;

    private String operateuserid;

    private String operateorgtype;

    private BigDecimal toorgtype;

    private String toorguserid;

    private BigDecimal toroleid;

    private BigDecimal acceptflag;

    private Date accepttime;

    private BigDecimal completeflag;

    private Date completetime;

    private String prelinkid;

    private String parentlinkid;

    private String firstlinkid;

    private String piid;

    private String aiid;

    private String activetemplateid;

    private String nodetemplatename;

    private String nodeaccessories;

    private String toorgdeptid;

    private String toorgroleid;

    private String operateroleid;

    private String operatedeptid;

    private String correlationkey;

    private String templateflag;

    private String templatename;

    private String templatecreateuserid;

    private String linkauditresult;

    private String linkauditidea;

    private String linktaskcomplete;

    private String operatercontact;

    private BigDecimal operateyear;

    private BigDecimal operatemonth;

    private BigDecimal operateday;

    private String transferreason;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMainid() {
        return mainid;
    }

    public void setMainid(String mainid) {
        this.mainid = mainid;
    }

    public Date getNodeacceptlimit() {
        return nodeacceptlimit;
    }

    public void setNodeacceptlimit(Date nodeacceptlimit) {
        this.nodeacceptlimit = nodeacceptlimit;
    }

    public Date getNodecompletelimit() {
        return nodecompletelimit;
    }

    public void setNodecompletelimit(Date nodecompletelimit) {
        this.nodecompletelimit = nodecompletelimit;
    }

    public BigDecimal getOperatetype() {
        return operatetype;
    }

    public void setOperatetype(BigDecimal operatetype) {
        this.operatetype = operatetype;
    }

    public Date getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(Date operatetime) {
        this.operatetime = operatetime;
    }

    public String getOperateuserid() {
        return operateuserid;
    }

    public void setOperateuserid(String operateuserid) {
        this.operateuserid = operateuserid;
    }

    public String getOperateorgtype() {
        return operateorgtype;
    }

    public void setOperateorgtype(String operateorgtype) {
        this.operateorgtype = operateorgtype;
    }

    public BigDecimal getToorgtype() {
        return toorgtype;
    }

    public void setToorgtype(BigDecimal toorgtype) {
        this.toorgtype = toorgtype;
    }

    public String getToorguserid() {
        return toorguserid;
    }

    public void setToorguserid(String toorguserid) {
        this.toorguserid = toorguserid;
    }

    public BigDecimal getToroleid() {
        return toroleid;
    }

    public void setToroleid(BigDecimal toroleid) {
        this.toroleid = toroleid;
    }

    public BigDecimal getAcceptflag() {
        return acceptflag;
    }

    public void setAcceptflag(BigDecimal acceptflag) {
        this.acceptflag = acceptflag;
    }

    public Date getAccepttime() {
        return accepttime;
    }

    public void setAccepttime(Date accepttime) {
        this.accepttime = accepttime;
    }

    public BigDecimal getCompleteflag() {
        return completeflag;
    }

    public void setCompleteflag(BigDecimal completeflag) {
        this.completeflag = completeflag;
    }

    public Date getCompletetime() {
        return completetime;
    }

    public void setCompletetime(Date completetime) {
        this.completetime = completetime;
    }

    public String getPrelinkid() {
        return prelinkid;
    }

    public void setPrelinkid(String prelinkid) {
        this.prelinkid = prelinkid;
    }

    public String getParentlinkid() {
        return parentlinkid;
    }

    public void setParentlinkid(String parentlinkid) {
        this.parentlinkid = parentlinkid;
    }

    public String getFirstlinkid() {
        return firstlinkid;
    }

    public void setFirstlinkid(String firstlinkid) {
        this.firstlinkid = firstlinkid;
    }

    public String getPiid() {
        return piid;
    }

    public void setPiid(String piid) {
        this.piid = piid;
    }

    public String getAiid() {
        return aiid;
    }

    public void setAiid(String aiid) {
        this.aiid = aiid;
    }

    public String getActivetemplateid() {
        return activetemplateid;
    }

    public void setActivetemplateid(String activetemplateid) {
        this.activetemplateid = activetemplateid;
    }

    public String getNodetemplatename() {
        return nodetemplatename;
    }

    public void setNodetemplatename(String nodetemplatename) {
        this.nodetemplatename = nodetemplatename;
    }

    public String getNodeaccessories() {
        return nodeaccessories;
    }

    public void setNodeaccessories(String nodeaccessories) {
        this.nodeaccessories = nodeaccessories;
    }

    public String getToorgdeptid() {
        return toorgdeptid;
    }

    public void setToorgdeptid(String toorgdeptid) {
        this.toorgdeptid = toorgdeptid;
    }

    public String getToorgroleid() {
        return toorgroleid;
    }

    public void setToorgroleid(String toorgroleid) {
        this.toorgroleid = toorgroleid;
    }

    public String getOperateroleid() {
        return operateroleid;
    }

    public void setOperateroleid(String operateroleid) {
        this.operateroleid = operateroleid;
    }

    public String getOperatedeptid() {
        return operatedeptid;
    }

    public void setOperatedeptid(String operatedeptid) {
        this.operatedeptid = operatedeptid;
    }

    public String getCorrelationkey() {
        return correlationkey;
    }

    public void setCorrelationkey(String correlationkey) {
        this.correlationkey = correlationkey;
    }

    public String getTemplateflag() {
        return templateflag;
    }

    public void setTemplateflag(String templateflag) {
        this.templateflag = templateflag;
    }

    public String getTemplatename() {
        return templatename;
    }

    public void setTemplatename(String templatename) {
        this.templatename = templatename;
    }

    public String getTemplatecreateuserid() {
        return templatecreateuserid;
    }

    public void setTemplatecreateuserid(String templatecreateuserid) {
        this.templatecreateuserid = templatecreateuserid;
    }

    public String getLinkauditresult() {
        return linkauditresult;
    }

    public void setLinkauditresult(String linkauditresult) {
        this.linkauditresult = linkauditresult;
    }

    public String getLinkauditidea() {
        return linkauditidea;
    }

    public void setLinkauditidea(String linkauditidea) {
        this.linkauditidea = linkauditidea;
    }

    public String getLinktaskcomplete() {
        return linktaskcomplete;
    }

    public void setLinktaskcomplete(String linktaskcomplete) {
        this.linktaskcomplete = linktaskcomplete;
    }

    public String getOperatercontact() {
        return operatercontact;
    }

    public void setOperatercontact(String operatercontact) {
        this.operatercontact = operatercontact;
    }

    public BigDecimal getOperateyear() {
        return operateyear;
    }

    public void setOperateyear(BigDecimal operateyear) {
        this.operateyear = operateyear;
    }

    public BigDecimal getOperatemonth() {
        return operatemonth;
    }

    public void setOperatemonth(BigDecimal operatemonth) {
        this.operatemonth = operatemonth;
    }

    public BigDecimal getOperateday() {
        return operateday;
    }

    public void setOperateday(BigDecimal operateday) {
        this.operateday = operateday;
    }

    public String getTransferreason() {
        return transferreason;
    }

    public void setTransferreason(String transferreason) {
        this.transferreason = transferreason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private CommonTaskLink(Builder b) {
        id = b.id;
        mainid = b.mainid;
        nodeacceptlimit = b.nodeacceptlimit;
        nodecompletelimit = b.nodecompletelimit;
        operatetype = b.operatetype;
        operatetime = b.operatetime;
        operateuserid = b.operateuserid;
        operateorgtype = b.operateorgtype;
        toorgtype = b.toorgtype;
        toorguserid = b.toorguserid;
        toroleid = b.toroleid;
        acceptflag = b.acceptflag;
        accepttime = b.accepttime;
        completeflag = b.completeflag;
        completetime = b.completetime;
        prelinkid = b.prelinkid;
        parentlinkid = b.parentlinkid;
        firstlinkid = b.firstlinkid;
        piid = b.piid;
        aiid = b.aiid;
        activetemplateid = b.activetemplateid;
        nodetemplatename = b.nodetemplatename;
        nodeaccessories = b.nodeaccessories;
        toorgdeptid = b.toorgdeptid;
        toorgroleid = b.toorgroleid;
        operateroleid = b.operateroleid;
        operatedeptid = b.operatedeptid;
        correlationkey = b.correlationkey;
        templateflag = b.templateflag;
        templatename = b.templatename;
        templatecreateuserid = b.templatecreateuserid;
        linkauditresult = b.linkauditresult;
        linkauditidea = b.linkauditidea;
        linktaskcomplete = b.linktaskcomplete;
        operatercontact = b.operatercontact;
        operateyear = b.operateyear;
        operatemonth = b.operatemonth;
        operateday = b.operateday;
        transferreason = b.transferreason;
        remark = b.remark;
    }

    public CommonTaskLink() {
        super();
    }

    public static class Builder {
        private String id;

        private String mainid;

        private Date nodeacceptlimit;

        private Date nodecompletelimit;

        private BigDecimal operatetype;

        private Date operatetime;

        private String operateuserid;

        private String operateorgtype;

        private BigDecimal toorgtype;

        private String toorguserid;

        private BigDecimal toroleid;

        private BigDecimal acceptflag;

        private Date accepttime;

        private BigDecimal completeflag;

        private Date completetime;

        private String prelinkid;

        private String parentlinkid;

        private String firstlinkid;

        private String piid;

        private String aiid;

        private String activetemplateid;

        private String nodetemplatename;

        private String nodeaccessories;

        private String toorgdeptid;

        private String toorgroleid;

        private String operateroleid;

        private String operatedeptid;

        private String correlationkey;

        private String templateflag;

        private String templatename;

        private String templatecreateuserid;

        private String linkauditresult;

        private String linkauditidea;

        private String linktaskcomplete;

        private String operatercontact;

        private BigDecimal operateyear;

        private BigDecimal operatemonth;

        private BigDecimal operateday;

        private String transferreason;

        private String remark;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder mainid(String mainid) {
            this.mainid = mainid;
            return this;
        }

        public Builder nodeacceptlimit(Date nodeacceptlimit) {
            this.nodeacceptlimit = nodeacceptlimit;
            return this;
        }

        public Builder nodecompletelimit(Date nodecompletelimit) {
            this.nodecompletelimit = nodecompletelimit;
            return this;
        }

        public Builder operatetype(BigDecimal operatetype) {
            this.operatetype = operatetype;
            return this;
        }

        public Builder operatetime(Date operatetime) {
            this.operatetime = operatetime;
            return this;
        }

        public Builder operateuserid(String operateuserid) {
            this.operateuserid = operateuserid;
            return this;
        }

        public Builder operateorgtype(String operateorgtype) {
            this.operateorgtype = operateorgtype;
            return this;
        }

        public Builder toorgtype(BigDecimal toorgtype) {
            this.toorgtype = toorgtype;
            return this;
        }

        public Builder toorguserid(String toorguserid) {
            this.toorguserid = toorguserid;
            return this;
        }

        public Builder toroleid(BigDecimal toroleid) {
            this.toroleid = toroleid;
            return this;
        }

        public Builder acceptflag(BigDecimal acceptflag) {
            this.acceptflag = acceptflag;
            return this;
        }

        public Builder accepttime(Date accepttime) {
            this.accepttime = accepttime;
            return this;
        }

        public Builder completeflag(BigDecimal completeflag) {
            this.completeflag = completeflag;
            return this;
        }

        public Builder completetime(Date completetime) {
            this.completetime = completetime;
            return this;
        }

        public Builder prelinkid(String prelinkid) {
            this.prelinkid = prelinkid;
            return this;
        }

        public Builder parentlinkid(String parentlinkid) {
            this.parentlinkid = parentlinkid;
            return this;
        }

        public Builder firstlinkid(String firstlinkid) {
            this.firstlinkid = firstlinkid;
            return this;
        }

        public Builder piid(String piid) {
            this.piid = piid;
            return this;
        }

        public Builder aiid(String aiid) {
            this.aiid = aiid;
            return this;
        }

        public Builder activetemplateid(String activetemplateid) {
            this.activetemplateid = activetemplateid;
            return this;
        }

        public Builder nodetemplatename(String nodetemplatename) {
            this.nodetemplatename = nodetemplatename;
            return this;
        }

        public Builder nodeaccessories(String nodeaccessories) {
            this.nodeaccessories = nodeaccessories;
            return this;
        }

        public Builder toorgdeptid(String toorgdeptid) {
            this.toorgdeptid = toorgdeptid;
            return this;
        }

        public Builder toorgroleid(String toorgroleid) {
            this.toorgroleid = toorgroleid;
            return this;
        }

        public Builder operateroleid(String operateroleid) {
            this.operateroleid = operateroleid;
            return this;
        }

        public Builder operatedeptid(String operatedeptid) {
            this.operatedeptid = operatedeptid;
            return this;
        }

        public Builder correlationkey(String correlationkey) {
            this.correlationkey = correlationkey;
            return this;
        }

        public Builder templateflag(String templateflag) {
            this.templateflag = templateflag;
            return this;
        }

        public Builder templatename(String templatename) {
            this.templatename = templatename;
            return this;
        }

        public Builder templatecreateuserid(String templatecreateuserid) {
            this.templatecreateuserid = templatecreateuserid;
            return this;
        }

        public Builder linkauditresult(String linkauditresult) {
            this.linkauditresult = linkauditresult;
            return this;
        }

        public Builder linkauditidea(String linkauditidea) {
            this.linkauditidea = linkauditidea;
            return this;
        }

        public Builder linktaskcomplete(String linktaskcomplete) {
            this.linktaskcomplete = linktaskcomplete;
            return this;
        }

        public Builder operatercontact(String operatercontact) {
            this.operatercontact = operatercontact;
            return this;
        }

        public Builder operateyear(BigDecimal operateyear) {
            this.operateyear = operateyear;
            return this;
        }

        public Builder operatemonth(BigDecimal operatemonth) {
            this.operatemonth = operatemonth;
            return this;
        }

        public Builder operateday(BigDecimal operateday) {
            this.operateday = operateday;
            return this;
        }

        public Builder transferreason(String transferreason) {
            this.transferreason = transferreason;
            return this;
        }

        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        public CommonTaskLink build() {
            return new CommonTaskLink(this);
        }
    }
}
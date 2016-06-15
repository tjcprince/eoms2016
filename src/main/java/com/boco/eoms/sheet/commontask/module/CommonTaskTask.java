package com.boco.eoms.sheet.commontask.module;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CommonTaskTask implements Serializable {
    private String id;

    private String taskname;

    private String taskdisplayname;

    private Date createtime;

    private String taskstatus;

    private String processid;

    private String sheetkey;

    private String sheetid;

    private String title;

    private Date accepttimelimit;

    private Date completetimelimit;

    private String operateroleid;

    private String taskowner;

    private String prelinkid;

    private String flowname;

    private String currentlinkid;

    private String operatetype;

    private String parenttaskid;

    private String subtaskdealfalg;

    private String ifwaitforsubtask;

    private String subtaskflag;

    private BigDecimal createyear;

    private BigDecimal createmonth;

    private BigDecimal createday;

    private Date sendtime;

    private String predealuserid;

    private String predealdept;

    private String parentprocessname;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getTaskdisplayname() {
        return taskdisplayname;
    }

    public void setTaskdisplayname(String taskdisplayname) {
        this.taskdisplayname = taskdisplayname;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getTaskstatus() {
        return taskstatus;
    }

    public void setTaskstatus(String taskstatus) {
        this.taskstatus = taskstatus;
    }

    public String getProcessid() {
        return processid;
    }

    public void setProcessid(String processid) {
        this.processid = processid;
    }

    public String getSheetkey() {
        return sheetkey;
    }

    public void setSheetkey(String sheetkey) {
        this.sheetkey = sheetkey;
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

    public Date getAccepttimelimit() {
        return accepttimelimit;
    }

    public void setAccepttimelimit(Date accepttimelimit) {
        this.accepttimelimit = accepttimelimit;
    }

    public Date getCompletetimelimit() {
        return completetimelimit;
    }

    public void setCompletetimelimit(Date completetimelimit) {
        this.completetimelimit = completetimelimit;
    }

    public String getOperateroleid() {
        return operateroleid;
    }

    public void setOperateroleid(String operateroleid) {
        this.operateroleid = operateroleid;
    }

    public String getTaskowner() {
        return taskowner;
    }

    public void setTaskowner(String taskowner) {
        this.taskowner = taskowner;
    }

    public String getPrelinkid() {
        return prelinkid;
    }

    public void setPrelinkid(String prelinkid) {
        this.prelinkid = prelinkid;
    }

    public String getFlowname() {
        return flowname;
    }

    public void setFlowname(String flowname) {
        this.flowname = flowname;
    }

    public String getCurrentlinkid() {
        return currentlinkid;
    }

    public void setCurrentlinkid(String currentlinkid) {
        this.currentlinkid = currentlinkid;
    }

    public String getOperatetype() {
        return operatetype;
    }

    public void setOperatetype(String operatetype) {
        this.operatetype = operatetype;
    }

    public String getParenttaskid() {
        return parenttaskid;
    }

    public void setParenttaskid(String parenttaskid) {
        this.parenttaskid = parenttaskid;
    }

    public String getSubtaskdealfalg() {
        return subtaskdealfalg;
    }

    public void setSubtaskdealfalg(String subtaskdealfalg) {
        this.subtaskdealfalg = subtaskdealfalg;
    }

    public String getIfwaitforsubtask() {
        return ifwaitforsubtask;
    }

    public void setIfwaitforsubtask(String ifwaitforsubtask) {
        this.ifwaitforsubtask = ifwaitforsubtask;
    }

    public String getSubtaskflag() {
        return subtaskflag;
    }

    public void setSubtaskflag(String subtaskflag) {
        this.subtaskflag = subtaskflag;
    }

    public BigDecimal getCreateyear() {
        return createyear;
    }

    public void setCreateyear(BigDecimal createyear) {
        this.createyear = createyear;
    }

    public BigDecimal getCreatemonth() {
        return createmonth;
    }

    public void setCreatemonth(BigDecimal createmonth) {
        this.createmonth = createmonth;
    }

    public BigDecimal getCreateday() {
        return createday;
    }

    public void setCreateday(BigDecimal createday) {
        this.createday = createday;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getPredealuserid() {
        return predealuserid;
    }

    public void setPredealuserid(String predealuserid) {
        this.predealuserid = predealuserid;
    }

    public String getPredealdept() {
        return predealdept;
    }

    public void setPredealdept(String predealdept) {
        this.predealdept = predealdept;
    }

    public String getParentprocessname() {
        return parentprocessname;
    }

    public void setParentprocessname(String parentprocessname) {
        this.parentprocessname = parentprocessname;
    }

    private CommonTaskTask(Builder b) {
        id = b.id;
        taskname = b.taskname;
        taskdisplayname = b.taskdisplayname;
        createtime = b.createtime;
        taskstatus = b.taskstatus;
        processid = b.processid;
        sheetkey = b.sheetkey;
        sheetid = b.sheetid;
        title = b.title;
        accepttimelimit = b.accepttimelimit;
        completetimelimit = b.completetimelimit;
        operateroleid = b.operateroleid;
        taskowner = b.taskowner;
        prelinkid = b.prelinkid;
        flowname = b.flowname;
        currentlinkid = b.currentlinkid;
        operatetype = b.operatetype;
        parenttaskid = b.parenttaskid;
        subtaskdealfalg = b.subtaskdealfalg;
        ifwaitforsubtask = b.ifwaitforsubtask;
        subtaskflag = b.subtaskflag;
        createyear = b.createyear;
        createmonth = b.createmonth;
        createday = b.createday;
        sendtime = b.sendtime;
        predealuserid = b.predealuserid;
        predealdept = b.predealdept;
        parentprocessname = b.parentprocessname;
    }

    public CommonTaskTask() {
        super();
    }

    public static class Builder {
        private String id;

        private String taskname;

        private String taskdisplayname;

        private Date createtime;

        private String taskstatus;

        private String processid;

        private String sheetkey;

        private String sheetid;

        private String title;

        private Date accepttimelimit;

        private Date completetimelimit;

        private String operateroleid;

        private String taskowner;

        private String prelinkid;

        private String flowname;

        private String currentlinkid;

        private String operatetype;

        private String parenttaskid;

        private String subtaskdealfalg;

        private String ifwaitforsubtask;

        private String subtaskflag;

        private BigDecimal createyear;

        private BigDecimal createmonth;

        private BigDecimal createday;

        private Date sendtime;

        private String predealuserid;

        private String predealdept;

        private String parentprocessname;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder taskname(String taskname) {
            this.taskname = taskname;
            return this;
        }

        public Builder taskdisplayname(String taskdisplayname) {
            this.taskdisplayname = taskdisplayname;
            return this;
        }

        public Builder createtime(Date createtime) {
            this.createtime = createtime;
            return this;
        }

        public Builder taskstatus(String taskstatus) {
            this.taskstatus = taskstatus;
            return this;
        }

        public Builder processid(String processid) {
            this.processid = processid;
            return this;
        }

        public Builder sheetkey(String sheetkey) {
            this.sheetkey = sheetkey;
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

        public Builder accepttimelimit(Date accepttimelimit) {
            this.accepttimelimit = accepttimelimit;
            return this;
        }

        public Builder completetimelimit(Date completetimelimit) {
            this.completetimelimit = completetimelimit;
            return this;
        }

        public Builder operateroleid(String operateroleid) {
            this.operateroleid = operateroleid;
            return this;
        }

        public Builder taskowner(String taskowner) {
            this.taskowner = taskowner;
            return this;
        }

        public Builder prelinkid(String prelinkid) {
            this.prelinkid = prelinkid;
            return this;
        }

        public Builder flowname(String flowname) {
            this.flowname = flowname;
            return this;
        }

        public Builder currentlinkid(String currentlinkid) {
            this.currentlinkid = currentlinkid;
            return this;
        }

        public Builder operatetype(String operatetype) {
            this.operatetype = operatetype;
            return this;
        }

        public Builder parenttaskid(String parenttaskid) {
            this.parenttaskid = parenttaskid;
            return this;
        }

        public Builder subtaskdealfalg(String subtaskdealfalg) {
            this.subtaskdealfalg = subtaskdealfalg;
            return this;
        }

        public Builder ifwaitforsubtask(String ifwaitforsubtask) {
            this.ifwaitforsubtask = ifwaitforsubtask;
            return this;
        }

        public Builder subtaskflag(String subtaskflag) {
            this.subtaskflag = subtaskflag;
            return this;
        }

        public Builder createyear(BigDecimal createyear) {
            this.createyear = createyear;
            return this;
        }

        public Builder createmonth(BigDecimal createmonth) {
            this.createmonth = createmonth;
            return this;
        }

        public Builder createday(BigDecimal createday) {
            this.createday = createday;
            return this;
        }

        public Builder sendtime(Date sendtime) {
            this.sendtime = sendtime;
            return this;
        }

        public Builder predealuserid(String predealuserid) {
            this.predealuserid = predealuserid;
            return this;
        }

        public Builder predealdept(String predealdept) {
            this.predealdept = predealdept;
            return this;
        }

        public Builder parentprocessname(String parentprocessname) {
            this.parentprocessname = parentprocessname;
            return this;
        }

        public CommonTaskTask build() {
            return new CommonTaskTask(this);
        }
    }
}
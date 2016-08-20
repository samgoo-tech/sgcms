package cn.freeteam.cms.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mail implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_mail.id
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_mail.unitid
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    private String unitid;
    private String unitids;//查询属性
    private String unitname;
    private String username;
    
    private SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    private String addtimeStr;
    private String retimeStr;

    private String type;//查询属性
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_mail.userid
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    private String userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_mail.mailtype
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    private String mailtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_mail.title
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_mail.writer
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    private String writer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_mail.tel
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_mail.address
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_mail.email
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_mail.isopen
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    private String isopen;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_mail.content
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_mail.querycode
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    private String querycode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_mail.addtime
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    private Date addtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_mail.ip
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_mail.state
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    private String state;
    private String stateStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_mail.recontent
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    private String recontent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_mail.retime
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    private Date retime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_mail.proflow
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    private String proflow;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_mail.id
     *
     * @return the value of freecms_mail.id
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_mail.id
     *
     * @param id the value for freecms_mail.id
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_mail.unitid
     *
     * @return the value of freecms_mail.unitid
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public String getUnitid() {
        return unitid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_mail.unitid
     *
     * @param unitid the value for freecms_mail.unitid
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public void setUnitid(String unitid) {
        this.unitid = unitid == null ? null : unitid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_mail.userid
     *
     * @return the value of freecms_mail.userid
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_mail.userid
     *
     * @param userid the value for freecms_mail.userid
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_mail.mailtype
     *
     * @return the value of freecms_mail.mailtype
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public String getMailtype() {
        return mailtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_mail.mailtype
     *
     * @param mailtype the value for freecms_mail.mailtype
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public void setMailtype(String mailtype) {
        this.mailtype = mailtype == null ? null : mailtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_mail.title
     *
     * @return the value of freecms_mail.title
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_mail.title
     *
     * @param title the value for freecms_mail.title
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_mail.writer
     *
     * @return the value of freecms_mail.writer
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public String getWriter() {
        return writer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_mail.writer
     *
     * @param writer the value for freecms_mail.writer
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public void setWriter(String writer) {
        this.writer = writer == null ? null : writer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_mail.tel
     *
     * @return the value of freecms_mail.tel
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_mail.tel
     *
     * @param tel the value for freecms_mail.tel
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_mail.address
     *
     * @return the value of freecms_mail.address
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_mail.address
     *
     * @param address the value for freecms_mail.address
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_mail.email
     *
     * @return the value of freecms_mail.email
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_mail.email
     *
     * @param email the value for freecms_mail.email
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_mail.isopen
     *
     * @return the value of freecms_mail.isopen
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public String getIsopen() {
        return isopen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_mail.isopen
     *
     * @param isopen the value for freecms_mail.isopen
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public void setIsopen(String isopen) {
        this.isopen = isopen == null ? null : isopen.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_mail.content
     *
     * @return the value of freecms_mail.content
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_mail.content
     *
     * @param content the value for freecms_mail.content
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_mail.querycode
     *
     * @return the value of freecms_mail.querycode
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public String getQuerycode() {
        return querycode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_mail.querycode
     *
     * @param querycode the value for freecms_mail.querycode
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public void setQuerycode(String querycode) {
        this.querycode = querycode == null ? null : querycode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_mail.addtime
     *
     * @return the value of freecms_mail.addtime
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_mail.addtime
     *
     * @param addtime the value for freecms_mail.addtime
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_mail.ip
     *
     * @return the value of freecms_mail.ip
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_mail.ip
     *
     * @param ip the value for freecms_mail.ip
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_mail.state
     *
     * @return the value of freecms_mail.state
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_mail.state
     *
     * @param state the value for freecms_mail.state
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_mail.recontent
     *
     * @return the value of freecms_mail.recontent
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public String getRecontent() {
        return recontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_mail.recontent
     *
     * @param recontent the value for freecms_mail.recontent
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public void setRecontent(String recontent) {
        this.recontent = recontent == null ? null : recontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_mail.retime
     *
     * @return the value of freecms_mail.retime
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public Date getRetime() {
        return retime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_mail.retime
     *
     * @param retime the value for freecms_mail.retime
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public void setRetime(Date retime) {
        this.retime = retime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_mail.proflow
     *
     * @return the value of freecms_mail.proflow
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public String getProflow() {
        return proflow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_mail.proflow
     *
     * @param proflow the value for freecms_mail.proflow
     *
     * @mbggenerated Thu Jan 17 20:30:48 CST 2013
     */
    public void setProflow(String proflow) {
        this.proflow = proflow == null ? null : proflow.trim();
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUnitids() {
		return unitids;
	}

	public void setUnitids(String unitids) {
		this.unitids = unitids;
	}

	public String getUnitname() {
		return unitname;
	}

	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddtimeStr() {
		if (addtime!=null) {
			addtimeStr=sdf.format(addtime);
		}
		return addtimeStr;
	}

	public void setAddtimeStr(String addtimeStr) {
		this.addtimeStr = addtimeStr;
	}

	public String getRetimeStr() {
		if (retime!=null) {
			retimeStr=sdf.format(retime);
		}
		return retimeStr;
	}

	public void setRetimeStr(String retimeStr) {
		this.retimeStr = retimeStr;
	}

	public String getStateStr() {
		if ("1".equals(state)) {
			stateStr="已办结";
		}else {
			stateStr="办理中";
		}
		return stateStr;
	}

	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
	}
}
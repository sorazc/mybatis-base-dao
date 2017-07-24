package cn.zc.test.entity;

import cn.zc.base.dao.annotation.Id;
import cn.zc.base.dao.annotation.Table;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

@Table(name = "user")
public class User implements Serializable{

	@Transient
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
    private String username;
    private String password;
    private Integer status;
    private Date createTime;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


}

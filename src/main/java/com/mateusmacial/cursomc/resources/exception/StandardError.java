package com.mateusmacial.cursomc.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Long tmeStamp;
	
	public StandardError(Integer status, String msg, Long tmeStamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.tmeStamp = tmeStamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTmeStamp() {
		return tmeStamp;
	}

	public void setTmeStamp(Long tmeStamp) {
		this.tmeStamp = tmeStamp;
	}
	
	
}

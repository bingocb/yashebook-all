package com.yashebook.bo;

import com.alibaba.fastjson.JSON;

public class Success {
	
	private boolean success = true;

	private Object entity = null;



	public Success() {
		super();
	}

	public Success(boolean success) {
		super();
		this.success = success;
	}

	public Success(boolean success, Object entity) {
		super();
		this.success = success;
		this.entity = entity;
	}

	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getEntity() {
		return entity;
	}

	public void setEntity(Object entity) {
		this.entity = entity;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
	
}

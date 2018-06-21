/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.acc.model;


/**
 * @version 1.0
 * @since 1.0
 */


public class GrhxMessageType implements java.io.Serializable{
	
	private static final long serialVersionUID = 6707610233118657856L;
	//alias
	public static final String TABLE_ALIAS = "GrhxMessageType";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_MESSAGE_NAME = "messageName";
	public static final String ALIAS_STATE = "state";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private Integer id;
    /**
     * messageName       db_column: MESSAGE_NAME 
     */	
	private String messageName;
    /**
     * state       db_column: STATE 
     */	
	private String state;
	//columns END

	public GrhxMessageType(){
	}

	public GrhxMessageType(
		Integer id
	){
		this.id = id;
	}

	public void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public String getMessageName() {
		return messageName;
	}

	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}

	public void setState(String value) {
		this.state = value;
	}
	
	public String getState() {
		return this.state;
	}

}


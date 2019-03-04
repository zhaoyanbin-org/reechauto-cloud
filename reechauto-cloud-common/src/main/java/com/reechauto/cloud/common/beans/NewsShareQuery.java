package com.reechauto.cloud.common.beans;

import java.io.Serializable;

public class NewsShareQuery implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long userId;
	private String isTope;// N:普通,Y:置顶
	private String isNews;// news:资讯,share:动态
	private String status;// Y:正常,N:删除
	private Long pushUserId=0L;
	private String createDate;
	private String searchCondition;
	private int pageNum;
	private int start;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getIsTope() {
		return isTope;
	}

	public void setIsTope(String isTope) {
		this.isTope = isTope;
	}

	public String getIsNews() {
		return isNews;
	}

	public void setIsNews(String isNews) {
		this.isNews = isNews;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getPushUserId() {
		return pushUserId;
	}

	public void setPushUserId(Long pushUserId) {
		this.pushUserId = pushUserId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

}

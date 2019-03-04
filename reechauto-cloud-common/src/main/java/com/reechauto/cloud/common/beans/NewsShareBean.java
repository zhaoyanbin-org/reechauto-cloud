package com.reechauto.cloud.common.beans;

import java.io.Serializable;
import java.util.Date;

public class NewsShareBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * N:普通,Y:置顶
	 */
	private String isTope;
	/**
	 * news:资讯,share:动态
	 */
	private String isNews;
	/**
	 * Y:正常,N:删除
	 */
	private String status;
	/**
	 * 发布人ID
	 */
	private Long pushUserId = 0L;
	/**
	 * 发布人昵称
	 */
	private String pushUserNick;
	/**
	 * 发布人头像
	 */
	private String pushUserHeadPortraitUrl;
	/**
	 * 浏览数
	 */
	private Integer browseNum;
	/**
	 * 点赞数
	 */
	private Integer likeNum;
	private Date createTime;
	private Date modifyTime;
	/**
	 * 简介
	 */
	private String intro;
	/**
	 * 内容
	 */
	private String context;
	/**
	 * 逗号分割
	 */
	private String imagesUrl;

	/**
	 * 评论数
	 */
	private Integer commentNum;

	/**
	 * 是否点赞
	 */
	private boolean hasLike;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getPushUserNick() {
		return pushUserNick;
	}

	public void setPushUserNick(String pushUserNick) {
		this.pushUserNick = pushUserNick;
	}

	public String getPushUserHeadPortraitUrl() {
		return pushUserHeadPortraitUrl;
	}

	public void setPushUserHeadPortraitUrl(String pushUserHeadPortraitUrl) {
		this.pushUserHeadPortraitUrl = pushUserHeadPortraitUrl;
	}

	public Integer getBrowseNum() {
		return browseNum;
	}

	public void setBrowseNum(Integer browseNum) {
		this.browseNum = browseNum;
	}

	public Integer getLikeNum() {
		return likeNum;
	}

	public void setLikeNum(Integer likeNum) {
		this.likeNum = likeNum;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getImagesUrl() {
		return imagesUrl;
	}

	public void setImagesUrl(String imagesUrl) {
		this.imagesUrl = imagesUrl;
	}

	public Integer getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(Integer commentNum) {
		this.commentNum = commentNum;
	}

	public boolean isHasLike() {
		return hasLike;
	}

	public void setHasLike(boolean hasLike) {
		this.hasLike = hasLike;
	}

}

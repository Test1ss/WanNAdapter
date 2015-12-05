package com.adapter.adpter;

public class MessageBean {
	private String mTitle;
	private String mContent;
	private String mComment;
	private String mRead;

	public MessageBean(String mTitle, String mContent, String mComment,
			String mRead) {
		super();
		this.mTitle = mTitle;
		this.mContent = mContent;
		this.mComment = mComment;
		this.mRead = mRead;
	}

	public String getmTitle() {
		return mTitle;
	}

	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}

	public String getmContent() {
		return mContent;
	}

	public void setmContent(String mContent) {
		this.mContent = mContent;
	}

	public String getmComment() {
		return mComment;
	}

	public void setmComment(String mComment) {
		this.mComment = mComment;
	}

	public String getmRead() {
		return mRead;
	}

	public void setmRead(String mRead) {
		this.mRead = mRead;
	}

}

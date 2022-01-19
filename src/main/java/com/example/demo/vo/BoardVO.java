package com.example.demo.vo;

public class BoardVO {
	private int No, grp, seq, lvl;
	private String id, title, content, writeDate, fileName;
	
	
	public BoardVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardVO(int no, int grp, int seq, int lvl, String id, String title, String content, String writeDate) {
		setNo(no);
		setGrp(grp);
		setSeq(seq);
		setLvl(lvl);
		setId(id);
		setTitle(title);
		setContent(content);
		setWriteDate(writeDate);
	}


	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}
	public int getGrp() {
		return grp;
	}
	public void setGrp(int grp) {
		this.grp = grp;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "BoardVO [No=" + No + ", grp=" + grp + ", seq=" + seq + ", lvl=" + lvl + ", id=" + id + ", title="
				+ title + ", content=" + content + ", writeDate=" + writeDate + "]";
	}


	
}
	
	
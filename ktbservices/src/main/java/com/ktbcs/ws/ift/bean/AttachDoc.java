package com.ktbcs.ws.ift.bean;

import java.io.Serializable;

public class AttachDoc implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -508080555456304607L;
	
	private Integer docSeqID;
	private String chronicleID;
	private String fileName;
	private String docType;
	private String docVersion;
	
	public Integer getDocSeqID() {
		return docSeqID;
	}
	public void setDocSeqID(Integer docSeqID) {
		this.docSeqID = docSeqID;
	}
	public String getChronicleID() {
		return chronicleID;
	}
	public void setChronicleID(String chronicleID) {
		this.chronicleID = chronicleID;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public String getDocVersion() {
		return docVersion;
	}
	public void setDocVersion(String docVersion) {
		this.docVersion = docVersion;
	}
}

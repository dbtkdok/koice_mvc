package com.myWebShop.member.vo;

import org.springframework.stereotype.Component;

@Component("fileVO")
public class FileVO {
	private String file_id;
	private String file_no;
	private String file_name;
	private String file_path;
	private String file_type;
	private String file_size;
	private String created_at;
	private String origin_file_NM;
	
	public String getFile_id() {
		return file_id;
	}
	public void setFile_id(String file_id) {
		this.file_id = file_id;
	}
	public String getFile_no() {
		return file_no;
	}
	public void setFile_no(String file_no) {
		this.file_no = file_no;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getFile_path() {
		return file_path;
	}
	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}
	public String getFile_type() {
		return file_type;
	}
	public void setFile_type(String file_type) {
		this.file_type = file_type;
	}
	public String getFile_size() {
		return file_size;
	}
	public void setFile_size(String file_size) {
		this.file_size = file_size;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getOrigin_file_NM() {
		return origin_file_NM;
	}
	public void setOrigin_file_NM(String origin_file_NM) {
		this.origin_file_NM = origin_file_NM;
	}
}


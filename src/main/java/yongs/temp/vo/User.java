package yongs.temp.vo;

public class User {
	private int id;
	private String email;
	private String name;
	private int score;
	// Web에서 이미지를 upload하면 확장자를 포함한 파일명이 Object Name으로 저장됨(abc@company.com.jpg)
	// 따라서 이미지 확장명이 다양할 수 있으므로  Object Name(photoName)을  별도로 저장함
	private String photoName;
	private String photoUrl;

	public String getPhotoName() {
		return photoName;
	}
	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

package co.dongil.mager.member.vo;

public class MemberVO {  //member table vo
	private String id;
	private String password;
	private String name;
	private String address;
	private String tel;
	private String author;
	
	
	
	public MemberVO() {
		super();
	}
	public MemberVO(String id, String password, String name, String address, String tel, String author) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.author = author;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
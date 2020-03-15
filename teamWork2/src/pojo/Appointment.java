package pojo;

public class Appointment {
	private String ID;               //预约编号
    private String name;             //真实姓名
    private String idNumber;         //身份证号
    private String phoneNumber;      //电话号码
    private int turn;             //摇号轮次
    private int quantity;         //预约数量
    private Boolean status;          //是否中签
    
    public void setID(String ID) {
    	this.ID = ID;
    }
    
    public String getID() {
    	return this.ID;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getName() {
    	return this.name;
    }
    
    public void setIdNumber(String idNumber) {
    	this.idNumber = idNumber;
    }
    
    public String getidNumber() {
    	return this.idNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
    	this.phoneNumber = phoneNumber;
    }
    
    public String getPhoneNumber() {
    	return this.phoneNumber;
    }
    
    public void setTurn(int turn) {
    	this.turn = turn;
    }
    
    public int getTurn() {
    	return this.turn;
    }
    
    public void setQuantity(int quantity) {
    	this.quantity = quantity;
    }
    
    public int getQuantity() {
    	return this.quantity;
    }
    
    public void setStatus(Boolean status) {
    	this.status = status;
    }
    
    public boolean getStatus() {
    	return this.status;
    }
}

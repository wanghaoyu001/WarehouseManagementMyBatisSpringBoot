package com.pojo;

public class BuyInSearch {
	private int buyinId = 0;//�ɹ����
	private String buyinProductId;//��Ʒ���
	private int buyinNum;//��������
	private double buyinPrice;//��������
	private double buyinTotal;//�ϼ�
	private double buyinPay;//�Ѹ����
	private double buyinDebt;//Ƿ����
	private String buyinWarehouse;//�ֿ�
	private String buyinSupplier;//������
	private String buyinTime;//��������
	private String buyinUser;//������
	private String buyinRemarks;//��ע
	private String productId;//��Ʒ���
	private String productName;//��Ʒ����
	private String productType;//��Ʒ����
	private String productSpecs;//��Ʒ���
	
	
	public BuyInSearch() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	public BuyInSearch(int buyinId, String buyinProductId, int buyinNum, double buyinPrice, double buyinTotal,
			double buyinPay, double buyinDebt, String buyinWarehouse, String buyinSupplier, String buyinTime,
			String buyinUser, String buyinRemarks, String productId, String productName, String productType,
			String productSpecs) {
		super();
		this.buyinId = buyinId;
		this.buyinProductId = buyinProductId;
		this.buyinNum = buyinNum;
		this.buyinPrice = buyinPrice;
		this.buyinTotal = buyinTotal;
		this.buyinPay = buyinPay;
		this.buyinDebt = buyinDebt;
		this.buyinWarehouse = buyinWarehouse;
		this.buyinSupplier = buyinSupplier;
		this.buyinTime = buyinTime;
		this.buyinUser = buyinUser;
		this.buyinRemarks = buyinRemarks;
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.productSpecs = productSpecs;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getBuyinId() {
		return buyinId;
	}
	public void setBuyinId(int buyinId) {
		this.buyinId = buyinId;
	}
	public String getBuyinProductId() {
		return buyinProductId;
	}
	public void setBuyinProductId(String buyinProductId) {
		this.buyinProductId = buyinProductId;
	}
	public int getBuyinNum() {
		return buyinNum;
	}
	public void setBuyinNum(int buyinNum) {
		this.buyinNum = buyinNum;
	}
	public double getBuyinPrice() {
		return buyinPrice;
	}
	public void setBuyinPrice(double buyinPrice) {
		this.buyinPrice = buyinPrice;
	}
	public double getBuyinTotal() {
		return buyinTotal;
	}
	public void setBuyinTotal(double buyinTotal) {
		this.buyinTotal = buyinTotal;
	}
	public double getBuyinPay() {
		return buyinPay;
	}
	public void setBuyinPay(double buyinPay) {
		this.buyinPay = buyinPay;
	}
	public double getBuyinDebt() {
		return buyinDebt;
	}
	public void setBuyinDebt(double buyinDebt) {
		this.buyinDebt = buyinDebt;
	}
	public String getBuyinWarehouse() {
		return buyinWarehouse;
	}
	public void setBuyinWarehouse(String buyinWarehouse) {
		this.buyinWarehouse = buyinWarehouse;
	}
	public String getBuyinSupplier() {
		return buyinSupplier;
	}
	public void setBuyinSupplier(String buyinSupplier) {
		this.buyinSupplier = buyinSupplier;
	}
	public String getBuyinTime() {
		return buyinTime;
	}
	public void setBuyinTime(String buyinTime) {
		this.buyinTime = buyinTime;
	}
	public String getBuyinUser() {
		return buyinUser;
	}
	public void setBuyinUser(String buyinUser) {
		this.buyinUser = buyinUser;
	}
	public String getBuyinRemarks() {
		return buyinRemarks;
	}
	public void setBuyinRemarks(String buyinRemarks) {
		this.buyinRemarks = buyinRemarks;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductSpecs() {
		return productSpecs;
	}
	public void setProductSpecs(String productSpecs) {
		this.productSpecs = productSpecs;
	}
	@Override
	public String toString() {
		return "BuyInSearch [buyinId=" + buyinId + ", buyinProductId=" + buyinProductId + ", buyinNum=" + buyinNum
				+ ", buyinPrice=" + buyinPrice + ", buyinTotal=" + buyinTotal + ", buyinPay=" + buyinPay
				+ ", buyinDebt=" + buyinDebt + ", buyinWarehouse=" + buyinWarehouse + ", buyinSupplier=" + buyinSupplier
				+ ", buyinTime=" + buyinTime + ", buyinUser=" + buyinUser + ", buyinRemarks=" + buyinRemarks
				+ ", productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ ", productSpecs=" + productSpecs + "]";
	}
	
}

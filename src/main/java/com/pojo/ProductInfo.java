package com.pojo;
//��Ʒ��Ϣ��
public class ProductInfo {
	private String productId;//��Ʒ���
	private String productName;//��Ʒ����
	private String productType;//��Ʒ����
	private String productSpecs;//��Ʒ���
	
	
	public ProductInfo() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	public ProductInfo(String productId, String productName, String productType, String productSpecs) {
		super();
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
		return "ProductInfo [productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ ", productSpecs=" + productSpecs + "]";
	}
	
}

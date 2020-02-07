package com.util;

import java.util.List;

//��ҳ������
public class Pageutil {
	//��ǰҳ��
	private int currentPageNo = 1;
	//��¼������
	private int totalCount = 0;
	//ҳ������
	private int pageSize = 5;
	//��ҳ��
	private int totalPageCount = 1;
	//�����
	private List<?> pagelist;
	
	//�����
	public List<?> getPagelist() {
		return pagelist;
	}
	public void setPagelist(List<?> pagelist) {
		this.pagelist = pagelist;
	}
	
	//��ǰҳ��
	public int getCurrentPageNo() {
		return currentPageNo;
	}
	public void setCurrentPageNo(int currentPageNo) {
		if (currentPageNo>0) {
			this.currentPageNo = currentPageNo;
		}
		
	}
		
	//��¼������
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		if (totalCount>=0) {
			this.totalCount = totalCount;
		}
	}
	
	//ҳ������
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		if (pageSize>0) {
			this.pageSize = pageSize;
		}
		
	}
	
	//��ҳ��
	public int getTotalPageCount() {
		return totalPageCount;
	}
	public void setTotalPageCount() {
		if (this.totalCount%this.pageSize==0) {
			this.totalPageCount = this.totalCount/this.pageSize;
		}else if (this.totalCount%this.pageSize!=0) {
			this.totalPageCount = this.totalCount/this.pageSize+1;
		}else {
			this.totalPageCount = 0;
		}
	}
	
}

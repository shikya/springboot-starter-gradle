package com.springapp.beans;

public class PaginationResponse<T> {
	int totalSize;
	int sizePerPage;
	int pageNumber;
	int totalPages;
	T data;
	public int getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}
	public int getSizePerPage() {
		return sizePerPage;
	}
	public void setSizePerPage(int sizePerPage) {
		this.sizePerPage = sizePerPage;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PaginationResponse [totalSize=").append(totalSize).append(", sizePerPage=").append(sizePerPage)
				.append(", pageNumber=").append(pageNumber).append(", totalPages=").append(totalPages).append(", data=")
				.append(data).append("]");
		return builder.toString();
	}
}

package com.springapp.beans;

public class GenericResponse<T> {
	String message;
	T body;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getBody() {
		return body;
	}
	public void setBody(T body) {
		this.body = body;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GenericResponse [message=").append(message).append(", body=").append(body).append("]");
		return builder.toString();
	}
}

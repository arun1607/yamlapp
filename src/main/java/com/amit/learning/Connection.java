package com.amit.learning;

public final class Connection {
	private String url;
	private int poolSize;

	public String getUrl() {
		return url;
	}

	public void setUrl(final String url) {
		this.url = url;
	}

	public int getPoolSize() {
		return poolSize;
	}

	public void setPoolSize(final int poolSize) {
		this.poolSize = poolSize;
	}

	@Override
	public String toString() {
		return String.format("'%s' with pool of %d", getUrl(), getPoolSize());
	}

}

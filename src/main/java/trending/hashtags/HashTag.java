package trending.hashtags;

public class HashTag implements Comparable<HashTag> {
	private String id;
	private long trend;

	public HashTag(String id, int trend) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.trend = trend;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getTrend() {
		return trend;
	}

	public void setTrend(long trend) {
		this.trend = trend;
	}

	public int compareTo(HashTag tag1) {
		return (int) (this.trend - tag1.getTrend());
	}

	public String toString() {
		return this.id;
	}
}

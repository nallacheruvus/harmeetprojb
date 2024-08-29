package co.sa.cl;

public class Books {
	private int bid;
	private String bname;
	private String bauth;

	public Books() {
		// TODO Auto-generated constructor stub
	}

	public Books(int a, String b, String c) {
		this.bid = a;
		this.bname = b;
		this.bauth = c;

	}

	@Override
	public String toString() {
		return String.format("Id:%s\nName:%s\nAuthor:%s\n", "" + this.bid, this.bname, this.bauth);
	}
}

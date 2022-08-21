package inheritanceexample;

public class Player {
	private int jerseyno;
	private String playername;
	private String location;
	public Player()
	{
		
	}
	public Player(int jerseyno,String playername,String location)
	{
		this.jerseyno=jerseyno;
		this.playername=playername;
		this.location=location;
	}
	public int getJerseyno() {
		return jerseyno;
	}
	public void setJerseyno(int jerseyno) {
		this.jerseyno = jerseyno;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Player [jerseyno=" + jerseyno + ", playername=" + playername + ", location=" + location + "]";
	}
	

}

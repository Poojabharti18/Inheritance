package inheritanceexample;

public class Batsman extends Player
{
private int centuries;
private int halfcenturies;
private int strikeRate;
private int fours;
private int six;
public Batsman()
{
	
}
public Batsman(int jerseyno,String playername,String location,int centuries,int halfcenturies,int strikeRate,int fours,int six)
{
	super(jerseyno,playername,location);
	this.centuries=centuries;
	this.halfcenturies=halfcenturies;
	this.strikeRate=strikeRate;
	this.fours=fours;
	this.six=six;
}
public int getCenturies() {
	return centuries;
}
public void setCenturies(int centuries) {
	this.centuries = centuries;
}
public int getHalfcenturies() {
	return halfcenturies;
}
public void setHalfcenturies(int halfcenturies) {
	this.halfcenturies = halfcenturies;
}
public int getStrikeRate() {
	return strikeRate;
}
public void setStrikeRate(int strikeRate) {
	this.strikeRate = strikeRate;
}
public int getFours() {
	return fours;
}
public void setFours(int fours) {
	this.fours = fours;
}
public int getSix() {
	return six;
}
public void setSix(int six) {
	this.six = six;
}
@Override
public String toString() {
	return super.toString()+"Batsman [centuries=" + centuries + ", halfcenturies=" + halfcenturies + ", strikeRate=" + strikeRate
			+ ", fours=" + fours + ", six=" + six + "]";
}

}

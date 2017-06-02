package SoccerTable;
public class test {
	private String name;
	private int wins;
	private int draws;
	private int loss;
	private int gf;
	private int ga;
	private int pts;
	public test(String name, int wins, int draws, int loss, int gf, int ga, int pts){
		this.name = name;
		this.setWins(wins);
		this.setDraws(draws);
		this.setLoss(loss);
		this.setGf(gf);
		this.setGa(ga);
		this.pts = pts;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLoss() {
		return loss;
	}
	public void setLoss(int loss) {
		this.loss = loss;
	}
	public int getDraws() {
		return draws;
	}
	public void setDraws(int draws) {
		this.draws = draws;
	}
	public int getGf() {
		return gf;
	}
	public void setGf(int gf) {
		this.gf = gf;
	}
	public int getGa() {
		return ga;
	}
	public void setGa(int ga) {
		this.ga = ga;
	}
	public int getPts(){
		return pts;
	}
	public void setPts(int pts){
		this.pts = pts;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}

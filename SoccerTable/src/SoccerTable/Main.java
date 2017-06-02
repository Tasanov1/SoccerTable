package SoccerTable;
//author - Tasanov Alisher
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String [] args) throws IOException{
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(new FileReader("text.txt"));
        PrintWriter ou = new PrintWriter(new FileWriter("Weeks.txt"));
        PrintWriter ot = new PrintWriter(new FileWriter("FinalTable.txt"));
        Random rnd = new Random();
        System.out.println("GO?");
        String start = in.next();
        if(!start.equals("y") && !start.equals("Y")){
        	System.out.println("bye-bye :(");
        	return;
        }
        test[] t  = new test[12];
        int [][] game = {{-1,11,10,9,8,7,6,5,4,3,2,1},{11,-1,9,8,7,6,5,4,3,2,1,10},{10,9,-1,7,6,5,4,3,2,1,8,11},{9,8,7,-1,5,4,3,2,1,10,11,6},{8,7,6,5,-1,3,2,1,10,11,4,9},{7,6,5,4,3,-1,1,10,11,8,9,2},{6,5,4,3,2,1,-1,11,9,7,10,8},{5,4,3,2,1,10,11,-1,8,9,6,7},{4,3,2,1,10,11,9,8,-1,6,7,5},{3,2,1,10,11,8,7,9,6,-1,5,4},{2,1,8,11,4,9,10,6,7,5,-1,3},{1,10,11,6,9,2,8,7,5,4,3,-1}};
        String [] a = new String [12];  
        for(int i=0; i<12; i++){
        	a[i] = sc.next();
        }
        for(int i=0; i<12; i++){
        	t[i]=new test(a[i],0,0,0,0,0,0);
        }
        int week = 1;
        while(week<12){
        	ou.println("Week " + week + ":");
            int n, m;
            int r; 
            for(int i=0; i<12; i++){
                for(int j=i+1; j<12; j++){
                    if(game[i][j]==week){
/* ---------------------------------------------------------------------------------------------------------------*/
                    	r = rnd .nextInt(100);
                    	//1столб
                    	if(r<7.2){
                			n = 0;
                			m = 0;
                		}
                		else if(r<17){
                			n = 1;
                			m = 0;
                		}
                		else if(r<25.1){
                			n = 2;
                			m = 0;
                		}
                		else if(r<29.9){
                			n = 3;
                			m = 0;
                		}
                		else if(r<32.2){
                			n = 4;
                			m = 0;
                		}
                		else if(r<33.2){
                			n = 5;
                			m = 0;
                		}
                		else if(r<33.6){
                			n = 6;
                			m = 0;
                		}
                		else if(r<33.8){
                			n = 7;
                			m = 0;
                		}
                    	
                		//2 столб
                		else if(r<40.1){
                			n = 0;
                			m = 1;
                		}
                		else if(r<51.7){
                			n = 1;
                			m = 1;
                		}
                		else if(r<60.6){
                			n = 2;
                			m = 1;
                		}
                		else if(r<65.8){
                			n = 3;
                			m = 1;
                		}
                		else if(r<68.3){
                			n = 4;
                			m = 1;
                		}
                		else if(r<69.4){
                			n = 5; 
                			m = 1;
                		}
                		else if(r<69.8){
                			n = 6;
                			m = 1;
                		}
                		else if(r<70){
                			n = 7;
                			m = 1;
                		}
                    	
                		//3 столб
                		else if(r<73.4){
                			n = 0;
                			m = 2;
                		}
                		else if(r<79){
                			n = 1;
                			m = 2;
                		}
                		else if(r<84.2){
                			n = 2;
                			m = 2;
                		}
                		else if(r<87){
                			n = 3;
                			m = 2;
                		}
                		else if(r<88.4){
                			n = 4;
                			m = 2;
                		}
                		else if(r<89){
                			n = 5;
                			m = 2;
                		}
                		else if(r<89.2){
                			n = 6;
                			m = 2;
                		}
                		else if(r<89.3){
                			n = 7;
                			m = 2;
                		}
                		
                		//4 столб
                		else if(r<90.7){
                			n = 0;
                			m = 3;
                		}
                		else if(r<93){
                			n = 1;
                			m = 3;
                		}
                		else if(r<94.8){
                			n = 2;
                			m = 3;
                		}
                		else if(r<95.9){
                			n = 3;
                			m = 3;
                		}
                		else if(r<96.4){
                			n = 4;
                			m = 3;
                		}
                		else if(r<96.6){
                			n = 5;
                			m = 3;
                		}
                		else if(r<96.7){
                			n = 6;
                			m = 3;
                		}
                		else if(r<96.715){
                			n = 7;
                			m = 3;
                		}
                    	
                		//5 столб
                		else if(r<97.115){
                			n = 0;
                			m = 4;
                		}
                		else if(r<97.815){
                			n = 1;
                			m = 4;
                		}
                		else if(r<98.415){
                			n = 2;
                			m = 4;
                		}
                		else if(r<98.715){
                			n = 3;
                			m = 4;
                		}
                		else if(r<98.915){
                			n = 4;
                			m = 4;
                		}
                		else if(r<99.015){
                			n = 5;
                			m = 4;
                		}
                		else if(r<99.03){
                			n = 6;
                			m = 4;
                		}
                		else if(r<99.045){
                			n = 7;
                			m = 4;
                		}
                		
                		//6столб
                		else if(r<99.145){
                			n = 0;
                			m = 5;
                		}
                		else if(r<99.345){
                			n = 1;
                			m = 5;
                		}
                		else if(r<99.545){
                			n = 2;
                			m = 5;
                		}
                		else if(r<99.645){
                			n = 3;
                			m = 5;
                		}
                		else if(r<99.66){
                			n = 4;
                			m = 5;
                		}
                		else if(r<99.675){
                			n = 5;
                			m = 5;
                		}
                		else if(r<99.69){
                			n = 6;
                			m = 5;
                		}
                		else if(r<99.705){
                			n = 7;
                			m = 5;
                		}
                		//конец 6 столбца 99.705 
                		
                		//7столб
                		else if(r<99.72){
                			n = 0;
                			m = 6;
                		}
                		else if(r<99.82){
                			n = 1;
                			m = 6;
                		}
                		else if(r<99.835){
                			n = 2;
                			m = 6;
                		}
                		else if(r<99.85){
                			n = 3;
                			m = 6;
                		}
                		else if(r<99.865){
                			n = 4;
                			m = 6;
                		}
                		else if(r<99.88){
                			n = 5;
                			m = 6;
                		}
                		else if(r<99.895){
                			n = 6;
                			m = 6;
                		}
                		else if(r<99.91){
                			n = 7;
                			m = 6;
                		}
           
                		//8 столб
                		else if(r<99.925){
                			n = 0;
                			m = 7;
                		}
                		else if(r<99.94){
                			n = 1;
                			m = 7;
                		}
                		else if(r<99.955){
                			n = 2;
                			m = 7;
                		}
                		else if(r<99.97){
                			n = 3;
                			m = 7;
                		}
                		else if(r<99.985){
                			n = 4;
                			m = 7;
                		}
                		else {
                			n = 5;
                			m = 7;
                		}
                   
/* ---------------------------------------------------------------------------------------------------------------*/
                        ou.println(a[i] + " " + n + "-" + m + " " + a[j]);
                        if(n>m){
                        	t[i].setWins(t[i].getWins() + 1);
                        	t[j].setLoss(t[j].getLoss() + 1);
                        }
                        else if(n<m){
                        	t[j].setWins(t[j].getWins() + 1);
                        	t[i].setLoss(t[i].getLoss() + 1);
                        }
                        else if(n==m){
                        	t[i].setDraws(t[i].getDraws() + 1);
                        }
                        t[i].setGf(t[i].getGf() + n);
                        t[j].setGf(t[j].getGf() + m);
                        t[i].setGa(t[i].getGa() + m);
                        t[j].setGa(t[j].getGa() + n);
                    }
                }
            }
            week++;
            ou.println(" ");
        }
        for(int i=0; i<12; i++){
        	for(int j=0; j<12; j++){
        		t[i].setPts(3*t[i].getWins()+1*t[i].getDraws());
        		t[j].setPts(3*t[j].getWins()+1*t[j].getDraws());
        		 if(t[i].getPts()>t[j].getPts())
                 {
        			 test ozger=t[j];
        			 t[j]=t[i];
        			 t[i]=ozger;
                 }
        		 
        		 else if(t[i].getPts() == t[j].getPts() && t[i].getWins() > t[j].getWins())
                 {
        			 test ozger=t[j];
        			 t[j]=t[i];
        			 t[i]=ozger;
                 }
        		 
        		 
                 else if(t[i].getPts() == t[j].getPts() && t[i].getWins() == t[j].getWins() && (t[i].getGf()-t[i].getGa()) > (t[j].getGf()-t[j].getGa()))
                 {
                	 test ozger=t[j];
                	 t[j]=t[i];
                	 t[i]=ozger;
                 }
        		 
                 else if(t[i].getPts() == t[j].getPts() && t[i].getWins() == t[j].getWins() && (t[i].getGf()-t[i].getGa()) == (t[j].getGf()-t[j].getGa()) && t[i].getGf()>t[j].getGf())
                 {
                	 test ozger=t[j];
                	 t[j]=t[i];
                	 t[i]=ozger;
                 }
        	}
        }
        ot.println("Final Table:");
        ot.println("#  Team   W D L GF GA GD PTS");
        for(int i=0; i<12; i++){
        		ot.println(i+1 + " " + t[i].getName() + " " +  t[i].getWins() +" " +  t[i].getDraws() + " " + t[i].getLoss() + " " + t[i].getGf() + " " + t[i].getGa() + " " + (t[i].getGf()-t[i].getGa()) + " " + t[i].getPts());
        }
        
        ou.flush();
        ot.flush();
    }
}
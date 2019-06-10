import java.util.ArrayList;

public class Simulation {
	
	private ArrayList<GameField> fields = new ArrayList<GameField>();
	private ArrayList<Peg> p1Field = new ArrayList<Peg>();
	private ArrayList<Peg> p2Field = new ArrayList<Peg>();
	private ArrayList<Peg> p3Field = new ArrayList<Peg>();
	private ArrayList<Peg> p4Field = new ArrayList<Peg>();
	private ArrayList<Peg> p5Field = new ArrayList<Peg>();
	private ArrayList<Peg> p6Field = new ArrayList<Peg>();
	
	
	public void initialize() {
		
		int k = 1;
		for(int i = 0; i<13; i++) {
			for(int j= 0; j<17; j++) {
		
				if((k<=6) ||((k>=8) & (k<=18)) || ((k>=21)& (k<=31)) || ((k>=35)& (k<=43)) || ((k>=48)& (k<=52)) ||
				   ((k>=78) & (k<=79)) || ((k>=91)& (k<=92)) || ((k>=103)& (k<=106)) || ((k>=116)& (k<=118)) ||
				   ((k>=129) & (k<=131)) || (k==143) || (k==156) || ((k>=170)& (k<=173)) || ((k>=178)& (k<=187)) ||
				   ((k>=191) & (k<=200)) || ((k>=203)& (k<=214)) || ((k>=216)& (k<=221))) {
		          GameField gameField = new GameField(0,false);
		          fields.add(gameField);
		          
		           k++;
				}else {
					GameField gameField = new GameField(k,true);
					fields.add(gameField);
					k++;
				}
		}
	  }// filled matrix
	
		/*	
		k=0;
		for(int i = 0; i<17; i++) {
			for(int j= 0; j<13; j++) {
				System.out.print(fields.get(k).getLocationNumber());
				System.out.print("   ");
				k++;
			}
			System.out.println();
		}//print the board
	
		*/
		
		//initialize the color blocks
		Peg pegRed1 = new Peg(Color.RED,7);
		p1Field.add(pegRed1);
		Peg pegRed2 = new Peg(Color.RED,19);
		p1Field.add(pegRed2);
		Peg pegRed3 = new Peg(Color.RED,20);
		p1Field.add(pegRed3);
		Peg pegRed4 = new Peg(Color.RED,32);
		p1Field.add(pegRed4);
		Peg pegRed5 = new Peg(Color.RED,33);
		p1Field.add(pegRed5);
		Peg pegRed6 = new Peg(Color.RED,34);
		p1Field.add(pegRed6);
		Peg pegRed7 = new Peg(Color.RED,44);
		p1Field.add(pegRed7);
		Peg pegRed8 = new Peg(Color.RED,45);
		p1Field.add(pegRed8);
		Peg pegRed9 = new Peg(Color.RED,46);
		p1Field.add(pegRed9);
		Peg pegRed10 = new Peg(Color.RED,47);
		p1Field.add(pegRed10);
		
		Peg pegPINK1 = new Peg(Color.PINK,62);
		p2Field.add(pegPINK1);
		Peg pegPINK2 = new Peg(Color.PINK,63);
		p2Field.add(pegPINK2);
		Peg pegPINK3 = new Peg(Color.PINK,64);
		p2Field.add(pegPINK3);
		Peg pegPINK4 = new Peg(Color.PINK,65);
		p2Field.add(pegPINK4);
		Peg pegPINK5 = new Peg(Color.PINK,75);
		p2Field.add(pegPINK5);
		Peg pegPINK6 = new Peg(Color.PINK,76);
		p2Field.add(pegPINK6);
		Peg pegPINK7 = new Peg(Color.PINK,77);
		p2Field.add(pegPINK7);
		Peg pegPINK8 = new Peg(Color.PINK,89);
		p2Field.add(pegPINK8);
		Peg pegPINK9 = new Peg(Color.PINK,90);
		p2Field.add(pegPINK9);
		Peg pegPINK10 = new Peg(Color.PINK,102);
		p2Field.add(pegPINK10);
		
		Peg pegYELLOW1 = new Peg(Color.YELLOW,128);
		p3Field.add(pegYELLOW1);
		Peg pegYELLOW2 = new Peg(Color.YELLOW,141);
		p3Field.add(pegYELLOW2);
		Peg pegYELLOW3 = new Peg(Color.YELLOW,142);
		p3Field.add(pegYELLOW3);
		Peg pegYELLOW4 = new Peg(Color.YELLOW,153);
		p3Field.add(pegYELLOW4);
		Peg pegYELLOW5 = new Peg(Color.YELLOW,154);
		p3Field.add(pegYELLOW5);
		Peg pegYELLOW6 = new Peg(Color.YELLOW,155);
		p3Field.add(pegYELLOW6);
		Peg pegYELLOW7 = new Peg(Color.YELLOW,166);
		p3Field.add(pegYELLOW7);
		Peg pegYELLOW8 = new Peg(Color.YELLOW,167);
		p3Field.add(pegYELLOW8);
		Peg pegYELLOW9 = new Peg(Color.YELLOW,168);
		p3Field.add(pegYELLOW9);
		Peg pegYELLOW10 = new Peg(Color.YELLOW,169);
		p3Field.add(pegYELLOW10);
		
		Peg pegORANGE1 = new Peg(Color.ORANGE,174);
		p4Field.add(pegORANGE1);
		Peg pegORANGE2 = new Peg(Color.ORANGE,175);
		p4Field.add(pegORANGE2);
		Peg pegORANGE3 = new Peg(Color.ORANGE,176);
		p4Field.add(pegORANGE3);
		Peg pegORANGE4 = new Peg(Color.ORANGE,177);
		p4Field.add(pegORANGE4);
		Peg pegORANGE5 = new Peg(Color.ORANGE,188);
		p4Field.add(pegORANGE5);
		Peg pegORANGE6 = new Peg(Color.ORANGE,189);
		p4Field.add(pegORANGE6);
		Peg pegORANGE7 = new Peg(Color.ORANGE,190);
		p4Field.add(pegORANGE7);
		Peg pegORANGE8 = new Peg(Color.ORANGE,201);
		p4Field.add(pegORANGE8);
		Peg pegORANGE9 = new Peg(Color.ORANGE,202);
		p4Field.add(pegORANGE9);
		Peg pegORANGE10 = new Peg(Color.ORANGE,215);
		p4Field.add(pegORANGE10);
		
		Peg pegGREEN1 = new Peg(Color.GREEN,119);
		p5Field.add(pegGREEN1);
		Peg pegGREEN2 = new Peg(Color.GREEN,132);
		p5Field.add(pegGREEN2);
		Peg pegGREEN3 = new Peg(Color.GREEN,133);
		p5Field.add(pegGREEN3);
		Peg pegGREEN4 = new Peg(Color.GREEN,144);
		p5Field.add(pegGREEN4);
		Peg pegGREEN5 = new Peg(Color.GREEN,145);
		p5Field.add(pegGREEN5);
		Peg pegGREEN6 = new Peg(Color.GREEN,146);
		p5Field.add(pegGREEN6);
		Peg pegGREEN7 = new Peg(Color.GREEN,157);
		p5Field.add(pegGREEN7);
		Peg pegGREEN8 = new Peg(Color.GREEN,158);
		p5Field.add(pegGREEN8);
		Peg pegGREEN9 = new Peg(Color.GREEN,159);
		p5Field.add(pegGREEN9);
		Peg pegGREEN10 = new Peg(Color.GREEN,160);
		p5Field.add(pegGREEN10);
		
		Peg pegBLUE1 = new Peg(Color.BLUE,53);
		p6Field.add(pegBLUE1);
		Peg pegBLUE2 = new Peg(Color.BLUE,54);
		p6Field.add(pegBLUE2);
		Peg pegBLUE3 = new Peg(Color.BLUE,55);
		p6Field.add(pegBLUE3);
		Peg pegBLUE4 = new Peg(Color.BLUE,56);
		p6Field.add(pegBLUE4);
		Peg pegBLUE5 = new Peg(Color.BLUE,66);
		p6Field.add(pegBLUE5);
		Peg pegBLUE6 = new Peg(Color.BLUE,67);
		p6Field.add(pegBLUE6);
		Peg pegBLUE7 = new Peg(Color.BLUE,68);
		p6Field.add(pegBLUE7);
		Peg pegBLUE8 = new Peg(Color.BLUE,80);
		p6Field.add(pegBLUE8);
		Peg pegBLUE9 = new Peg(Color.BLUE,81);
		p6Field.add(pegBLUE9);
		Peg pegBLUE10 = new Peg(Color.BLUE,93);
		p6Field.add(pegBLUE10);
		
	}




}

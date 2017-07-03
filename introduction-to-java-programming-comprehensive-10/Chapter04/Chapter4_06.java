public class Main {
    public static void main(String[] args) {
    
    double Ax,Ay,Bx,By,Cx,Cy;
	  int random;
  	int radius = 40;
  	
  	//get random points for point A on circle  
	random = (int) (Math.random() * 359);
	System.out.println(" \u2220 A = " + random + (char)176);

	Ax = radius * Math.cos( Math.toRadians(random) );
	Ay = radius * Math.sin( Math.toRadians(random) );
	
  	//get random points for point A on circle  
	random = (int) (Math.random() * 359);
	System.out.println(" \u2220 B = " + random + (char)176);

	Bx = radius * Math.cos( Math.toRadians(random) );
	By = radius * Math.sin( Math.toRadians(random) );
	
  	//get random points for point A on circle 
	random = (int) (Math.random() * 359);
	System.out.println(" \u2220 C = " + random + (char)176);

	Cx = radius * Math.cos( Math.toRadians(random) );
	Cy = radius * Math.sin( Math.toRadians(random) );
	
	System.out.println(" Ax: " + Ax + "\n Ay: " + Ay + "\n Bx: " + Bx + "\n By: " + By + "\n Cx: " + Cx + "\n Cy: " + Cy);
  }
}

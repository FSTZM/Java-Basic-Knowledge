package p2_reflectTest;

public class mainBoard {
	
	public void run(){
		System.out.println("mainBoard run");
	}
	
	
	public void usePCI(PCI p){
		if(p!=null){
			p.open();
			p.close();
		}
			
	}

}

void printOwing() {
  		printBanner();
  		
  		// calculate outstanding
 		outstanding = calculateOutstanding(e, outstanding);
 		
 		// print details
 		printDetail(outstanding);
 	}
 
 	public double calculateOutstanding(Enumeration<E> e, double outstanding) {
  		while(e.hasMoreElements()){
  			Order each = (Order) e.nextElement();
  			outstanding += each.getAmount();
  		}
 		
 		// print details
 		printDetail(outstanding);
 		return outstanding;
  	}
  
  	public void printDetail(double outstanding) {
   private void printBanner() {
  	}
  
  }

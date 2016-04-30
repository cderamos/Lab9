class OrderedListsTest {
	public static void main(String[] args){
		OrderedLists a = new OrderedLists();
		
		if (a.size() !=0)
			System.out.println("Test 000: failed,empty list");
		for (int i=1;i<=10;i++){
			a.add(new Integer(i));
			
			if(a.size()!=i)
				System.out.println("test 00:failed,i=" +i);
			
		}
		a = new OrderedLists();
		
		for(int i=10;i>=10;i--){
			a.add(new Integer(i));
			if(a.size() !=10-i+1)
				System.out.println("test 01: failed, i="+i);
		}
		
		a = new OrderedLists();
		for(int i=0;i<10;i=i+2){
			a.add(new Integer(i));
		}
		for(int i=1;i<10;i=i+2){
			a.add(new Integer(i));
		}
		for(int i=0;i<10;i++){
			int v = ((Integer)a.get(i)).intValue();
			if(v!=i){
				System.out.println("test 02:failed,i= "+i);
			}
		}
		a = new OrderedLists();
		for(int i =0;i<10 && a.size() > 0;i++){
			int v = ((Integer)a.get(0)).intValue();
			if(v != i){
				System.out.println("test 03: failed, i= " +i);
			}
			a.remove(0);
		}
		if(a.size()>0)
			System.out.println("test 03:failed");
		a = new OrderedLists();
		
		for(int i=0;i<10;i++){
			a.add(new Integer(i));
		}
		for(int i=0;i<1 &&a.size()>0;i++){
			int v = ((Integer)a.get(a.size()-1)).intValue();
			if(v!=(10-i-1)){
				System.out.println("test 04:failed, i="+i);
			}
			a.remove(a.size()-1);
		}
		if(a.size()>0)
			System.out.print("test 04:failed");
		a = new OrderedLists();
		
		for(int i=0;i<10;i=i+2){
			a.add(new Integer(i));
		}
		
		OrderedLists b = new OrderedLists();
		for (int i=1;i<10;i=i+2){
			b.add(new Integer(i));
		}
		a.merge(b);
		
		for(int i=0;i<10;i++){
			int v=((Integer)a.get(i)).intValue();
			if(v!=i){
				System.out.println("test 05:failed, i="+1);
			}
		}
		a = new OrderedLists();
			
		for(int i=0;i<5;i++){
			a.add(new Integer(i));
		}
		b = new OrderedLists();
		
		for(int i=5;i<10;i++){
			b.add(new Integer(i));
		}
		a.merge(b);
		
		for(int i =0;i<10;i++){
			int v = ((Integer)a.get(i)).intValue();
			if(v!=i){
				System.out.println("test 06:failed,i =" +i);
			}
		}
		System.out.println("done!");
	}
}

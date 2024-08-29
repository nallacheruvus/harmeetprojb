package co.sa.cl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class NCls {

	public static void main(String[] args) {
		//https://github.com/nallacheruvus/harmeetprojb.git
		int arr1[]= {1,2,3,4,5};
		String arr2[]= {"Ramayan","Mahabharat","Granthsahib","Shakuntalam","Kane and abel"};
		String arr3[]= {"Valmiki","Vyas","Nanak Dev","Kalidasa","Archer"};
		List<Books> lb=new ArrayList<Books>();
		int u=0;
		for(int j:arr1) {
			Books b=new Books(j,arr2[u],arr3[u]);
			u++;
			lb.add(b);
		}
		lb.forEach(new Consumer<Books>() {
			public void accept(Books t) {
				System.out.println(t.toString());
			}
		});
		
	}

}

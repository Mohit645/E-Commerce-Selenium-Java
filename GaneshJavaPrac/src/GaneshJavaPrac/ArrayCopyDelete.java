package GaneshJavaPrac;

public class ArrayCopyDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a[] = {'L', 'E', 'A', 'R', 'N', 'P','R','O','P','E','R','L','Y'};
		char update [] = new char[14];
		
		int delete = 3;
		
		System.arraycopy(a, 0, update, 0, 13);
		System.out.println(update);
		
		for(int i=0; i< a.length; i++) {
			if (delete== i) {
				System.out.println(i);
				for (int j=i+1; j<(a.length- 1);j++)
				{
					a[i] = a[j];
					i++;					
				}
				System.out.println("updated array"+new String(a));
			}
			
		}
		

	}

}

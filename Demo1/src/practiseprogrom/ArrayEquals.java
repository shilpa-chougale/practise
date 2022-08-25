package practiseprogrom;

import java.util.Arrays;

public class ArrayEquals {
public static void main(String[] args) {
	int ar1[]= {12,23,45,56,80};
	int ar2[]= {25,23,56,89};
	int ar3[]= {12,23,45,56,80};
	
	System.out.println("ar1 and ar2 equals=="+Arrays.equals(ar1, ar2));
	System.out.println("ar1 and ar3 equals=="+Arrays.equals(ar1, ar3));
	System.out.println("ar2 and ar3 equals=="+Arrays.equals(ar2, ar3));
}

}

package javaday01;

public class HelloWrold {
	public static void main(String[] args){
		for (int i = 1; i < 10; i++) {
            System.out.println();
            for (int j = 1; j < 10; j++) {
                System.out.print(j+"x"+i+"="+i*j);
            }
        }
	}
}

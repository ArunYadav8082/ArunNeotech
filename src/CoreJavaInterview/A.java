package CoreJavaInterview;

public interface A {
	
	int x = 100;
	
	void show();
	
	default void insert()
	{
		System.out.println("Default method of Interface A");
	}

}

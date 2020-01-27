class excp1{
	public static void main(String ars[])
	{
		try{
			int x=Integer.parseInt(ars[0]);
			int y=Integer.parseInt(ars[1]);
			int z=x/y;
			System.out.println("result: " +z);
			}
		catch(Exception e){
			System.out.println(e);
			}
	}
}
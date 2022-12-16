class mainclass5
{
public static void main(String[] args)
{
float[] arr=new float[16];
arr[11]=50.25f;
arr[12]=60.25f;
arr[13]=70.23f;
arr[14]=80.48f;
System.out.println("index \t values");
for(int i=11;i<arr.length;i++)
{
System.out.println(i+"\t"+arr[i]);
}
}
}

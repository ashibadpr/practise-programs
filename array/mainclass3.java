class mainclass3
{
public static void main(String[] args)
{
int[] arr=new int[16];
arr[11]=15;
arr[12]=25;
arr[13]=35;
arr[14]=45;
System.out.println("index \t values");
for(int i=11;i<arr.length;i++)
{
System.out.println(i+"\t"+arr[i]);
}
}
}

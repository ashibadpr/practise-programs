class mainclass6
{
public static void main(String[] args)
{
double[] arr=new double[16];
arr[11]=50.32;
arr[12]=60.32;
arr[13]=70.32;
arr[14]=80.32;
System.out.println("index \t values");
for(int i=11;i<arr.length;i++)
{
System.out.println(i+"\t"+arr[i]);
}
}
}

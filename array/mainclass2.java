class mainclass2
{
public static void main(String[] args)
{
short[] arr=new short[16];
arr[11]=50;
arr[12]=60;
arr[13]=70;
arr[14]=80;
System.out.println("index \t values");
for(short i=11;i<arr.length;i++)
{
System.out.println(i+"\t"+arr[i]);
}
}
}

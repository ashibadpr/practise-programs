class mainclass1
{
public static void main(String[] args)
{
byte[] arr=new byte[11];
arr[6]=1;
arr[7]=2;
arr[8]=3;
arr[9]=4;
System.out.println("index \t values");
for(byte i=6;i<arr.length;i++)
{
System.out.println(i+"\t"+arr[i]);
}
}
}

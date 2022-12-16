class mainclass9
{
public static void main(String[] args)
{
boolean[] arr=new boolean[11];
arr[6]=true;
arr[7]=false;
arr[8]=true;
arr[9]=false;
System.out.println("index \t values");
for(int i=6;i<arr.length;i++)
{
System.out.println(i+"\t"+arr[i]);
}
}
}

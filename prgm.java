import java.util.*;
public class prgm{
public static void main(String[] args){
double a=0.0,sum=0.0,equal=0.0;int i=0,j=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
double[] arr=new double[n];
String[] name=new String[n];
for(i=0;i<n;i++){
name[i]=sc.next();
sc.nextLine();
arr[i]=sc.nextDouble();
sum=sum+arr[i];
}
equal=(sum/(n*1.0));
System.out.println(equal);

double[] rec=new double[n];
double[] give=new double[n];
for(i=0;i<n;i++){
if(arr[i]>equal){
rec[i]=arr[i]-equal;
give[i]=0.0;}
else{
give[i]=equal-arr[i];
rec[i]=0.0;}
}
for(i=0;i<n;i++){
if(rec[i]==0.0)
{continue;
}
for(j=0;j<n;j++){
if(give[j]==0.0 || rec[i]==0.0){
continue;}
if(give[j]<rec[i]){
System.out.println(name[i]+" will receive Rs."+give[j]+" from "+name[j]);
rec[i]=rec[i]-give[j];
give[j]=0.0;
continue;}
if(rec[i] < give[j]){
System.out.println(name[i]+" will receive Rs. "+rec[i]+" from "+name[j]);

give[j]=give[j]-rec[i];
rec[i]=0.0;
break;}
if(give[j]==rec[i]){
System.out.println(name[i]+" will receive Rs."+rec[i]+" from "+name[j]);
rec[i]=0.0;
give[j]=0.0;
break;}
}
}
}
}
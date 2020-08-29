package 浪潮;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;

        int[] a=new int[n];
        int[] b=new int[101];
        for(int i=1;i<=100;i++) {
            b[i]=1;
        }
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
            b[a[i]]=0;
            //b[a[i]+2]=i+2;
        }
        StringBuffer sb1=new StringBuffer();
        StringBuffer sb2=new StringBuffer();
        for(int i=1;i<=100;i++) {
            if(i%2!=0) {
                if(b[i]==0) {
                    sb1.append(" ");
                }
                else {
                    if(i<10) {
                        sb1.append("00");
                        sb1.append(i);
                    }
                    else if(i<100){
                        sb1.append("0");
                        sb1.append(i);
                    }
                    else
                        sb1.append(i);
                }
            }else {
                if(b[i]==0) {
                    sb2.append(" ");
                }
                else {
                    if(i<10) {
                        sb2.append("00");
                        sb2.append(i);
                    }
                    else if(i<100){
                        sb2.append("0");
                        sb2.append(i);
                    }
                    else
                        sb2.append(i);
                }
            }
        }
        int max=0;
        String start="";
        String[] s1=sb1.toString().split(" ");
        String[] s2=sb2.toString().split(" ");
        for(int i=0;i<s1.length;i++) {
            if(max<s1[i].length()) {
                max=s1[i].length();
                start=s1[i].substring(0, 3);
            }
        }
        for(int i=0;i<s2.length;i++) {
            if(max<s2[i].length()) {
                max=s2[i].length();
                start=s2[i].substring(0, 3);
            }
        }
        System.out.println(Integer.parseInt(start)+" "+max/3);
    }

}

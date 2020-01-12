public class Solution {
    public static String toLowerCase(String str) {
        char[] A={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] a={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','Y','z'};
        char[] s=str.toCharArray();
        StringBuffer str1=new StringBuffer();
        for(int i=0;i<s.length;i++){
           for(int j=0;j<A.length;j++){
               if(s[i]==A[j]){
                   s[i]=a[j];
                   break;
               }

           }
           str1.append(s[i]);
        }


       String str2=str1.toString();
       return str2;
    }

    public static void main(String[] args) {

        System.out.println(toLowerCase("LOVELY" ));
    }
}
import java.util.Scanner;
public class Main {
            public static void main(String[] args){
                int output= countUrinals();
                System.out.println(output);
            }
            public static int countUrinals() {
                String s;
                int czero = 0, cone=0,count = 0;
                Scanner sc = new Scanner(System.in);
                System.out.println(" enter the input");
                s=sc.nextLine();
                char[] str= new char[s.length()];
                for(int i=1;i<str.length;i++) {
                    if(s.contains("11")) {
                        System.out.println("string formatting error");
                        return -1;
                    }
                }
                for(int i=0;i< s.length();i++) {
                    str[i]=s.charAt(i);
                }
                int i=0;
                while(i<str.length){
                    if(str[i]=='0')
                        czero++;
                    else {
                        count = count + (czero-cone)/2;
                        czero=0;
                        cone=1;
                    }
                    i++;

                }
                count = count + czero/2;
                return count;
            }
        }



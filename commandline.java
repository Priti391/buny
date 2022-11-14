import javax.sound.sampled.SourceDataLine;

class commandline {
    static {  //static block
    System.out.println("static block");}
public static void main(String args[]){
// int a=3;
int a=Integer.parseInt(args[0]);
// int b=1;
int b=Integer.parseInt(args[1]);
int c=a+b;
System.out.println(c);
}
}
    

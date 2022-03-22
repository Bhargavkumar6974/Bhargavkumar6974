package operators;

public class ShiftOperators {

									public static void main(String[] args) 
							    {
								
								int a=10; //1010 -->10100/101/0010 RS A0
								int b=9;  //1001 -->10010/100/0010 LS CLSB
								
								System.out.println("left shift a " +(a<<1));//  2^
								//LS=*2
								System.out.println("right shift a " +(a>>1));// q
								//RS=/2
								System.out.println("left shift b " +(b<<1));//  2^
								System.out.println("right shift a " +(b>>1));// q
								System.out.println("unsigned right shift a " +(a>>>2));//  2^
								System.out.println("unisgned right shift b " +(b>>>2));// q
								//uss c -
								
							    }
								}
							    

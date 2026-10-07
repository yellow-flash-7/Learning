// //Star Programm IN java

// class hello{
//     public static void main (String args[]){
//         int i,j;
//         for(i=1;i<=5;i++){
//             for(j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// class hello{
//     public static void main (String args[]){ 
//         for (int i=1; i<10;i++){
//             for (int j=1;j<=i;j++){ 
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//     }
// }
// class hello{
//     public static void main (String args []){
//         System.out.println("Hey Wellcome TOds");
//     }
// 

// Data type in Java - {
// byte	Small whole number	byte age = 20;
// short	Whole number	short year = 2026;
// int	Whole number	int age = 20;
// long	Large whole number	long population = 1000000000L;
// float	Decimal number	float price = 25.5f;
// double	Large decimal number	double mark = 85.5;
// char	Single character	char grade = 'A';
// boolean	True or false	boolean pass = true;
// String
// Array
// Class
// Object
// Interface
// Enum  }

// | Data type |              Size |
// | --------- | ----------------: |
// | `byte`    |            1 byte |
// | `short`   |           2 bytes |
// | `int`     |           4 bytes |
// | `long`    |           8 bytes |
// | `float`   |           4 bytes |
// | `double`  |           8 bytes |
// | `char`    |           2 bytes |
// | `boolean` |         Not fixed |
// | `String`  | **Variable size** |

import java.util.Scanner;

class Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name);
    }
}
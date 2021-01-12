package cn.edu.hcnu.ui;

import java.util.Scanner;
import java.util.UUID;

public class MainUI {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);  //接受键盘输入
        while (true){
            System.out.println("请输入相应的数字进行操作：");
            System.out.println("按1，录入航班信息");
            System.out.println("按2，显示所有航班信息");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，机票预订");
            System.out.println("按5，机票退订");
            System.out.println("按6，退出系统");

            int choice =sc.nextInt();

            if (choice == 1) {

                String id= UUID.randomUUID().toString(); /*Universally Unique Identifier,是javaJDK提供的一个自动生成主键的方法。
                全局唯一标识符,是指在一台机器上生成的数字，它保证对在同一时空中的所有机器都是唯一的，是由一个十六位的数字组成,表现出来的 形式。*/
                System.out.println("id" +id);
                System.out.print("请输入机型");
                String  planeType= sc.next();
                System.out.println("\n");
                System.out.print("请输入座位数");
                int currentSeatsNum=sc.nextInt();
                System.out.print("请输入起飞机场");
                String departureAirPort= sc.next();
                System.out.print("请输入目的机场");
                String destinationAirPort= sc.next();
                System.out.print("请输入起飞时间");
                String departureTime= sc.next();

            }

        }
    }

}

package com.micro;
import java.util.*;
public class Shitou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc=new Scanner(System.in);
		System.out.println("---��ӭ�����ȭ��Ϸ---");
		System.out.println("��ѡ����Ҫ����Ķ�����1 ʯͷ��2������3 ��");
		int a=sc.nextInt();
		switch(a){
			case 1:System.out.println("ʯͷ");break;
			case 2:System.out.println("����");break;
			case 3:System.out.println("��");break;
		}
		int b=(int)(Math.random()*3+1);
		switch(b){
			case 1:System.out.println("ʯͷ");break;
			case 2:System.out.println("����");break;
			case 3:System.out.println("��");break;
		}
		if(a==b){
			System.out.println("ƽ��");
		}else if(a>b&&a!=2){
			System.out.println("��Ӯ�ˣ�");
		}else if(a<b&&a!=1){
			System.out.println("��Ӯ�ˣ�");
		}else if(a<b&&a!=3){
			System.out.println("��Ӯ�ˣ�");
		}else{
			System.out.println("���ź��������ˣ�");
		}
	
		
	}

}

package com.project.accessmodifier1;

import com.project.accessmodifier.Train;

public class Tester1 extends Train  {
public static void main(String[] args) {
	Train train=new Train();
	train.name="Jan shatabdi";
	train.id=101;
	train.color="Blue";
	System.out.println(train.name);
	System.out.println(train.id);
	System.out.println(train.color);
	
}
}

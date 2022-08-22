package com.project.typecastingdemo;

public class ExplicitTypeCasting {
	public static void main(String[] args) {
		//it is done by programmer
		short shortValue=140;//16 bits
		byte byteValue=(byte)shortValue;//8 bits
		int intValue=250;//32 bits
		short shortValue1=(short)intValue;
		long longValue=54534l;//64 bits
		int intValue2=(int) longValue;//32 bits
		double doubleValue=343434.45d;//64 bits
		float floatValue=(float) doubleValue;
		
		
		System.out.println("Converting short into Byte: "+byteValue);
		System.out.println("Converting int to Short: "+shortValue1);
		System.out.println("Converting long into int: "+intValue2);
		System.out.println("Converting double into float: "+floatValue);
	}

}

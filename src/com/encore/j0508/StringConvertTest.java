package com.encore.j0508;

public class StringConvertTest {
   public void convert1() {
	   String s1="�츮����";
	   String s2="���ѹα�����!!";
	   s1=s1+s2;
	   /*
	    StringŬ����: ����(����)���ڿ�!!
	    1. StringŬ���� ��ü ����
	    2. ���ڿ���ȯ�� ���ؼ� �ӽ÷� StringBufferŬ���� ��ü����
	    3. append()�޼ҵ� ȣ��
	    4. StringBuffer��ü�� String��ü�� ��ȯ
	    5. �ӽû����� StringBuffer��ü�� �Ҹ�.	     
	    */
	   System.out.println(s1);
   }
   public void convert2() {
	   StringBuffer s1 = new StringBuffer("�츮����");
	   s1.append("���ѹα�����!!");
	   /*
	     StringBufferŬ����: ����(����)���ڿ�!!
	     1. StringBufferŬ���� ��ü ����
	     2. append()�޼ҵ� ����.
	    */
   }
   
   public static void main(String[] args) {
	  StringConvertTest sct = new StringConvertTest();
	    sct.convert1();
   }
}
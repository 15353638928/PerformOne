package com.dh.mar.thirteen;

/**
 * ���͸���
 * 1.�������෺��-->����Ϊ����
 * 2.���������෺��-->���ఴ��ʵ��
 * 
 * 
 * ���Լ���������-->��λ�ö��� ���������������ӣ�
 * ������д����������-->�游�����
 * ������������������-->���������
 * ������ʹ�ø��������-->�游�����
 * ������ʹ���Լ�������-->���������
 * @author admin-DH
 *
 * @param <T1>
 * @param <T2>
 */
public abstract class Father<T1,T2> {
	T1 age;
	public abstract void test(T2 name);
}
//����-->��������
//ȫ������
class C1<T1,T2> extends Father<T1, T2>{

	@Override
	public void test(T2 name) {
		// TODO Auto-generated method stub
		
	}}
//���ֱ���
class C2<T2> extends Father<Integer,T2>{

	@Override
	public void test(T2 name) {
		// TODO Auto-generated method stub
		
	}}
//������-->����ʵ��
//��������
class C3<A,B> extends Father<Integer,String>{

	@Override
	public void test(String name) {
		// TODO Auto-generated method stub
		
	}}
//û������  ������object��
class C4 extends Father{

	@Override
	public void test(Object name) {
		// TODO Auto-generated method stub
		
	}}

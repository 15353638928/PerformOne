package com.dh.mar.thirteen;
/**
 * ���ͽӿ� �� ������ ͬ�� 
 * @author admin-DH
 *
 * @param <T>
 */
public interface CompareT<T> {
	//�ӿ�ֻ�������󷽷���ȫ�ֳ���
	public static final int MAX_VALUE=0;
	//�������󷽷�
	public abstract void test(T t);
}
class InterC1<A> implements CompareT{
/**����:���Ͳ�����ָ�ڼ̳�(ʵ��)��ʹ��ʱû��ָ�����������
 * �ص㣺һ������֮��Object������Ȼ���ھ��棬����Object����ȥ��
 * ��������д�������㡣����ȫ����Object�����벻�����ͼ�飩
 * ����InterC1<A> ʵ��CompareT �ӿ�
 */
	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		
	}
}
class InterC2<A> implements CompareT<Integer>{

	@Override
	public void test(Integer t) {
		// TODO Auto-generated method stub
		
	}
}
class interC3<T,A> implements CompareT<T>{

	@Override
	public void test(T t) {
		// TODO Auto-generated method stub
		
	}
}

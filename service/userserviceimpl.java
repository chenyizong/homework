package service;

import java.util.ArrayList;
import java.util.List;

import dataservice.userdataservice;
import po.UserPo;
import vo.OrderVo;

public class userserviceimpl implements userservice{
	private userdataservice userdaser;
	public userserviceimpl(int userId){
		
	}

	@Override
	public int getcredit() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public List<OrderVo> getAllOrders(int userId) {
		// TODO Auto-generated method stub
		OrderVo x=new OrderVo(1,"��ִ�ж���","���","08/08","08/09",100);
		OrderVo y=new OrderVo(1,"δִ�ж���","��ͥ","09/08","08/09",100);
		OrderVo z=new OrderVo(1,"�쳣����","���а�","06/08","08/09",100);
		OrderVo u=new OrderVo(1,"�ѳ�������","���ֺ�̩","07/08","08/09",200);
		ArrayList<OrderVo> l=new ArrayList<OrderVo>();
		l.add(x);
		l.add(y);
		l.add(z);
		l.add(u);
		return l;
	}

	@Override
	public List<OrderVo> getUnfinishedOrders(int userId) {
		// TODO Auto-generated method stub
		OrderVo x=new OrderVo(1,"δִ�ж���","��ͥ","09/08","08/09",100);
		ArrayList<OrderVo> l=new ArrayList<OrderVo>();
		l.add(x);
		return l;
	}

	@Override
	public List<OrderVo> getFinishedOrders(int userId) {
		// TODO Auto-generated method stub
		OrderVo x=new OrderVo(1,"��ִ�ж���","���","08/08","08/09",100);
		ArrayList<OrderVo> l=new ArrayList<OrderVo>();
		l.add(x);
		return l;
	}

	@Override
	public List<OrderVo> getAbnormalOrders(int userId) {
		// TODO Auto-generated method stub
		OrderVo x=new OrderVo(1,"�쳣����","���а�","06/08","08/09",100);
		ArrayList<OrderVo> l=new ArrayList<OrderVo>();
		l.add(x);
		return l;
	}
	public List<OrderVo> getCancelOrders(int userId) {
		// TODO Auto-generated method stub
		OrderVo x=new OrderVo(1,"�ѳ�������","���ֺ�̩","07/08","08/09",200);
		ArrayList<OrderVo> l=new ArrayList<OrderVo>();
		l.add(x);
		return l;
	}

	@Override
	public int getOrderUser(int orderId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getOrderPrice(int orderId) {
		// TODO Auto-generated method stub
		return 0;
	}

}

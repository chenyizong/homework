package service;

import java.util.List;

import vo.OrderVo;

public interface userservice {
	
public int getcredit();
/**
 * @param userId
 * @return	��ȡ�û����ж����б�
 */
public   List<OrderVo> getAllOrders(int userId);
/**
 * @param userId
 * @return	��ȡ�û�δִ�ж����б�
 */
public List<OrderVo> getUnfinishedOrders(int userId);

/**
 * @param userId
 * @return	��ȡ�û���ִ�ж����б�
 */
public List<OrderVo> getFinishedOrders(int userId);

/**
 * @param userId
 * @return	��ȡ�û��쳣�����б�
 */
public List<OrderVo> getAbnormalOrders(int userId);
/**
 * @param userId
 * @return	��ȡ�û��ѳ��������б�
 */
public List<OrderVo> getCancelOrders(int userId);

/**
 * @param orderId
 * @return	��ȡ�����û����
 */
public int getOrderUser(int orderId);

/**
 * @param orderId
 * @return	��ȡ������ֵ
 */
public int getOrderPrice(int orderId);

}

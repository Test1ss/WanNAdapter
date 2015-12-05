package com.adapter.adpter;

import java.util.List;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * @author landptf ������Adapter List������
 */
public abstract class AdapterM<T> extends BaseAdapter {
	private Context context;
	// Ϊ�ḻ�����ܣ��ṩ�����ֳ�������������
	private List<T> dataList = null;// ����ԴList<T>
	private T[] dataArray = null;// ����ԴT[]
	// �����ļ�ID
	private int layoutId;

	/**
	 * ���췽��
	 * 
	 * @param context
	 * @param layoutId
	 * @param dataList
	 */
	public AdapterM(Context context, int layoutId, List<T> dataList) {
		this.context = context;
		this.dataList = dataList;
		this.layoutId = layoutId;
	}

	/**
	 * ���췽��(����һ��ֻ������Դ��ͬ)
	 * 
	 * @param context
	 * @param layoutId
	 * @param dataArray
	 */
	public AdapterM(Context context, int layoutId, T[] dataArray) {
		this.context = context;
		this.dataArray = dataArray;
		this.layoutId = layoutId;
	}

	@Override
	public int getCount() {
		if (dataList != null) {
			return dataList.size();
		} else {
			return dataArray.length;
		}
	}

	@Override
	public T getItem(int position) {
		if (dataList != null) {
			return dataList.get(position);
		} else {
			return dataArray[position];
		}
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolderM holder = new ViewHolderM(context, convertView, parent,
				layoutId, position);
		convert(holder, getItem(position));
		return holder.getConvertView();
	}

	/**
	 * ��ʵ�ֵĳ��󷽷�
	 * 
	 * @param holder
	 * @param model
	 */
	public abstract void convert(ViewHolderM holder, T model);
}
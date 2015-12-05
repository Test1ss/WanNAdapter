package com.adapter.adpter;

import android.content.Context;
import android.text.Spanned;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author landptf
 * ������ViewHolder
 */
public class ViewHolderM {
  private SparseArray<View> viewArray;
  private int position;
  private View mConvertView;
  private Object tag;
  /** 
   * ���췽��
   * @param context
   * @param convertView
   * @param parent
   * @param layoutId
   * @param position
   */
  public ViewHolderM(Context context, View convertView, ViewGroup parent,
      int layoutId, int position) {
    this.position = position;
    //ʹ��SparseArrayЧ�ʸ�һЩ
    viewArray = new SparseArray<View>();
    //���ز���
    mConvertView = LayoutInflater.from(context).inflate(layoutId, parent,false);
    //��ViewHolderM��ֵ��View��Tag
    mConvertView.setTag(this);
  }
  public static ViewHolderM get(Context context, View convertView,
      ViewGroup parent, int layoutId, int position) {
    if (convertView == null) {
      //���convertViewΪ�գ���ʵ����ViewHolderM
      return new ViewHolderM(context, convertView, parent, layoutId,position);
    } else {
      //�����convertView��Tag��ȡ��ViewHolderM�������ظ����� 
      ViewHolderM holder = (ViewHolderM) convertView.getTag();
      holder.position = position;
      return holder;
    }
  }
  public View getConvertView() {
    return mConvertView;
  }
  public Object getTag() {
    return tag;
  }
  public void setTag(Object tag) {
    this.tag = tag;
  }
  public int getPosition() {
    return position;
  }
  public void setPosition(int position) {
    this.position = position;
  }
  /**
   * ͨ��viewId��ȡ�ؼ�����
   * @param viewId
   * @return
   */
  @SuppressWarnings("unchecked")
  public <T extends View> T getView(int viewId) {
    View view = viewArray.get(viewId);
    if (view == null) {
      view = mConvertView.findViewById(viewId);
      viewArray.put(viewId, view);
    }
    return (T) view;
  }
  /**------------------------------------�����ķָ���------------------------------------*/
  /**���·���Ϊ�����װ�ķ�����ֻ�Ǽ򵥼������Ժ������������*/
  /**
   * ����TextView������
   * @param viewId
   * @param text
   * @return
   */
  public ViewHolderM setText(int viewId, String text) {
    TextView tv = getView(viewId);
    tv.setText(text);
    return this;
  }
  /**
   * ����TextView������
   * @param viewId
   * @param text��Spanned���ͣ������ò��������ɫ
   * @return
   */
  public ViewHolderM setText(int viewId, Spanned text) {
    TextView tv = getView(viewId);
    tv.setText(text);
    return this;
  }
  /**
   * ����ͼƬ�Ŀɼ���
   * @param viewId
   * @param visible
   * @return
   */
  public ViewHolderM setImageViewVisible(int viewId, Boolean visible){
    ImageView iv = getView(viewId);
    if (visible) {
      iv.setVisibility(View.VISIBLE);
    }else {
      iv.setVisibility(View.GONE);
    }
    return this;
  }
}

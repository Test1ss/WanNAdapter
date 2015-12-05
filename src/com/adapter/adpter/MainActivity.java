package com.adapter.adpter;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
	private ListView lvList;
	// �Զ���Adapter
	private AdapterM<?> listAdapter;
	// ����Դʵ��,������������Ϊʾ�������Ҳ����ѡ��ʹ��List��Ϊ����Դ
	// private MessageBean[] msgArray;
	private List<MessageBean> msgArrayList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	private void initView() {
		initData();
		lvList = (ListView) findViewById(R.id.lv_list);
		listAdapter = getAdapter(msgArrayList);
		lvList.setAdapter(listAdapter);
	}

	// private AdapterM<MessageBean> getAdapter(MessageBean[] msgArray) {
	// return new AdapterM<MessageBean>(this, R.layout.item_messgae, msgArray) {
	//
	// @Override
	// public void convert(ViewHolderM holder, MessageBean model) {
	// holder.setText(R.id.tv_title, model.getmTitle());
	// holder.setText(R.id.tv_content, model.getmContent());
	// holder.setText(R.id.tv_comment, model.getmComment() + "������");
	// holder.setText(R.id.tv_read, model.getmRead() + "�Ķ�");
	// }
	// };
	// }

	private AdapterM<MessageBean> getAdapter(List<MessageBean> msgArrayList) {
		return new AdapterM<MessageBean>(this, R.layout.item_messgae,
				msgArrayList) {

			@Override
			public void convert(ViewHolderM holder, MessageBean model) {
				holder.setText(R.id.tv_title, model.getmTitle());
				holder.setText(R.id.tv_content, model.getmContent());
				holder.setText(R.id.tv_comment, model.getmComment() + "������");
				holder.setText(R.id.tv_read, model.getmRead() + "�Ķ�");
			}
		};
	}

	// װ������
	private void initData() {
		// msgArray = new MessageBean[10];
		// msgArray[0] = new MessageBean(
		// "Android �Զ��������",
		// "��������һ�����ͨ����϶���ؼ�ʵ���Զ��������������֪����������Ӧ���бز����ٵĿؼ���Ϊ�˱�������д�������װ��������ÿ�����ֵ��ü��ɡ��������ǲ��þ���������Ҳ��֣�Ҳ���Ը�����Ŀ��Ҫ���е������������Ҳ��ټ�һ���ؼ������߽�����ƫ�󶼿���ע������Ӧ�õ�����һƪ�����е�ButtonM�ؼ�����ҿ���",
		// "0", "270");
		// msgArray[1] = new MessageBean(
		// "android�Զ���ؼ�����̬����Button��ʽ",
		// "��������һ��ͨ����дButton����̬ʵ��һЩЧ������Բ�Ǿ��Ρ�Բ�Ρ����¸ı����壬�ı䱳��ɫ���ı䱳��ͼ���ڴ�˵��һ�£�����ʵ�ַ�ʽ���Բ���Ψһ�ģ�����ͨ��xml�ļ����ɼ�ʵ�֣�������ֻ��Ϊ�˽��ؼ�����ʽ��ȫ�ɴ���ʵ�֣���������Ӧ����������Ŀ������������Ч��ͼ: ͼ1 ��ʼ״̬ ͼ2 ���µ�һ",
		// "0", "270");
		// msgArray[2] = new MessageBean(
		// "Android �Զ���ؼ�ʵ��TextView���º�������ɫ�ı�",
		// "�������ҷ���һ��Android�Զ���ؼ����ţ��Ƚ���һ���򵥵�Ч��TextView�����¸ı�������ɫ������������չ��ǿ��Ĺ���ֱ�ӿ�ͼƬ ��һ���ǰ��º�ص�ͼ�����ܼܺ򵥣�Ҳ������ʵ�֣���������һ�����ͨ����дTextView��ʵ��һ�������ļ� TextViewM.java,MainActivit",
		// "0", "270");
		// msgArray[3] = new MessageBean(
		// "Android �Զ��������",
		// "��������һ�����ͨ����϶���ؼ�ʵ���Զ��������������֪����������Ӧ���бز����ٵĿؼ���Ϊ�˱�������д�������װ��������ÿ�����ֵ��ü��ɡ��������ǲ��þ���������Ҳ��֣�Ҳ���Ը�����Ŀ��Ҫ���е������������Ҳ��ټ�һ���ؼ������߽�����ƫ�󶼿���ע������Ӧ�õ�����һƪ�����е�ButtonM�ؼ�����ҿ���",
		// "0", "270");
		// msgArray[4] = new MessageBean(
		// "android�Զ���ؼ�����̬����Button��ʽ",
		// "��������һ��ͨ����дButton����̬ʵ��һЩЧ������Բ�Ǿ��Ρ�Բ�Ρ����¸ı����壬�ı䱳��ɫ���ı䱳��ͼ���ڴ�˵��һ�£�����ʵ�ַ�ʽ���Բ���Ψһ�ģ�����ͨ��xml�ļ����ɼ�ʵ�֣�������ֻ��Ϊ�˽��ؼ�����ʽ��ȫ�ɴ���ʵ�֣���������Ӧ����������Ŀ������������Ч��ͼ: ͼ1 ��ʼ״̬ ͼ2 ���µ�һ",
		// "0", "270");
		// msgArray[5] = new MessageBean(
		// "Android �Զ���ؼ�ʵ��TextView���º�������ɫ�ı�",
		// "�������ҷ���һ��Android�Զ���ؼ����ţ��Ƚ���һ���򵥵�Ч��TextView�����¸ı�������ɫ������������չ��ǿ��Ĺ���ֱ�ӿ�ͼƬ ��һ���ǰ��º�ص�ͼ�����ܼܺ򵥣�Ҳ������ʵ�֣���������һ�����ͨ����дTextView��ʵ��һ�������ļ� TextViewM.java,MainActivit",
		// "0", "270");
		// msgArray[6] = new MessageBean(
		// "Android �Զ��������",
		// "��������һ�����ͨ����϶���ؼ�ʵ���Զ��������������֪����������Ӧ���бز����ٵĿؼ���Ϊ�˱�������д�������װ��������ÿ�����ֵ��ü��ɡ��������ǲ��þ���������Ҳ��֣�Ҳ���Ը�����Ŀ��Ҫ���е������������Ҳ��ټ�һ���ؼ������߽�����ƫ�󶼿���ע������Ӧ�õ�����һƪ�����е�ButtonM�ؼ�����ҿ���",
		// "0", "270");
		// msgArray[7] = new MessageBean(
		// "android�Զ���ؼ�����̬����Button��ʽ",
		// "��������һ��ͨ����дButton����̬ʵ��һЩЧ������Բ�Ǿ��Ρ�Բ�Ρ����¸ı����壬�ı䱳��ɫ���ı䱳��ͼ���ڴ�˵��һ�£�����ʵ�ַ�ʽ���Բ���Ψһ�ģ�����ͨ��xml�ļ����ɼ�ʵ�֣�������ֻ��Ϊ�˽��ؼ�����ʽ��ȫ�ɴ���ʵ�֣���������Ӧ����������Ŀ������������Ч��ͼ: ͼ1 ��ʼ״̬ ͼ2 ���µ�һ",
		// "0", "270");
		// msgArray[8] = new MessageBean(
		// "Android �Զ���ؼ�ʵ��TextView���º�������ɫ�ı�",
		// "�������ҷ���һ��Android�Զ���ؼ����ţ��Ƚ���һ���򵥵�Ч��TextView�����¸ı�������ɫ������������չ��ǿ��Ĺ���ֱ�ӿ�ͼƬ ��һ���ǰ��º�ص�ͼ�����ܼܺ򵥣�Ҳ������ʵ�֣���������һ�����ͨ����дTextView��ʵ��һ�������ļ� TextViewM.java,MainActivit",
		// "0", "270");
		// msgArray[9] = new MessageBean(
		// "Android �Զ��������",
		// "��������һ�����ͨ����϶���ؼ�ʵ���Զ��������������֪����������Ӧ���бز����ٵĿؼ���Ϊ�˱�������д�������װ��������ÿ�����ֵ��ü��ɡ��������ǲ��þ���������Ҳ��֣�Ҳ���Ը�����Ŀ��Ҫ���е������������Ҳ��ټ�һ���ؼ������߽�����ƫ�󶼿���ע������Ӧ�õ�����һƪ�����е�ButtonM�ؼ�����ҿ���",
		// "0", "1000");

		msgArrayList = new ArrayList<MessageBean>();
		for (int i = 0; i < 20; i++) {
			MessageBean messageBean = new MessageBean(
					"Android �Զ��������",
					"��������һ�����ͨ����϶���ؼ�ʵ���Զ��������������֪����������Ӧ���бز����ٵĿؼ���Ϊ�˱�������д�������װ��������ÿ�����ֵ��ü��ɡ��������ǲ��þ���������Ҳ��֣�Ҳ���Ը�����Ŀ��Ҫ���е������������Ҳ��ټ�һ���ؼ������߽�����ƫ�󶼿���ע������Ӧ�õ�����һƪ�����е�ButtonM�ؼ�����ҿ���",
					"0", "1000");
			msgArrayList.add(messageBean);
		}
	}

}

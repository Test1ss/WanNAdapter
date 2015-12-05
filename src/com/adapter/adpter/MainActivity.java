package com.adapter.adpter;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
	private ListView lvList;
	// 自定义Adapter
	private AdapterM<?> listAdapter;
	// 数据源实体,这里用数组作为示例，大家也可以选择使用List作为数据源
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
	// holder.setText(R.id.tv_comment, model.getmComment() + "条评论");
	// holder.setText(R.id.tv_read, model.getmRead() + "阅读");
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
				holder.setText(R.id.tv_comment, model.getmComment() + "条评论");
				holder.setText(R.id.tv_read, model.getmRead() + "阅读");
			}
		};
	}

	// 装载数据
	private void initData() {
		// msgArray = new MessageBean[10];
		// msgArray[0] = new MessageBean(
		// "Android 自定义标题栏",
		// "今天来看一下如何通过组合多个控件实现自定义标题栏众所周知，标题栏是应用中必不可少的控件，为了避免多次重写，将其封装起来，供每个布局调用即可。这里我们采用经典的左中右布局，也可以根据项目需要自行调整，比如在右侧再加一个控件，或者将标题偏左都可以注：其中应用到了上一篇文章中的ButtonM控件，大家可以",
		// "0", "270");
		// msgArray[1] = new MessageBean(
		// "android自定义控件，动态设置Button样式",
		// "今天来看一个通过重写Button来动态实现一些效果，如圆角矩形、圆形、按下改变字体，改变背景色，改变背景图等在此说明一下，这种实现方式绝对不是唯一的，而且通过xml文件即可简单实现，这样做只是为了将控件的样式完全由代码实现，更方便打包应用于其他项目下面来看几张效果图: 图1 初始状态 图2 按下第一",
		// "0", "270");
		// msgArray[2] = new MessageBean(
		// "Android 自定义控件实现TextView按下后字体颜色改变",
		// "今天跟大家分享一下Android自定义控件入门，先介绍一个简单的效果TextView，按下改变字体颜色，后期慢慢扩展更强大的功能直接看图片 第一张是按下后截的图，功能很简单，也很容易实现，下面来看一下如何通过重写TextView来实现一共三个文件 TextViewM.java,MainActivit",
		// "0", "270");
		// msgArray[3] = new MessageBean(
		// "Android 自定义标题栏",
		// "今天来看一下如何通过组合多个控件实现自定义标题栏众所周知，标题栏是应用中必不可少的控件，为了避免多次重写，将其封装起来，供每个布局调用即可。这里我们采用经典的左中右布局，也可以根据项目需要自行调整，比如在右侧再加一个控件，或者将标题偏左都可以注：其中应用到了上一篇文章中的ButtonM控件，大家可以",
		// "0", "270");
		// msgArray[4] = new MessageBean(
		// "android自定义控件，动态设置Button样式",
		// "今天来看一个通过重写Button来动态实现一些效果，如圆角矩形、圆形、按下改变字体，改变背景色，改变背景图等在此说明一下，这种实现方式绝对不是唯一的，而且通过xml文件即可简单实现，这样做只是为了将控件的样式完全由代码实现，更方便打包应用于其他项目下面来看几张效果图: 图1 初始状态 图2 按下第一",
		// "0", "270");
		// msgArray[5] = new MessageBean(
		// "Android 自定义控件实现TextView按下后字体颜色改变",
		// "今天跟大家分享一下Android自定义控件入门，先介绍一个简单的效果TextView，按下改变字体颜色，后期慢慢扩展更强大的功能直接看图片 第一张是按下后截的图，功能很简单，也很容易实现，下面来看一下如何通过重写TextView来实现一共三个文件 TextViewM.java,MainActivit",
		// "0", "270");
		// msgArray[6] = new MessageBean(
		// "Android 自定义标题栏",
		// "今天来看一下如何通过组合多个控件实现自定义标题栏众所周知，标题栏是应用中必不可少的控件，为了避免多次重写，将其封装起来，供每个布局调用即可。这里我们采用经典的左中右布局，也可以根据项目需要自行调整，比如在右侧再加一个控件，或者将标题偏左都可以注：其中应用到了上一篇文章中的ButtonM控件，大家可以",
		// "0", "270");
		// msgArray[7] = new MessageBean(
		// "android自定义控件，动态设置Button样式",
		// "今天来看一个通过重写Button来动态实现一些效果，如圆角矩形、圆形、按下改变字体，改变背景色，改变背景图等在此说明一下，这种实现方式绝对不是唯一的，而且通过xml文件即可简单实现，这样做只是为了将控件的样式完全由代码实现，更方便打包应用于其他项目下面来看几张效果图: 图1 初始状态 图2 按下第一",
		// "0", "270");
		// msgArray[8] = new MessageBean(
		// "Android 自定义控件实现TextView按下后字体颜色改变",
		// "今天跟大家分享一下Android自定义控件入门，先介绍一个简单的效果TextView，按下改变字体颜色，后期慢慢扩展更强大的功能直接看图片 第一张是按下后截的图，功能很简单，也很容易实现，下面来看一下如何通过重写TextView来实现一共三个文件 TextViewM.java,MainActivit",
		// "0", "270");
		// msgArray[9] = new MessageBean(
		// "Android 自定义标题栏",
		// "今天来看一下如何通过组合多个控件实现自定义标题栏众所周知，标题栏是应用中必不可少的控件，为了避免多次重写，将其封装起来，供每个布局调用即可。这里我们采用经典的左中右布局，也可以根据项目需要自行调整，比如在右侧再加一个控件，或者将标题偏左都可以注：其中应用到了上一篇文章中的ButtonM控件，大家可以",
		// "0", "1000");

		msgArrayList = new ArrayList<MessageBean>();
		for (int i = 0; i < 20; i++) {
			MessageBean messageBean = new MessageBean(
					"Android 自定义标题栏",
					"今天来看一下如何通过组合多个控件实现自定义标题栏众所周知，标题栏是应用中必不可少的控件，为了避免多次重写，将其封装起来，供每个布局调用即可。这里我们采用经典的左中右布局，也可以根据项目需要自行调整，比如在右侧再加一个控件，或者将标题偏左都可以注：其中应用到了上一篇文章中的ButtonM控件，大家可以",
					"0", "1000");
			msgArrayList.add(messageBean);
		}
	}

}

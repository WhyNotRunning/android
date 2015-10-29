package com.example.myapp;


import com.example.myapp.util.ImageCache;
import com.example.myapp.util.RequestCache;
import com.example.myapp.util.Caller;

import android.app.Application;

public class MyappApplication extends Application {
	
	public static String TAG = "iwooto";
	/**
	 * �ͻ�ȡ����app
	 */
	private static MyappApplication instance;
	/**
	 * ͼƬ����
	 */
	private  ImageCache mImageCache;
	/**
	 * web���󻺴�
	 */
	private  RequestCache mRequestCache;
	
	public static MyappApplication getInstance() {
		return instance;
	}
	
	@Override
	public void onCreate(){
		super.onCreate();
		mImageCache = new ImageCache();
		mRequestCache = new RequestCache();

		Caller.setRequestCache(mRequestCache);
		instance = this;
		
	}

}

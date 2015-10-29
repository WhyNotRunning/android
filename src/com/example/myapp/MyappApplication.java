package com.example.myapp;


import com.example.myapp.util.ImageCache;
import com.example.myapp.util.RequestCache;
import com.example.myapp.util.Caller;

import android.app.Application;

public class MyappApplication extends Application {
	
	public static String TAG = "iwooto";
	/**
	 * 和获取单例app
	 */
	private static MyappApplication instance;
	/**
	 * 图片缓存
	 */
	private  ImageCache mImageCache;
	/**
	 * web请求缓存
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

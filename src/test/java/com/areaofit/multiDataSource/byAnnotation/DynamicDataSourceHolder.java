package com.areaofit.multiDataSource.byAnnotation;

/**
 * 本地线程设置和获取数据源信息
 * @author Administrator
 *
 */
public class DynamicDataSourceHolder {

	private static final ThreadLocal<DynamicDataSourceGlobal> holder = new ThreadLocal<DynamicDataSourceGlobal>();
	
	public static void putDataSource(DynamicDataSourceGlobal dataSourceGlobal){
		holder.set(dataSourceGlobal);
	}
	
	public static DynamicDataSourceGlobal getDataSource(){
		return holder.get();
	}
	
	public static void clearDataSource() {
		holder.remove();
	}
}

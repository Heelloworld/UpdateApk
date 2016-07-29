package com.mirsdev.mirsfang.updataapklib.util;

import java.io.File;

import android.os.Environment;

public class G {
	/** 应用缓存目录 */
	public static final String CachePath = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator
			+ "data/data/com.mirsdev.mirsfang.updateapk/file/";
}

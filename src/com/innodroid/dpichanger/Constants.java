package com.innodroid.dpichanger;

import java.io.File;

import android.os.Environment;

public class Constants {
	public static final String CONFIG_FILE_NAME = "/system/build.prop";
	public static final String BACKUP_FILE_NAME = new File(Environment.getExternalStorageDirectory(), "Hyperdroid_Androidmeda/Backup/build.prop.bak").getAbsolutePath();
	public static final String DPI_PREFIX = "ro.sf.lcd_density";
	
	public static final int[] DPI_VALUES = new int[] {
		160,
		192,
		216,
		240,
		320,
		0
	};
	
	public static final String[] DPI_NAMES = new String[] {
		"MDPI (160)",
		"Hyperdroid (192)",
		"Middle Grounds (216)",
		"HDPI (240)",
		"XHDPI (320)",
		"Custom"
	};	
}

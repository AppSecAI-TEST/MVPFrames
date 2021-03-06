package com.tool.common.utils;

import android.os.Environment;

import java.io.File;

/**
 * ProjectUtils
 */
public class ProjectUtils {

    // 目录名称
    public static String PROJECT_NAME = "MVP";
    // 项目目录
    public static final String ROOT_PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + PROJECT_NAME + File.separator;
    // DB路径
    public static final String DB = ROOT_PATH + "db/";
    // 日志路径
    public static final String LOG = ROOT_PATH + "log/";
    // 缓存路径
    public static final String CACHE = ROOT_PATH + "cache/";

    /**
     * 初始化项目文件夹
     *
     * @return
     */
    public static boolean init() {
        boolean result = true;
        if (DeviceUtils.isExitsSdcard()) {
            result = FileUtils.makeFolders(ROOT_PATH);
            result = FileUtils.makeFolders(DB);
            result = FileUtils.makeFolders(LOG);
            result = FileUtils.makeFolders(CACHE);
        }
        return result;
    }

    /**
     * 初始化项目文件夹
     *
     * @return
     */
    public static boolean init(String name) {
        PROJECT_NAME = name;
        return init();
    }
}
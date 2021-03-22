package com.lsx.lazytools.ext

import android.app.Activity
import android.view.Surface

/**
 * @Description: 系统相关扩展类
 * @CreateDate: 2021/2/24
 * @Author: LSX
 */


/**
 * 获取屏幕的角度
 * @receiver Activity
 * @return Int
 */
fun Activity.getDisplayRotationDegree(): Int {
    val rotation = windowManager.defaultDisplay.rotation
    var degrees = 0
    when (rotation) {
        Surface.ROTATION_0 -> degrees = 0
        Surface.ROTATION_90 -> degrees = 90
        Surface.ROTATION_180 -> degrees = 180
        Surface.ROTATION_270 -> degrees = 270
        else -> {
        }
    }
    return degrees
}
package com.lsx.lazytools.ext

import android.os.Handler

/**
 * @Description: Thread扩展类
 * @CreateDate: 2021/2/24
 * @Author: LSX
 */

/**
 * 延迟执行
 * @param delay Long  毫秒
 * @param block Function0<Unit>  执行方法
 */
fun withDelay(delay: Long, block : () -> Unit) {
    Handler().postDelayed(block, delay)
}

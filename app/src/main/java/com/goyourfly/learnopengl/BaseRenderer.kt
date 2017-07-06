package com.goyourfly.learnopengl

import android.opengl.GLSurfaceView
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

/**
 * Created by gaoyufei on 2017/7/6.
 */
abstract class BaseRenderer :GLSurfaceView.Renderer{
    /**
     * Surface 创建时候调用
     */
    abstract override fun onSurfaceCreated(gl: GL10, config: EGLConfig?)

    /**
     * Surface 尺寸变化时调用
     */
    abstract override fun onSurfaceChanged(gl: GL10, width: Int, height: Int)

    /**
     * 绘制每一帧的数据
     */
    abstract override fun onDrawFrame(gl: GL10)

}
package com.goyourfly.learnopengl

import android.opengl.GLSurfaceView
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

/**
 * Created by gaoyufei on 2017/7/6.
 */
class RendererHelloTriangle :GLSurfaceView.Renderer{
    /**
     * Surface 创建时候调用
     */
    override fun onSurfaceCreated(gl: GL10, config: EGLConfig?) {

    }

    /**
     * Surface 尺寸变化时调用
     */
    override fun onSurfaceChanged(gl: GL10, width: Int, height: Int) {
        
    }

    /**
     * 绘制每一帧的数据
     */
    override fun onDrawFrame(gl: GL10) {

    }

}
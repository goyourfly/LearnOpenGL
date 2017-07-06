package com.goyourfly.learnopengl

import android.opengl.GLSurfaceView
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val glSurfaceView = findViewById(R.id.surface) as GLSurfaceView

        glSurfaceView.setEGLContextClientVersion(2)
        glSurfaceView.setRenderer(RendererHelloTriangle())
        glSurfaceView.renderMode = GLSurfaceView.RENDERMODE_WHEN_DIRTY
    }
}

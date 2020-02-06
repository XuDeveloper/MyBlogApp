package com.example.myblogapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        juejin1.setOnClickListener {
            openLink("https://juejin.im/post/5cdff2a451882525c104c8a7")
        }
        juejin2.setOnClickListener {
            openLink("https://juejin.im/post/5c287e1ae51d453634703b15")
        }
        juejin3.setOnClickListener {
            openLink("https://juejin.im/post/5b9bb5c26fb9a05cf67a78c0")
        }
        juejin4.setOnClickListener {
            openLink("https://juejin.im/post/5b67101e6fb9a04f9963c818")
        }
        juejin5.setOnClickListener {
            openLink("https://juejin.im/post/5b27bfc56fb9a00e373bd232")
        }
        juejin6.setOnClickListener {
            openLink("https://juejin.im/post/5a630a6c51882573443cc7d1")
        }
        juejin7.setOnClickListener {
            openLink("https://juejin.im/post/5a36412f6fb9a0451d418e2f")
        }

        csdn1.setOnClickListener {
            openLink("https://blog.csdn.net/Xu_1215/article/details/97567773")
        }
        csdn2.setOnClickListener {
            openLink("https://blog.csdn.net/Xu_1215/article/details/88253531")
        }
        csdn3.setOnClickListener {
            openLink("https://blog.csdn.net/Xu_1215/article/details/82755560")
        }
        csdn4.setOnClickListener {
            openLink("https://blog.csdn.net/Xu_1215/article/details/81585367")
        }
        csdn5.setOnClickListener {
            openLink("https://blog.csdn.net/Xu_1215/article/details/80761862")
        }
        csdn6.setOnClickListener {
            openLink("https://blog.csdn.net/Xu_1215/article/details/80761809")
        }
    }

    private fun openLink(url: String) {
        val intent = Intent()
        intent.action = "android.intent.action.VIEW"
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}

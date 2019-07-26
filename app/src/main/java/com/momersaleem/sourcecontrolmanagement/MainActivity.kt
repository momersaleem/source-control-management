package com.momersaleem.sourcecontrolmanagement

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("release-v1.0.0 branch")
        println("release-v1.0.0 - Bug fixes")

        println("Feature - Payment on spot by cash")
        println("release-v1.0.1 branch")
        println("release-v1.0.1 - Bug fixes")

        println("Feature - Payment on spot by card")
        println("release-v1.0.2 branch")

        println("Hotfix-v1.0.3 branch")
        println("Fixes critical bug on v1.0.2 release")
    }
}

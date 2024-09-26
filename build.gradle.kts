// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    kotlin("jvm") version "2.0.20"
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false

}


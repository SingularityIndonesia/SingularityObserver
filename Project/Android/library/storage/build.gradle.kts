/*
 * Copyright (c) 2024 Stefanus Ayudha (stefanus.ayudha@gmail.com)
 * Created on 04/03/2024 12:00
 * You are not allowed to remove the copyright.
 */
plugins {
    id("LibraryConventionV1")
    id("FeatureContextReceiver")
    id("FeatureJetpackCompose")
}

android {
    namespace = "com.singularityindonesia.storage"
}

dependencies {

    implementation("std:main-context")

    implementation(libs.android.core.ktx)
    implementation(libs.android.appcompat)
    implementation(libs.android.material)

    implementation(libs.android.compose.ui)
    implementation(libs.android.compose.ui.graphics)
    implementation(libs.android.compose.ui.tooling.preview)
    implementation(libs.android.compose.material3)

    testImplementation(libs.junit)
    androidTestImplementation(libs.android.ext.junit)
    androidTestImplementation(libs.android.espresso.core)
}
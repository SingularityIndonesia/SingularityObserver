/*
 * Copyright (c) 2024 Stefanus Ayudha (stefanus.ayudha@gmail.com)
 * Created on 04/03/2024 12:00
 * You are not allowed to remove the copyright.
 */
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        includeBuild("Plugin")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Singularity Indonesia"
include(":Library:data")
include(":Library:exception")
include(":Library:model")
include(":Library:serialization")
include(":Library:webrepository")
include(":Library:regex")
include(":Library:validation")
include(":Library:compose-app")
include(":Library:screen")

include(":Project:app")

include(":Project:library:debugger")
include(":Project:library:dictionary")
include(":Project:library:designsystem")
include(":Project:library:main-context")
include(":Project:library:analytic")
include(":Project:library:flow")

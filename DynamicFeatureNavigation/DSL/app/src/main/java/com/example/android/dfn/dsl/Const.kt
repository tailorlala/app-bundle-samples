/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.dfn.dsl

/**
 * Collection of constants required across module boundaries.
 */
object Const {

    /**
     * Package names for dynamic feature modules.
     */
    object PackageNames {
        val onDemand = "com.example.android.dfn.dsl.ondemand"
        val includedResource = "com.example.android.dfn.dsl.included"
    }

    object Resources {
        val includedGraph = "included_dynamically"
    }

    /**
     * Fully qualified classnames for navigation destinations.
     */
    object ClassNames {
        val onDemandFragment = "com.example.android.dfn.dsl.ondemand.OnDemandFragment"
        val featureActivity = "com.example.android.dfn.dsl.ondemand.FeatureActivity"
    }

    object ModuleNames {
        val included = "included"
        val ondemand = "ondemand"
    }
}
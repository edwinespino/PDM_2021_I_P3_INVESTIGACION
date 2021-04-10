package hn.edu.ujcv.pdm_2021_i_p3_investigacion.shared

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}
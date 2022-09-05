package com.abdurashidov.sms_sherlar.utils

import com.abdurashidov.sms_sherlar.models.Sher

object SherlarList {
    var list = ArrayList<Sher>()
    var saqlanganSherlar=ArrayList<Sher>()

    fun loadData() {
        for (i in 0..10) {

            list.add(Sher("Oshiq derlar meni $i",
                "Sizni birinchi bor ko’rganimdayoq menga yoqib\n" +
                        "qolgansiz, lekin bu tuyg’u sevgiga aylanadi deb\n" +
                        "o’ylamagandim . . . ",
                "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                        "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                        "Mayli xijron azobi qiynasin meni,\n" +
                        "O’lsam ham baribir sevaman seni!",
                "sevgi_sherlar"))
        }
        for (i in 0..10) {

            list.add(Sher("Ota-ona $i",
                "Sizni birinchi bor ko’rganimdayoq menga yoqib\n" +
                        "qolgansiz, lekin bu tuyg’u sevgiga aylanadi deb\n" +
                        "o’ylamagandim . . . ",
                "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                        "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                        "Mayli xijron azobi qiynasin meni,\n" +
                        "O’lsam ham baribir sevaman seni!",
                "ota_ona"))
        }
    }
}
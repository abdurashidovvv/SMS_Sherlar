package com.abdurashidov.sms_sherlar.models

data class Sher(
    var name:String,
    var shortText:String,
    var longText:String,
    var type:String,
    var like:Boolean=false,
    var new:Boolean=false
)


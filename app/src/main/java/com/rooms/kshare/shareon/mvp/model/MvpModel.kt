package com.rooms.kshare.shareon.mvp.model

class MvpModel {

    var nickName: String? = null

//    public fun setNickName(nickName: String) {
//        this.nickName = nickName
//    }

    fun getNickNameForToast() : String {
        return nickName?: "설정된 닉네임이 없습니다."
    }

}
package com.rooms.kshare.shareon.mvp

public interface PresenterInterface {

    interface View {
        fun snowNickName(nickname: String)
    }

    interface ToModel {
        fun setNickName(nickName: String)
        fun getNickName()
    }
}
package com.rooms.kshare.shareon.mvp.presenter

import com.rooms.kshare.shareon.mvp.PresenterInterface
import com.rooms.kshare.shareon.mvp.model.MvpModel

class PresenterImplements : PresenterInterface.ToModel {

    var view: PresenterInterface.View? = null
    var model: MvpModel? = null

    constructor(view: PresenterInterface.View) {
        this.view = view
        this.model = MvpModel()
    }

    override fun setNickName(nickName: String) {
        model?.nickName = nickName
    }

    override fun getNickName() {
        view?.snowNickName(model?.getNickNameForToast()!!)
    }
}
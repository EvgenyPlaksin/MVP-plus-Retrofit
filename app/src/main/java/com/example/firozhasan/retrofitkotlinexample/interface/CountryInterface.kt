package com.example.firozhasan.retrofitkotlinexample.`interface`

interface CountryInterface {

    interface countryModel {
        fun getCountyNameByCapital(presenter: countryPresenter)
        fun getCountry(): String
    }

    interface countryView {
        fun updateViewData()

    }

    interface countryPresenter {
        fun networkcall()
        fun showCountry() : String
        fun uiAutoUpdate()
    }
}
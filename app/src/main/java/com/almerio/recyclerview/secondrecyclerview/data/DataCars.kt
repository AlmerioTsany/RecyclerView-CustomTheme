package com.almerio.recyclerview.secondrecyclerview.data

object DataCars {

    private val nameCar = arrayOf(
        "Lamborghini",
        "Mercedes Benz",
        "McLaren",
        "BMW"
    )
    private val imgCar = arrayOf(
        "https://imgx.gridoto.com/crop/0x0:0x0/700x500/photo/2019/10/21/4111273287.jpg",
        "https://imgcdn.oto.com/medium/gallery/exterior/25/206/mercedes-benz-cls-class-61023.jpg",
        "https://imgcdn.oto.com/medium/gallery/exterior/24/886/mclaren-570s-front-angle-low-view-539676.jpg",
        "https://img.okezone.com/content/2021/05/24/52/2414788/canggihnya-bmw-x5-apa-saja-kelebihannya-U9PZrygtsW.jpg"
    )


    val listData: ArrayList<Cars>
        get() {
            val list = arrayListOf<Cars>()
            for (position in nameCar.indices) {
                val mobil = Cars(
                    name = nameCar[position],
                    img = imgCar[position]
                )
                list.add(mobil)
            }
            return list
        }

}
import Newspapers.Newspaper as NewNewspaper

fun main(){
    var OnlineNewspapersOne = OnlineNewspapers(1000000,400,"МатчТВ",57,2022)
    OnlineNewspapersOne.DateOnline()
    OnlineNewspapersOne.OnlineInfo()
    OnlineNewspapersOne.Name()
    OnlineNewspapersOne.Price()
    OnlineNewspapersOne.NumberDate()
    var OnlineNewspapersMatchTV = NewNewspaper("Матч ТВ",2022,60)
    var OnlineNewspapersRBK = NewNewspaper("РБК",2021,50)
    var OnlineNewspapersMurzilka = NewNewspaper("Мурзилка",2020,70)

    println("Название ${OnlineNewspapersMatchTV.name} Дата ${OnlineNewspapersMatchTV.date} Номер ${OnlineNewspapersMatchTV.number}")
    println("Название ${OnlineNewspapersRBK.name} Дата ${OnlineNewspapersRBK.date} Номер ${OnlineNewspapersRBK.number}")
    println("Название ${OnlineNewspapersMurzilka.name} Дата ${OnlineNewspapersMurzilka.date} Номер ${OnlineNewspapersMurzilka.number}")

    var OfflineNewspapersOne = OfflineNewspapers(4800000,300,"Комсомольская правда",80,2000)
    OfflineNewspapersOne.OfflineInfo()
    OfflineNewspapersOne.Readers()
    OfflineNewspapersOne.Name()
    OfflineNewspapersOne.Price()
    OfflineNewspapersOne.NumberDate()
    var OfflineNewspapersKomsomolskayapravda = NewNewspaper("Комсомольская правда",2001,70)
    var OfflineNewspapersVoenniyKommisariat = NewNewspaper("Военный коммисариат",2000,50)
    var OfflineNewspapersIzvestia = NewNewspaper("Известия",1999,60)

    println("Название ${OfflineNewspapersKomsomolskayapravda.name} Дата ${OfflineNewspapersKomsomolskayapravda.date} Номер ${OfflineNewspapersIzvestia.number}")
    println("Название ${OfflineNewspapersVoenniyKommisariat.name} Дата ${OfflineNewspapersVoenniyKommisariat.date} Номер ${OfflineNewspapersVoenniyKommisariat.number}")
    println("Название ${OfflineNewspapersIzvestia.name} Дата ${OfflineNewspapersIzvestia.date} Номер ${OfflineNewspapersIzvestia.number}")






}

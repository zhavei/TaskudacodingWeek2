package com.zhavei.taskudacodingweek2.recyceview

import java.util.*

object MockData {
    val gunungList: List<Gunung>
        get() {
            val GunungList: MutableList<Gunung> = ArrayList()
            val gunungRinjani = Gunung()
            gunungRinjani.namaGunung = "Gunung Rinjani"
            gunungRinjani.imageUrl = "https://penyukajalanjalan.files.wordpress.com/2015/04/20150402_072231.jpg?w=576&h=1024"
            gunungRinjani.tinggiGunung = "Nusa Tenggara Barat | 3.726 mdpl"
            gunungRinjani.deskripsiGunung = """
        Pulau Lombok di Nusa Tenggara Barat tidak hanya memiliki keindahan pantai eksotis yang memukau. Di sini juga terdapat sebuah gunung yang sudah tersohor keindahannya, terutama dikalangan para pendaki gunung. Gunung tersebut adalah Gunung Rinjani.

        Gunung Rinjani disebut-sebut sebagai tempat wisata trekking terbaik di Asia Tenggara. Dengan ketinggian 3.726 meter, gunung terindah di Indonesia ini juga berhasil menjadi gunung ketiga tertinggi di Indonesia. Gunung Rinjani menawarkan beragam pemandangan alam yang menakjubkan, mulai dari padang savana yang ditumbuhi bunga edelweiss, Danau Segara Anak, sampai pemandangan matahari terbit yang cantik dan tiada duanya.

        Perkiraan waktu yang Anda butuhkan untuk mendaki gunung ini adalah antara 7 sampai 10 jam, oleh karena itu Anda harus menyiapkan kondisi badan yang prima sebelum berangkat.
        """.trimIndent()
            val gunungBromo = Gunung()
            gunungBromo.namaGunung = "Gunung Bromo"
            gunungBromo.imageUrl = "https://petualang.travelingyuk.com/unggah/2019/08/1b1dfd39_6c4e_4b70_81bc_77fe36fc3d92_ol9.jpeg"
            gunungBromo.tinggiGunung = "Jawa Timur | 2.329 mdpl"
            gunungBromo.deskripsiGunung = """
        Gunung Bromo berlokasi di empat wilayah berbeda, yaitu Kabupaten Malang, Pasuruan, Lumajang dan Probolinggo. Letaknya yang strategis membuat gunung terindah di Indonesia ini dapat dengan mudah diakses dari berbagai tempat. Gunung Bromo terkenal dengan pemandangan sunrise yang menakjubkan.

        Pemandangan sunrise di gunung terindah di Indonesia ini sudah terkenal sampai ke segala penjuru dunia, sehingga Anda akan menemui banyak pelancong asing yangkebanyakan berasal dari China, Thailand, dan Eropa. Selain menikmati pemandangan matahari terbit, kegiatan lain yang dapat Anda lakukan adalah mendaki gunung untukmelihat kawah Bromo yang memiliki diameter sekitar 800 meter dari utara ke selatan dan 600 meter dari barat ke timur.

        Anda ingin mendapatkan hasil foto yang bagus? Pergilah ke Bukit Teletubbies dan padang savana. Jangan lupa juga untuk menjelajah lautan pasir yang merupakan lokasisyuting film Pasir Berbisik.
        """.trimIndent()
            val gunungSemeru = Gunung()
            gunungSemeru.namaGunung = "Gunung Semeru"
            gunungSemeru.imageUrl = "https://petualang.travelingyuk.com/unggah/2019/05/IMG_20180509_062950_HDR_011_1492.jpeg"
            gunungSemeru.tinggiGunung = "Jawa Timur | 3,676 mdpl"
            gunungSemeru.deskripsiGunung = """
        Gunung tertinggi di Pulau Jawa ini berlokasi di antara dua kabupaten, yaitu Kabupaten Malang dan Kabupaten Lumajang. Dengan ketinggian 3.676 meter, Gunung Semerusudah terkenal keindahannya sejak dulu, terutama di kalangan para pecinta wisata alam. Gunung terindah di Indonesia ini juga berhasil menjadi salah satu gunung yangpaling ramai, terutama setelah film layar lebar 5cm yang menambah popularitas gunung ini.

        Gunung Semeru memiliki sebuah danau yang juga merupakan salah satu danau terindah di Indonesia, danau tersebut adalah Ranu Kumbolo. Ranu Kumbolo merupakantempat peristirahatan dan markas para pendaki yang akan melanjutkan perjalanan hingga puncak Semeru. Di hadapan Ranu Kumbolo terdapat sebuah jalan menanjak yangdikenal sebagai Tanjakan Cinta.

        Menurut kepercayaan masyarakat setempat, pendaki yang bisa melalui tanjakan ini tanpa menoleh ke belakang walau hanya satu kali, kisah cintanya akan abadi. Di balikbukit cinta, Anda akan disuguhi pemandangan padang savana Oro-oro Ombo yang penuh dengan bunga lavender, lengkap dengan lereng yang ditumbuhi pohon pinus sepertipemandangan khas pegunungan di Eropa.
        """.trimIndent()
            val gunungIjen = Gunung()
            gunungIjen.namaGunung = "Gunung Ijen"
            gunungIjen.imageUrl = "https://petualang.travelingyuk.com/unggah/2019/09/20190420_060006_sET.jpg"
            gunungIjen.tinggiGunung = "Jawa Timur | 2,769 mdpl"
            gunungIjen.deskripsiGunung = """
        Gunung Ijen berlokasi di antara perbatasan Banyuwangi dan Bondowoso. Letaknya berdampingan dengan Gunung Merapi. Ketinggian Gunung Ijen adalah 2.443 meter, masihlebih rendah bila dibandingkan dengan Gunung Bromo atau Semeru sehingga trekking menuju puncak Ijen juga lebih mudah.

        Gunung Ijen terkenal dengan keindahan kawahnya yang tiada duanya. Kawah Ijen merupakan danau air asam terbesar di dunia. Rasa letih Anda akibat mendaki akan
        terbayar dengan birunya Kawah Ijen yang indah. Terlebih lagi bila Anda memutuskan untuk berkemah di sini, pada pukul 02.00 hingga 04.00 dini hari Anda dapatmenyaksikan fenomena blue fire yang tidak akan Anda temukan di gunung lain, bahkan di negara lain, karena konon katanya blue fire di Gunung Ijen adalah satu-satunya di
        dunia.
        """.trimIndent()
            val gunungKelimutu = Gunung()
            gunungKelimutu.namaGunung = "Gunung Kelimutu"
            gunungKelimutu.imageUrl = "https://media.travelingyuk.com/unggah/2019/05/DSC01316_2796.JPG"
            gunungKelimutu.tinggiGunung = "Nusa Tenggara Timur | 1,639 mdpl"
            gunungKelimutu.deskripsiGunung = """
        Gunung Kelimutu merupakan gunung aktif yang terletak di Pulau Flores, Provinsi NTT, tepatnya di Desa Pemo, Kecamatan Kelimutu, Kabupaten Ende. Nama Kelimutu berasaldari kata “keli” yang artinya gunung dan “mutu” yang artinya mendidih. Masyarakat sekitar percaya bahwa gunung terindah di Indonesia ini adalah gunung suci yang selalumemberikan kesuburan pada tanah di sekitarnya. Karena memiliki tanah yang subur, Gunung Kelimutu dikelilingi hutan dengan flora khas pegunungan seperti pinus,casuarinas, dan kayu merah.

        Di puncak gunung terindah di Indonesia ini terdapat tiga buah danau yang terkenal dengan nama Danau Tiga Warna. Sesuai dengan namanya, air di ketiga danau tersebutmemiliki warna yang berbeda. Nama ketiga danau tersebut adalah Tiwu Nuwa Muri Koo Fai dengan warna air biru, Tiwu Ata Polo dengan warna air merah, dan Tiwu AtaMbupu dengan air berwarna putih.
        """.trimIndent()
            val gunungPuncakJaya = Gunung()
            gunungPuncakJaya.namaGunung = "Gunung Puncak Jayawijaya"
            gunungPuncakJaya.imageUrl = "https://sofyanhotel.com/wp-content/uploads/2018/12/cartenz-5-gunung-terindah-di-indonesia.jpg"
            gunungPuncakJaya.tinggiGunung = "Papua | 4,884 mdpl"
            gunungPuncakJaya.deskripsiGunung = """
        Meskipun terletak di wilayah dengan iklim tropis, Puncak Jaya merupakan pegunungan yang diselimuti oleh salju. Puncak Jaya memiliki ketinggian mencapai 4.884 meter
        yang membuatnya menjadi gunung tertinggi di Indonesia. Meskipun selama ini Puncak Jaya merupakan satu-satunya gunung di Indonesia yang tertutup salju, salju abadiyang menyelimuti Puncak Jaya diperkirakan bisa menipis atau bahkan mengering.

        Hal ini sesuai dengan kesimpulan para peneliti, yaitu bahwa endapan es yang ada di Puncak Jaya dari tahun ke tahun semakin menipis akibat dari pemanasan global.
        Carztens Pyramide adalah nama lain dari Puncak Jaya yang diambil dari nama seorang petualang dari Belanda yaitu Jan Carstenz. Dia adalah orang pertama yang melihatgunung bersalju di daerah tropis.
        """.trimIndent()
            val gunungGede = Gunung()
            gunungGede.namaGunung = "Gunung Gede"
            gunungGede.imageUrl = "https://nusadaily.com/wp-content/uploads/2019/11/Taman-Nasional-Gunung-Gede-Pangrango.-Foto-Gmap-Abhi-Supryandi-e1556503633354.jpg"
            gunungGede.tinggiGunung = "Jawa Barat | 2.958 mdpl"
            gunungGede.deskripsiGunung = """
        Jika Jawa Timur memiliki Gunung Bromo dan Semeru sebagai gunung terlaris di kalangan wisatawan maupun pendaki, Jawa Barat memiliki Gunung Gede. Gunung Gedeberada dalam kawasan Taman Nasional Gede Pangrango, tepatnya di antara Kabupaten Bogor, Cianjur, dan Sukabumi, Jawa Barat. Gunung Gede memiliki banyak tempat-tempat menarik yang dapat Anda kunjungi.

        Tempat-tempat menarik tersebut antara lain: Telaga Biru, Air Terjun Cibeureum, Kandang Batu dan Kandang Bada, Alun-alun Suryakencana, dan Puncak Gunung Gede. Salahsatu tempat yang paling indah dan menjadi tempat wisata favorit para pendaki di Gunung Gede adalah Alun-alun Suryakencana. Alun-alun Suryakencana merupakan padangsavana seluas 50 hektar pada ketinggian 2.750 meter yang ditumbuhi oleh bunga Edelweiss. Meskipun di sini terdapat banyak bunga Edelweiss, Anda dilarang memetikkarena bunga indah ini adalah bunga yang dilindungi.
        """.trimIndent()
            val gunungTambora = Gunung()
            gunungTambora.namaGunung = "Gunung Tambora"
            gunungTambora.imageUrl = "https://obs.line-scdn.net/0hdfPAIZrOO0ltOBDuvKFEHlRuOCZeVChKCQ5qVz1WZX0VWn1KAwwgfEEwNy1HAHwXA1Z3LEx9ZCkXXX0dAgo"
            gunungTambora.tinggiGunung = "Nusa Tenggara Barat | 2.850 mdpl"
            gunungTambora.deskripsiGunung = """
        Letusan Gunung Tambora yang terjadi pada tahun 1815 telah menghilangkan puncak gunung terindah di Indonesia tersebut. Karena letusan hebat tersebut, terbentuklahkaldera yang paling besar dan paling indah di Indonesia.

        Dengan dilengkapi sebuah danau di tengah kaldera yang dipenuhi banyak bunga Edelweiss, tak diragukan lagibahwa Gunung Tambora adalah salah satu gunung terindah di Indonesia.
        """.trimIndent()
            val gunungPrau = Gunung()
            gunungPrau.namaGunung = "Gunung Prau"
            gunungPrau.imageUrl = "https://i.pinimg.com/564x/19/e2/96/19e296d23083d17ef529e94beeffe57e.jpg"
            gunungPrau.tinggiGunung = "Jawa Tengah | 2.565 mdpl"
            gunungPrau.deskripsiGunung = """
        Gunung Prau adalah salah satu gunung terindah di Indonesia yang telah menjadi tujuan favorit para pendaki gunung di Jawa Tengah dan sekitarnya. Puncak Gunung Praumerupakan spot terbaik se-Asia Tenggara untuk menikmati keindahan matahari terbit.

        Gunung Prau masuk dalam Kawasan Dataran Tinggi Dieng dan berada pada ketinggian2.565 meter. Puncaknya yang relatif pendek dengan jalur pendakian yang relatif mudah bila dibanding dengan gunung lainnya membuat gunung ini menjadi gunung yangcocok untuk pendaki pemula.
        """.trimIndent()
            val gunungKerinci = Gunung()
            gunungKerinci.namaGunung = "Gunung Kerinci"
            gunungKerinci.imageUrl = "https://blog.pigijo.com/wp-content/uploads/2020/03/shutterstock_1508694053.jpg"
            gunungKerinci.tinggiGunung = "Sumatera Barat | 3.805 mdpl"
            gunungKerinci.deskripsiGunung = """
        Gunung Kerinci adalah gunung tertinggi di Sumatera dan merupakan gunung berapi yang paling tinggi di Indonesia. Gunung Kerinci berlokasi di Provinsi Jambi yangberbatasan dengan Sumatera Barat dan masuk dalam wilayah Taman Nasional Kerinci Seblat. Berada dalam wilayah Taman Nasional, gunung terindah di Indonesia ini juga merupakan habitat harimau dan badak Sumatera yang dilindungi oleh pemerintah.

        Di puncak Gunung Kerinci pada ketinggian 3.805 meter, Anda dapat menikmati pemandangan keseluruhan Kota Jambi, Padang, dan Bengkulu, lengkap dengan birunya
        Samudera Hindia. Serupa dengan Gunung Ijen, gunung ini juga memiliki kawah luas dengan air berwarna hijau kebiruan yang sangat indah.
        """.trimIndent()
            GunungList.add(gunungBromo)
            GunungList.add(gunungRinjani)
            GunungList.add(gunungTambora)
            GunungList.add(gunungSemeru)
            GunungList.add(gunungPrau)
            GunungList.add(gunungKerinci)
            GunungList.add(gunungPuncakJaya)
            GunungList.add(gunungGede)
            GunungList.add(gunungIjen)
            GunungList.add(gunungKelimutu)
            return GunungList
        }
}
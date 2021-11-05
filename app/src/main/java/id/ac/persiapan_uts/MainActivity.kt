package id.ac.persiapan_uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.rb280,"rb280","1",
                "Produk ini merupakan switch gigabit 5 port + 1 SFP port dengan kemasan plastik, dengan prosesor Taifatech TF470 NAT accelerator (RISC, 50MHz), Atheros Switch Chip. Menggunakan Switch Operating System (SwOS) dari MikroTik. Sudah termasuk adaptor 12V."))

        data?.add(DataModel(R.drawable.groove,"groove","2",
                "The New Groove still smallest outdoor series model - a fully featured RouterBOARD powered by RouterOS. Weatherproof, durable and ready to use. It has one Gigabit Ethernet port with PoE support and a built-in 400mW 802.11a/b/g/n/ac wireless radio. With the Nv2 TDMA technology, 125Mbit aggregate throughput is possible, limited only by the ethernet port!"))

        data?.add(DataModel(R.drawable.sxt,"sxt","3",
                "SXTsq-5HPnD adalah perangkat wireless embedded 5GHz yang ekonomis, yang dapat digunakan untuk point to point link, atau sebagai wirelesss client. Menggunakan protokol 802.11a/n (5GHz) dan teknologi TDMA, dalam kondisi ideal bisa mencapai 200Mbps throughput. Termasuk mounting dan antenna dengan 2 polarisasi 16dbi."))

        data?.add(DataModel(R.drawable.basebox,"basebox ","4",
                "Produk varian RB912UAG-2HPnD yang sudah dilengkapi dengan box-outdoor serta 2x RP-SMA connector, memudahkan pemasangan dual chain wireless.\n" +
                        "\n" +
                        "BaseBox2 dilengkapi dengan high power wireless access point 2.4 GHz (dual Chain), 600Mhz Atheros CPU, 64MB RAM, Gigabit Ethernet, dan routeros L4. Sudah termasuk adaptor dan PoE."))

        data?.add(DataModel(R.drawable.pwr,"pwr","5",
                "PWR-LINE AP adalah small WI-FI Access Point, dengan 1 (satu) Ethernet port dan mampu untuk terhubung ke perangkat PWR-LINE lainnya melalui jalur kabel listrik. Sangat berguna untuk kondisi bangunan dengan dinding tebal, dimana cakupan Wi-Fi yang tidak dapat dijangkau ke ruangan lain, dan sinyal lemah di suatu ruangan.\n" +
                        "\n" +
                        "Cukup dengan menghubungkan PWR-LINE AP ke LAN port router Mikrotik Anda, dan tambahkan PWR-LINE AP lainnya di tempat yang membutuhkan sinyal Wi-Fi. Beberapa perangkat PWR-LINE AP tersebut akan terhubung melalui jalur kabel listrik."))

        data?.add(DataModel(R.drawable.mantbox,"mantbox","6",
                "mANTBox 52 15s adalah perangkat wireless embedded Sectoral Dual Band 2.4GHz dan 5GHz pertama dari Mikrotik. Dengan Power 30db dapat digunakan untuk point to multipoint link AP. Menggunakan protokol 802.11a/b/g/n/ac (2.4 GHz dan 5GHz) dan teknologi TDMA. Termasuk mounting dan antenna dengan 2 polarisasi 12dbi (2.4GHz Sectoral 90 Deg) dan 15dbi (5GHz Sectoral 60 Deg)."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.nomer)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }
        })
    }
}
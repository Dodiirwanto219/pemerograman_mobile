package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;
import simple.example.hewanpedia.model.Ayam;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }
    private static List<Ayam> initDataAyam(Context ctx) {
        List<Ayam> ayams = new ArrayList<>();
        ayams.add(new Ayam("Sultan", "Turki",
                "Ayam sultan memiliki banyak bulu dekoratif,termasuk jambul besar dan benkak,jenggot,ekor panjang,dan bulu kaki yan banyak.Sisir kecil berbentuk V hampir seluruhnya tersembunyi di bawah bulu", R.drawable.ayam_sultan));
        ayams.add(new Ayam("Kate", "Indonesia ",
                "Ayam bentuknya mini dan lucu,ayam jenis ini banyak digunakan sebagai ayam hias,bukan ayam pedaging atau pertelur.", R.drawable.ayam_kate));
        ayams.add(new Ayam("Birma", "Myanmar",
                "Ayam birma merupakan jenis Ayam jantan aduan yang memiliki pukulan dan gerakan paling cepat dibandingkan dengan ras ayam aduan lainnya. ", R.drawable.ayam_birma));
        ayams.add(new Ayam("Baksiar", "Indonesia",
                "Ayam baksiar memiliki ukuran lebih kecil dibandingkan ukuran ayam kampung jantan,tetapi lebih besar daripada induk jantannya.Warna bulunya hitam kehijauan dan mengkilap.Memiliki suara yang halus dan khas : tersusun atas dua nada.", R.drawable.ayam_baksiar));
        ayams.add(new Ayam("Sebright", "Inggris",
                "Ayam Sebrights bertubuh sangat kecil; jantan memiliki berat rata-rata 22 ons (625 gram) dan betina 20 ons (570 g). Punggung mereka yang pendek, payudara besar yang proporsional, dan sayap yang mengarah ke bawah berpadu untuk menciptakan tampilan yang angular dan anggun. ", R.drawable.ayam_sebright));
        ayams.add(new Ayam("Mutiara", "Afrika",
                "warna bulunya yang hitam dengan bintik-bintik putih kecil dengan leher dan kepala tidak berambut.Selain itu ayam guinea bersuara nyaring.", R.drawable.ayam_mutiara));
        return ayams;
    }
    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataAyam(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}

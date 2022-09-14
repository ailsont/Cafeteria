package br.com.etecia.myplantas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class PlantasFragment extends Fragment {
    ListView ltsplantas;

    //criando os vetores com os dados para a lista
    String nomePlantas[] = {"Azedinha", "Beldroega", "Bertalha", "Coração de bananeira", "Dente-de-leão", "Folhas de batata-doce", "Ora-pro-nobis", "Peixinho", "Serralha", "Taioba"};
    String descricaoPlantas[] = {
            "Também chamada de erva-vinagreira, é uma das PANCs mais famosas...",
            "A beldroega também é uma PANC comum e famosa por seus usos medicinais...",
            "A bertalha é uma trepadeira conhecida também como espinafre-indiano, por causa da...",
            "Também conhecido como mangará, o coração de bananeira é a parte da...",
            "Provavelmente você já soprou um dente-de-leão para ver suas sementes...",
            "A batata-doce é bem comum na mesa dos brasileiros, mas dificilmente...",
            "Popular no estado de Minas Gerais, a planta é uma ótima fonte de fibras...",
            "Suculenta e de cor verde-prateada, costuma-se consumir a PANC frita...",
            "A serralha é uma planta muito parecida com o dente-de-leão...",
            "A Taioba é comumente chamada de orelha de elefante por conta ..."
    };
    String numPlantas[] = {"9.0", "8.0", "9.0", "9.5", "10.0", "6.0", "8.5", "10.0", "8.5", "7.0"};
    int imagemPlantas[] = {R.drawable.azedinha, R.drawable.beldroega, R.drawable.bertalha, R.drawable.bananeira, R.drawable.dente_de_leao, R.drawable.batata_doce, R.drawable.ora_pro_nobis,
            R.drawable.peixinho, R.drawable.serralha, R.drawable.taioba};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_plantas, container, false);

        ltsplantas = view.findViewById(R.id.idListaplantas);

        MyAdapterPlantas adapterPlantas = new MyAdapterPlantas();

        ltsplantas.setAdapter(adapterPlantas);


        return view;
    }

    public class MyAdapterPlantas extends BaseAdapter {
        @Override
        public int getCount() {
            return imagemPlantas.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView imgPlantas;
            TextView txtNomeplantas, txtDescricaoplantas, txtNumplantas;
            LinearLayout layoutPlantas;

            View view1 = getLayoutInflater().inflate(R.layout.modelo_plantas, null);
            txtNomeplantas = view1.findViewById(R.id.txtNomeplantas);
            txtDescricaoplantas = view1.findViewById(R.id.txtDescricaoplantas);
            txtNumplantas = view1.findViewById(R.id.txtNumplantas);
            imgPlantas = view1.findViewById(R.id.imgModeloplantas);

            txtNomeplantas.setText(nomePlantas[i]);
            txtDescricaoplantas.setText(descricaoPlantas[i]);
            txtNumplantas.setText(numPlantas[i]);
            imgPlantas.setImageResource(imagemPlantas[i]);

            return view1;

        }


    }
}
